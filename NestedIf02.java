import java.util.Scanner;
public class NestedIf02{
	//淡旺季做双分支
	//旺季多分支，可以处理三种情况
	//在淡季中嵌套一个双分支
	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);

		System.out.println("请输入几月（1-12）");

		int month = myScanner.nextInt();

		if (month>=4&& month<=10) {

			System.out.println("请输入年龄(几岁)");
			
			int age = myScanner.nextInt();

			if (age>=18&&age<=60) {
				System.out.println("成人票60元");
				
			}else if (age<18) {
				System.out.println("儿童票半价");
				
			}else if (age>60) {
				System.out.println("老年票票价的1/3");
			}
		}else{
			System.out.println("请输入年龄(几岁)");

			int age = myScanner.nextInt();

			if (age >=18 && age <=60) {
				System.out.println("成人票40元");
				
			}else{
				System.out.println("其他票20元");
			}
		}

	}
}