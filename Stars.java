import java.util.Scanner;
public class Stars{
	public static void main(String[] args) {
	//拆解需求，化繁为简
	//1、先打印一个矩形
	//2、打印半个金字塔
	//3、打印整个金子塔，*数量=层数*2-1，空格=总层数-1，
	//4、打印空心的金字塔，空格不变，输出了当前行的第一个位置和最后一个位置为*，

		//优化
		//5、把层数做成一个变量

		Scanner myScanner = new Scanner(System.in);

		System.out.println("请输入金字塔的层数");

		int totalLevel = myScanner.nextInt();

		for (int i = 1; i <= totalLevel ; i++ ){//i表示层数
			//控制打印每层*的个数
			//输出*号之前，好需要输出空格，对应空格=总层数-当前层

			for (int k = 1;k<=totalLevel-i ;k++) {
			
			System.out.print(" ");}

			for (int j = 1;j<=2*i-1 ;j++ ) {
				//当前行第一个位置是*，最后一个位置也是*，其他为空格。最后一层全部*
				
		if (j==1||j==2*i-1||i==totalLevel) {

			System.out.print("*");
		}else{
			System.out.print(" ");//其他情况输出空格
		}
		} System.out.println("");
		//每打印一层的*后换行。


}


	}
}