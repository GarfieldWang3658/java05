import java.util.Scanner;
public class HomeWork03{
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);

		System.out.println("请输入年份");

		int year = myScanner.nextInt();

		if (year % 4 == 0) {
			System.out.println(year+"是闰年");
			
		}else {
			System.out.println(year+"是平年");
		}



	}
}