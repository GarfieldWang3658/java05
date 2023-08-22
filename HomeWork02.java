import java.util.Scanner;
public class HomeWork02{
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);

		System.out.println("请输入数字");

		double num = myScanner.nextDouble();

		if (num>0) {
			System.out.println("大于0的范围");
			
		}else if(num<0){
				System.out.println("小于0的范围");
		}else {
				System.out.println("等于0");
		}





	}
}