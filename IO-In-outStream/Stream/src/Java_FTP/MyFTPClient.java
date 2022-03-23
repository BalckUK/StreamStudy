package Java_FTP;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.SocketException;
import java.util.Scanner;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;


/*
 * commons-net3.6jar ���� �ٿ�ε� ��ũ
 * https://mvnrepository.com/artifact/commons-net/commons-net/3.6
 * */

public class MyFTPClient {

	static FTPClient ftpClient = new FTPClient();

	public MyFTPClient() {
	}

	public static void main(String[] args) {
		try {
			mainProc();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}// end main()

	public static void doConnect() {
		Scanner sc = new Scanner(System.in);
		try {
			// ��Ʈ�� ���� �޼ҵ忡�� �ۿ� ������ �����Ƿ� ���������� ����.
			int port = 5033;
			System.out.print("FTP���� �ּ� �Է�: ");
			String server = sc.next();
			// FTPServer�� Connect���� ����
			ftpClient.connect(server, port);
			// ������ ���������� Ȯ�� �ϱ� ���� ���� �޾ƿ���
			int replyCode = ftpClient.getReplyCode();
			// �������� ������ �������� Ȯ��
			if (FTPReply.isPositiveCompletion(replyCode)) {
				System.out.println(server + "�� ����Ǿ����ϴ�.");
				System.out.println(ftpClient.getReplyCode() + " SUCCESS CONNECTION.");
			}
		} catch (SocketException e) {
			System.out.println("���� ���� ����");
			System.exit(1);

		} catch (IOException e) {
			System.out.println("���� ���� ����");
			System.exit(1);
		}

	}// end doConnect()

	// FTP���� �α���
	public static boolean doLogin() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("�����: ");
			String id = sc.next();
			System.out.print("��ȣ: ");
			String pw = sc.next();
			boolean success = ftpClient.login(id, pw);
			if (!success) {
				System.out.println(ftpClient.getReplyCode() + " Login incorrect.");
				System.exit(1);
			} else {
				System.out.println(ftpClient.getReplyCode() + " Login successful.");
			}
		} catch (IOException e) {
			System.out.println(ftpClient.getReplyCode() + " Login incorrect.");
			return false;
		} finally {
		}
		return true;
	}// end doLogin()

	// mainProc �޼ҵ�
	// Ftp�� ��� �޴��� ����Ͽ� �ش�Ǵ� ó���� ȣ���Ѵ�.
	public static void mainProc() throws IOException {
		boolean command = true;
		try {
			// ��������
			doConnect();
			// �α���
			doLogin();
			while (command) {
				// �޴����
				showMenu();
				// ����� �޾Ƽ� ó���Ѵ�.
				command = exeCommand(getCommand());
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}// end mainProc()

	// getCommand �޼ҵ�
	// �̿��ڰ� ������ ��� ��ȣ�� �о� ó���Ѵ�.
	public static String getCommand() {
		String buf = "";
		BufferedReader lineRead = new BufferedReader(new InputStreamReader(System.in));
		// �ѱ���, �α��� ��ɾ� �Է��� ���� ������ �ݺ��Ѵ�.
		while (buf.length() != 1 && buf.length() != 2) {
			try {
				buf = lineRead.readLine();
			} catch (Exception e) {
				e.printStackTrace();
				System.exit(1);
			} finally {
				if (lineRead != null) {
					try {
						lineRead.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
		return (buf);
	}// end getCommand()

	// showMenu �޼ҵ�
	// FTP�� ��� �޴��� ����Ѵ�.
	public static void showMenu() {
		System.out.println("��ɾ �ش��ϴ� ��ȣ �Է�>");
		System.out.print("1 ls");
		System.out.print("    2 dir");
		System.out.print("    3 cd");
		System.out.print("    4 put");
		System.out.print("    5 get");
		System.out.print("    6 mkdir");
		System.out.print("    7 rmdir");
		System.out.print("    8 delete");
		System.out.print("    9 append");
		System.out.println("    10 binary");
		System.out.print("11 status");
		System.out.print("    12 pwd");
		System.out.print("    13 ascii");
		System.out.println("    14 quit");
	}// end showMenu()

	// execCommand �޼ҵ�
	// ��ɿ� �����ϴ� �� ó���� ȣ���Ѵ�.
	public static boolean exeCommand(String command) {
		boolean com = true;
		switch (Integer.parseInt(command)) {
		case 1:
			doLs();// ��Ϻ���
			break;
		case 2:
			doDir();// ��Ϻ���
			break;
		case 3:
			doCd();// ���丮 �̵�
			break;
		case 4:
			doPut();// ������ ���� ����
			break;
		case 5:
			doGet();// �����κ��� ���� �ٿ�ε�
			break;
		case 6:
			doMkdir();// ���丮 ����
			break;
		case 7:
			doRmdir();// ���丮 ����
			break;
		case 8:
			doDelete();// ���� �����
			break;
		case 9:
			doAppend();// ���� ���̱�
			break;
		case 10:
			doBinary();// ���̳ʸ� ���� ���
			break;
		case 11:
			doGetStatus();// ���º���
			break;
		case 12:
			doPwd();// ���� �۾����� ���丮 ����
			break;
		case 13:
			doAscii();// �ƽ�Ű ���� ���
			break;
		case 14:
			doQuit();// ��������
			com = false;
			break;
		default: // �� �̿��� �Է� ó��
			System.out.println("�߸��� ��ȣ�� �����ϼ̽��ϴ�. �ٽ� ����ּ���.");
		}
		return (com);
	}// end exeCommand()

	public static String[] doLs() {
		String[] files = null;
		try {
			files = ftpClient.listNames();
			for (int i = 0; i < files.length; i++) {
				System.out.println(files[i]);
			}
		} catch (IOException e) {
			System.out.println("������ ���� ���� ����Ʈ�� �������� ���߽��ϴ�.");
		}
		return null;
	}// end doLs()

	public static FTPFile[] doDir() {
		FTPFile[] files = null;
		try {
			files = ftpClient.listFiles();
			for (int i = 0; i < files.length; i++) {
				System.out.println(files[i]);
			}
		} catch (IOException e) {
			System.out.println("������ ���� ���丮�� �������� ���߽��ϴ�.");
		}
		return null;
	}// end doDir()

	public static void doCd() {
		BufferedReader lineRead = new BufferedReader(new InputStreamReader(System.in));
		String path = "";
		System.out.print("���� �̵��Ͻðڽ��ϱ�?");
		try {
			path = lineRead.readLine();
			ftpClient.changeWorkingDirectory(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}// end doCd()

	public static void doPut() {
		// ���⿡ �ִ� ������ �������� ���ε�
		File putFile = new File("C:\\Users\\solulink", "window.txt");
		String fileName = "";
		BufferedReader lineRead = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("������ ���ε� �� ���� �̸��� �Է��ϼ���: ");
		InputStream inputStream = null;
		try {
			// PUT�� ���ϸ� �Է�
			fileName = lineRead.readLine();
			inputStream = new FileInputStream(putFile);
			ftpClient.storeFile(fileName, inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} catch (Throwable e) {
			e.printStackTrace();
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();// close�� ���� �ʴ´ٸ�, ���߿� �ý��ۺ��ϰ� �Ͼ���̾�.
					// �̷������� ������ �༭ finally�������� ������ ���ٷ� close()�� ����.
				} catch (IOException e1) {
				}
			}
		}
	}// end doPut()

	public static void doGet() {
		// �̰���� ���� �̸�����, �����
		File getFile = new File("C:\\Users\\solulink\\centos.txt");
		String fileName = null;
		BufferedReader lineRead = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("������ ���� �ٿ�ε� �� ���� �̸��� �Է��ϼ���: ");
		OutputStream outputStream = null;
		try {
			// GET�� ���ϸ� �Է�
			fileName = lineRead.readLine();
			outputStream = new FileOutputStream(getFile);
			ftpClient.retrieveFile(fileName, outputStream);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (outputStream != null) {
				try {
					outputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}// end doGet()

	public static void doAppend() {
		// append a b -> b�� a������ ������.
		Scanner sc = new Scanner(System.in);
		String pathName = "";
		System.out.println("append a b -> b�� a������ ������.");
		System.out.print("a�����Է�: ");
		pathName = sc.nextLine();
		// File appendFile = new File("C:\\Users\\solulink\\window.txt");//
		// window.txt������ ���� �Է��� ���Ͽ� append�Ѵ�.
		File appendFile = new File(pathName);
		String fileName = "";
		BufferedReader lineRead = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("b�����Է�: ");
		InputStream inputStream = null;
		try {
			fileName = lineRead.readLine();
			inputStream = new FileInputStream(appendFile);
			ftpClient.appendFile(fileName, inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
					sc.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}// end doAppend()

	public static void doMkdir() {//���丮 ���� �޼ҵ�
		BufferedReader lineRead = new BufferedReader(new InputStreamReader(System.in));
		String directoryName = "";
		try {
			System.out.print("������ ���丮 �̸� �Է� :");
			directoryName = lineRead.readLine();
			ftpClient.makeDirectory(directoryName);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}// end doMkdir()

	public static void doRmdir() {
		BufferedReader lineRead = new BufferedReader(new InputStreamReader(System.in));
		String directoryName = "";
		try {
			System.out.print("������ ���丮 �̸� �Է� :");
			directoryName = lineRead.readLine();
			ftpClient.removeDirectory(directoryName);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}// end rmMkdir()

	public static void doDelete() {
		BufferedReader lineRead = new BufferedReader(new InputStreamReader(System.in));
		String fileName = "";
		try {
			System.out.print("������ ���� �Է�: ");
			fileName = lineRead.readLine();
			ftpClient.deleteFile(fileName);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}// end doDelete()

	public static void doBinary() {
		try {
			ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
			System.out.println(ftpClient.getReplyCode() + " Switching to Binary mode.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}// end doBinary()

	public static void doAscii() {
		try {
			ftpClient.setFileType(FTP.ASCII_FILE_TYPE);
			System.out.println(ftpClient.getReplyCode() + " Switching to ASCII mode.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void doGetStatus() {
		try {
			System.out.println(ftpClient.getStatus());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}// end doGetStatus()

	public static void doQuit() {
		try {
			ftpClient.disconnect();
			System.out.println(ftpClient.getReplyCode() + " Goodbye.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}// end doQuit()

	public static void doPwd() {
		try {
			String pwd = ftpClient.printWorkingDirectory();
			System.out.println(pwd);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}// end doPwd()

}// end class