package stringbulider_ex;

import java.util.ArrayList;

public class StringBuilder_for {

//	�ڹٿ��� String ��ü�� ���� �Ұ����ϴ�. �� �� �����Ǹ� ������ �ٲ� �� ���� ���̴�. ���� �ϳ��� ���ڿ��� �ٸ� ���ڿ��� �����ϸ� �� ���ڿ��� �����ǰ�, ���� ���ڿ��� ������ �÷��ͷ� ����.
//	100�� ���� ���ڿ��� �����ؾ� �ϴ� ��Ȳ�� �Դٰ� ��������. �׸��� 100�� ���� ���ڿ��� �߰��� �����ߴٰ� ����.
//	���ڿ����� �����ϴ� �۾� �ÿ��� ���������� ���� �۾��� �߻��ϰ�, ���� ���ڿ� ���� ���̿� �߰��� ���ڿ��� ũ�⸦ ���� ũ���� 
//	���ο� ���ڿ��� �����ȴ�. �̰� 100�� �� �����ؾ� �ϴ� �޸𸮸� ���� ��Ƹ԰� �Ǵ� �� ����� �׷��� �ǰڱ��� �ʹ�.
//	�� ��� ����غ� �� �ִ� �� �� �ϳ��� �� �������� ������ StringBuilder��. Stirng�� ���� �Ұ����� ���ڿ��� ���������� 
//	StringBuilder�� ���� ������ ���ڿ��� ����� �ֱ� ������, String�� ��ġ�� �۾� �� �ϳ��� ����� �� �� �ִ�.
	
	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("���ڿ� ").append("����");
//        String str = stringBuilder;   // String�� StringBuilder�� �״�� ���� �� ����. toString()�� �ٿ��� �Ѵ�
        String str = stringBuilder.toString();
        // �� println()�� ���� ���� ����Ѵ�
        System.out.println(stringBuilder);
        System.out.println(str);
        
        System.out.println();
        
//        �ݺ������� StringBuilder�� ����Ѵٸ� �Ʒ��� ���� ����� �� �ִ�.
        
        StringBuilder stringBuilder1 = new StringBuilder();
        ArrayList<String> list = new ArrayList<>();
        list.add("ù ��°, ");
        list.add("�� ��°, ");
        list.add("�� ��°, ");
        list.add("�� ��°, ");
        list.add("�ټ� ��°");
        for (int i = 0; i < list.size(); i++)
        {
            stringBuilder1.append(list.get(i));
        }
        System.out.println(stringBuilder1);
	}

}
