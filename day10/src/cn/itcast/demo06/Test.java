package cn.itcast.demo06;
public class Test {
	public static void main(String[] args) {
		JavaEE ee = new JavaEE();
		Network net = new Network();
		
		ee.setName("张三");
		ee.setId("研发部001");
		
		net.setName("李四");
		net.setId("维护部007");
		ee.work();
		net.work();
	}
}
