import java.util.Scanner;
public class IfHomeWork{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("请输入月份（1-12）");

		int month = myScanner.nextInt();


		System.out.println("请输入年龄");

		int age = myScanner.nextInt();

		if (month>=4&&month<=10) {
			if (age>=18&&age<=60) {
			System.out.println("成人票60元");
			}	
			if (age<18){ 
			System.out.println("儿童票半价");

				
			}if (age>60) {
				
				System.out.println("老年票1/3");
			}
		 }else if (age>=18&&age<=60) {
			System.out.println("票价40元");

			}else {
			System.out.println("票价20元");

			}
			
		}




	}