package cn.itcast.demo04;
//定义一个子类继承父类
public class JavaEE extends Develop{
	//重写父类的抽象方法
	//去掉abstract修饰符,加上方法主体
	public void work(){
		System.out.println("JavaEE工程师在开发B/S 软件");
	
	}
}
