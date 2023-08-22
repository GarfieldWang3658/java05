import java.util.Scanner;
public class Swtich01{
	public static void main(String[] args) {

		//思路
		//1、接收一个字符
		//2、
		//3、
		
	Scanner myScanner = new Scanner(System.in);
	
	System.out.println("请输入一个字符（a-g）");	

	char c1 = myScanner.next().charAt(0);
	//在java中，只有是有值返回，就s是一个表达式

	switch(c1){
		case 'a':
			System.out.println("今天是星期一");
			break;
		case 'b':
			System.out.println("今天是星期二");
			break;
		case 'c':
			System.out.println("今天是星期三");
			break;
		case 'd':
			System.out.println("今天是星期四");
			break;
		case 'e':
			System.out.println("今天是星期五");
			break;
		case 'f':
			System.out.println("今天是星期六");
			break;
		case 'g':
			System.out.println("今天是星期天");
			break;
		default:
			System.out.println("你输入的字符不正确，没有匹配的日期");

	}

	System.out.print("退出了switch，继续执行程序");


	}
}