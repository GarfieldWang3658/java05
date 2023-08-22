import java.util.Scanner;//导入

public class If01{
	public static void main(String[] args){

		//1、接收输入的年龄，定义一个Scanner对象，
		//2、把年龄保存到一个变量int age
		//3、使用if判断，输出对应的内容

		Scanner myScanner = new Scanner(System.in);

		System.out.println("请输入年龄");
		//把年龄保存到变量int age

		int age = myScanner.nextInt();
		//把年龄保存到变量 int age

		if (age > 18) {
			System.out.println("你年龄大于18，要对自己行为负责，送入监狱");
			
		}

		System.out.println("程序继续....");



	}
}