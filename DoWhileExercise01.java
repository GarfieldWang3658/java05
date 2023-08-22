public class DoWhileExercise01{
	public static void main(String[] args) {
		int i = 1;
		int sum  = 0;
		do{
			System.out.println("i="+i);
			i++;
			sum +=i ;
			

		}while(i<=100);
		System.out.println("Sum="+sum);

		//1)输出1-200
		//2）过滤，能被5整除，不能被3整除。

		//范围值可以做成变量，5和3也可以改为变量。

		int n = 1;
		int count = 0;
		int c = 200;
		int a = 5;
		int b = 3;
		do{
			if(n%a==0 && n%b!=0){
		System.out.println("n="+n);
		count++;
	}
		n++; 

		}while(n<=c);
		System.out.println("Count="+count);
	}
}