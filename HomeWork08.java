public class HomeWork08{
	public static void main(String[] args) {
		//1、1-1/2+1/3-1/4。。。。
		//2、分子为1，分母一共100个数
		//（1）一共100个数
		//（2）分母为奇数时，是+，为偶数时为+
		//3、可以用for循环和if判断
		//4、把和存放在double变量 sum中
		//隐藏条件，要把公式的分子写到1.0才能保留精度，才能得到精确小数。
		double i = 1.0;
		double sum=0.0;
		int count =0;
		for (int j = 1;j <= 100 ;j++ ) {
			if (j % 2 != 0) {
			sum+=i/j;

			 }else{

			sum-=i/j;
		}
			count++;

			System.out.println("总和为"+sum+" "+count);
		}
		


	}
}