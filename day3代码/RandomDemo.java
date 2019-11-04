import java.util.Random;
public class RandomDemo{
	public static void main(String[] args){
	   //	2. 公式: 创建出Random类型的变量
	   Random ran = new Random();
	   // 3. 变量. 调用Random类中的功能,产生随机数
	   // Random类中的,产生随机数的功能
	   int i = ran.nextInt(100);
	   System.out.println(i);
	   
	   //问题? 产生随机数,范围 1-100之间
	   // nextInt(100) 0-99 + 1
	   
	   
	   double d = ran.nextDouble();
	   System.out.println(d);
	}
}