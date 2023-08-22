public class ForExercise{
	public static void main(String[] args) {
		//1、化繁为简，将复杂的需求拆解成简单的需求，逐步完成。
		//2、先死后火，先考虑固定的值，然后转成可以灵活变化的值。
		//1)完成输出1-100的值
		//2)在输出过程中，进行过滤，只输出9的倍数,i%9=0
		//3)统计个数，定义一个变量，int count = 0；当条件满足时count++
		//4)总和，定义一个变量，int sum = 0；当条件满足时 sum+=i

		//为了适应更好的需求，把范围的开始值和结束值，做出变量
		//更近一步，将9的倍数也做成变量，int t = 9；

		int count = 0;
		int sum = 0;
		int start = 1;
		int end = 200;
		int t = 5;



		for (int i = start;i<=end ;i++ ) {
			if (i % t == 0 ) {
				
			System.out.println("i="+i);
			count ++;
			sum += i;//累积
		}
	}

	System.out.println("Count="+count);
	System.out.println("Sum="+sum);
 




	}
}