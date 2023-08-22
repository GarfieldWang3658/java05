import java.util.Scanner;
public class Stars02{
	public static void main(String[] args) {
		

		Scanner myScanner = new Scanner(System.in);

		System.out.println("请输入菱形的层数");

		int totalLevel = myScanner.nextInt();

		for (int i = 1; i <= totalLevel ; i++ ){//i表示层数
			//控制打印每层*的个数
			//输出*号之前，好需要输出空格，对应空格=总层数-当前层

			for (int k = 1;k<=totalLevel-i ;k++) {
			
			System.out.print(" ");}

			for (int j = 1;j<=2*i-1 ;j++ ) {
				//当前行第一个位置是*，最后一个位置也是*，其他为空格。
				
		if (j==1||j==2*i-1) {

			System.out.print("*");
		}else{
			System.out.print(" ");//其他情况输出空格
		}
		} System.out.println("");
		//每打印一层的*后换行。
	}
}
}
