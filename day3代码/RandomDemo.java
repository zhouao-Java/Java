import java.util.Random;
public class RandomDemo{
	public static void main(String[] args){
	   //	2. ��ʽ: ������Random���͵ı���
	   Random ran = new Random();
	   // 3. ����. ����Random���еĹ���,���������
	   // Random���е�,����������Ĺ���
	   int i = ran.nextInt(100);
	   System.out.println(i);
	   
	   //����? ���������,��Χ 1-100֮��
	   // nextInt(100) 0-99 + 1
	   
	   
	   double d = ran.nextDouble();
	   System.out.println(d);
	}
}