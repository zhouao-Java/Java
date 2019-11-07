package cn.itcast.demo01;

public class Test {
	public static void main(String[] args) {
		//定义一个类型为develop的研发类的员工变量;
		Develop d = new Develop();
		d.name = "张三";
		d.print();
		d.work();
		//定义一个类型为weihu的维护类的员工变量;
		WeiHu w = new WeiHu();
		w.name = "李四";
		w.print();
		w.work();
	}
}
