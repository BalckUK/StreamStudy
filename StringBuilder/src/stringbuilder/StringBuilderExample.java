package stringbuilder;

public class StringBuilderExample {
	
//	StringBuilder�� StringBuffer Ŭ������ String Ŭ������ ���� ���ڿ��� �ٷ�� Ŭ�����Դϴ�. 
//	�ٸ�, String Ŭ������ ���ڿ��� �����ڷ� �־� �ν��Ͻ��� �� �� �����ϰ� ���� �ν��Ͻ��� ���� ���ڿ� ���� �������� 
//	���ϴ� ������ ������ Ŭ�����Դϴ�. ��, ���� �ν��Ͻ� ���� ���ڿ�(char �迭) �ʵ� ���� �߰��ϰų� 
//	������ �� �ֵ��� �Ǿ� �ֽ��ϴ�. 
//	���� ���� ���ڿ��� �ٲ� �� �ִ¸�ŭ ���ڿ��� �ٷ�� �޼ҵ嵵 �� ���� ���ԵǾ� �ֽ��ϴ�.
	
//	�� ���� Ŭ������ ��� ���Ӱ� �޼ҵ尡 ������, StringBuffer�� 
//	���������� ���ÿ� ���� ���ڿ� �ν��Ͻ��� ������ �� �ߺ� ������ ���� �� �ִ� ��ġ�� �Ǿ� �ֽ��ϴ�(����ȭ ó��). 
//	������ StringBuilder�� ���� �� �� ���̽��ϴ�. 
//	���� Ư���� ������ ���ٸ� StringBuilder�� ����ϴ� ���� �Ϲ����Դϴ�.
	
	
//	[ String Ŭ������ ���� �޼ҵ� ]
//
//	charAt() - Ư�� �ε��� ��ġ�� ���� ��ȯ
//	indexOf() / lastIndexOf() - ���ڿ� �˻��ؼ� ��ġ ��ȯ
//	length() - ���ڿ� ���� ��ȯ
//	replace() - �˻��� ���ڿ� ��ü
//	substring() - Ư�� �ε��� ���� �� ���ڿ��� �����ؼ� ���� ������ �ν��Ͻ� ��ȯ
//	toString() - ���ڿ� ���
	
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		
		builder.append(" World");
		System.out.println(builder);
		
	}
}
