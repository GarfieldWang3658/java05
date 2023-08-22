import java.util.Scanner;
public class BreakExercise02{
	public static void main(String[] args) {

		//思路分析

		//1、创建Scanner对象接收用户输入
		//2、定义String name；String password；保存用户名和密码；
		//3、循环3次，如果满足条件都退出。
		//4、定义一个变量，int chance，记录还有几次登陆机会，
		
		Scanner myScanner = new Scanner(System.in);


		String name = "";
	

		String password = "";


		 int chance = 3;//登陆一次少一次


		for (int i = 1;i<=3 ;i++ ) {

		    System.out.println("请输入用户名");

		    name = myScanner.next();


			System.out.println("请输入密码");

			password = myScanner.next();
            //比较输入的名字和密码是否正确
            //补充说明，字符串比较，使用方法 equals                             

			label2:

			if ("丁真".equals(name)&&"666".equals(password)) {

				System.out.println("恭喜你登陆成功");
				break; 

			

			}
			chance--;
			System.out.println("你还有"+chance+"次登录机会");
			

			}
			
		}


	}