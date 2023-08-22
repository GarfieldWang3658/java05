import java.util.Scanner;
public class NestedIf{
	public static void main(String[] args) {
	
	//思路分析，
	//1、创建Scanner对象
	//2、接收一个成绩保存到double score
	//3、使用if - else 判断
	//4、如果进入决赛再接收一个char，再使用if-else，输出相应信息。


	Scanner myScanner = new Scanner(System.in);

	System.out.println("请输入该歌手的成绩");

	double score = myScanner.nextDouble();

	if (score>8.0) {
		System.out.println("请输入性别");

		char gender = myScanner.next().charAt(0);
		//把字符串转成字符char，含义是指把字符串的第一个字符得到。
		//得到第一个字符。
		if (gender == '男') {
			System.out.println("进入男子组");
		}else if (gender == '女') {
			System.out.println("进入女子组");
			} else { 
				System.out.println("你的性别有误，不能参加决赛");}
			
		} else {
		System.out.println("sorry，你被淘汰～");}
	}
}