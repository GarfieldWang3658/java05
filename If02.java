import java.util.Scanner;//导入

public class If02{
	public static void main(String[] args){

	Scanner myScanner = new Scanner(System.in);

		System.out.println("请输入年龄");
		//把年龄保存到变量int age

		int age = myScanner.nextInt();
		//把年龄保存到变量 int age

		if (age > 18) {
			System.out.println("你年龄大于18，要对自己行为负责，送入监狱");
			
		}else{System.out.println("你年龄不大，这次放过你了");//双分支。
			

		}

		System.out.println("程序继续....");



}
}
