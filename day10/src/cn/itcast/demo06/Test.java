package cn.itcast.demo06;
public class Test {
	public static void main(String[] args) {
		JavaEE ee = new JavaEE();
		Network net = new Network();
		
		ee.setName("����");
		ee.setId("�з���001");
		
		net.setName("����");
		net.setId("ά����007");
		ee.work();
		net.work();
	}
}
