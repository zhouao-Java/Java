
public class EqualDemo {
	public static void main(String args[]){
		String s1,s2;
		s1=new String("天道酬勤");
		s2=new String("天道酬勤");
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		String s3,s4;
		s3="勇者无敌";
		s4="勇者无敌";
		System.out.println(s3.equals(s4));
		System.out.println(s3==s4);
	}

}
