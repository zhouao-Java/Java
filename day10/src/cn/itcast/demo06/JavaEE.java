package cn.itcast.demo06;

public class JavaEE extends Develop{
	//重写他父类的父类的抽象方法
	public void work(){
		//调用父类的get方法,获取name,id值
		System.out.println("JavaEE的工程师可以开发淘宝"+ super.getName()+".."+super.getId());
	}
}
