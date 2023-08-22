import java.util.Scanner;
public class HomeWork04{
	public static void main(String[] args) {
		//水仙花数
		//1、定义一个数值
		//2、得到数值的百位，十位、个位，使用if判断他们的立方和。
		//3、百位 /=100，
		//4、十位 %100 => /=10,
		//5、个位 %10
		//判断
		Scanner myScanner=new Scanner(System.in);
		
		System.out.println("请输入数字(三位数)");

		int i = myScanner.nextInt();

		int a = i/100;

		int b = i%100/10;

		int c = i%10;

		if (a*a*a+b*b*b+c*c*c==i) {

			System.out.println(i+"是水仙花数字");
		 	
		 } else {

		    System.out.println(i+"不是水仙花数字");

		 }

	}


}