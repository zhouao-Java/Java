import java.util.Scanner;
public class ScannerDemo{
	public static void main(String[] args){
		// 类型  变量名 = new 类型();
		// 创建出Scanner,类变量
		Scanner sc = new Scanner(System.in);
		//变量.功能名字() 接受键盘输入
		// 功能: nextInt() 接受键盘输入,保证输入的是整数
		// 功能接受的数据就是整数,功能运行后的结果就是整数类型
		int i = sc.nextInt();
		System.out.println(i);
		
		//Scanner类的另一个功能    next() 接受键盘输入的字符串
		
		String s = sc.next();
		System.out.println(s);
	}
}




