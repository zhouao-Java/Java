package cn.itcast.demo01;

public class Test {
	public static void main(String[] args) {
		//����һ������Ϊdevelop���з����Ա������;
		Develop d = new Develop();
		d.name = "����";
		d.print();
		d.work();
		//����һ������Ϊweihu��ά�����Ա������;
		WeiHu w = new WeiHu();
		w.name = "����";
		w.print();
		w.work();
	}
}
