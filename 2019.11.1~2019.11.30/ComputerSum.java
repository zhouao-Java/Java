import java.util.Scanner;

public class ComputerSum{
	public static void main(String[] args){
		Scanner scanner =new Scanner(System .in );
		int sum=0;
		System.out.println("����һ������");
		while (scanner.hasNextInt()){
			int item=scanner.nextInt();
			sum=sum+item;
			System.out.println("Ŀǰ��"+sum);
			if(sum >= 8000)
				System.exit(0);
			System.out.println("������һ������(�����������������)");
		}
		System.out.println("�ܺ�"+sum);
	}

}
