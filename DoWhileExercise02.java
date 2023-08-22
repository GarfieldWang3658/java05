import java.util.Scanner;
public class DoWhileExercise02{
	public static void main(String[] args) {
		//1)不停的问还钱吗？
		//2）使用char answer 接收，需要接收，所以要定义一个scanner对象。


		char answer = ' ';
		Scanner myScanner = new Scanner(System.in);



		do{
			System.out.println("老韩使出五连鞭～");
			System.out.println("老韩问：还钱吗？y/n");
			answer = myScanner.next().charAt(0);
			System.out.println("他的回答是"+answer);


		}while(answer!='y');

		System.out.println("李三还钱了");


	}
}