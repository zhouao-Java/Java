package cn.itcast.demo03;
public class AndroidPhone extends Phone{
      public void showNum(){
    	  //父类的中的方法showNum已经可以号码,子类直接用
    	  super.showNum();
    	  System.out.println("显示姓名");
    	  System.out.println("显示大头像");
      }
}
