package cn.itcast.demo05;
/*
 *   抽象类,可以没有抽象方法,可以定义带有方法体的方法
 *   让子类继承后,可以直接使用
 */
public  abstract class Animal {
     public void sleep(){
    	 System.out.println("动物睡觉");
     }
}
