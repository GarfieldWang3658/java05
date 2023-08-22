public class HomeWork09{
	public static void main(String[] args) {
		//1、一共100项相加
		//2、每一项的数字在逐渐增加
		//3、很想一个双层循环
		//i可以表示第几项，同时也是当前项的最后一个数。

		//没看解释自己做的
		//↓

		// int sum  = 0;
		// int total =0;

		// for (int i = 1;i<=100;i++ ) {
		// 	sum += i;
		// 	total += sum;

		// }
		// System.out.println(total);

		int sum = 0;
		//i记录循环次数；
		//j在循环中递增；
		//sum记录j的循环递增的总和；

		for (int i = 1;i<=100 ;i++ ) {
			for (int j =1;j<=i ;j++ ) {
			sum +=j;	
			}

		}System.out.println("sum="+sum);
	}
}