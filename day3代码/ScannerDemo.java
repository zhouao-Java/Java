import java.util.Scanner;
public class ScannerDemo{
	public static void main(String[] args){
		// ����  ������ = new ����();
		// ������Scanner,�����
		Scanner sc = new Scanner(System.in);
		//����.��������() ���ܼ�������
		// ����: nextInt() ���ܼ�������,��֤�����������
		// ���ܽ��ܵ����ݾ�������,�������к�Ľ��������������
		int i = sc.nextInt();
		System.out.println(i);
		
		//Scanner�����һ������    next() ���ܼ���������ַ���
		
		String s = sc.next();
		System.out.println(s);
	}
}




