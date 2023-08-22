public class BreakExercise{
	public static void main(String[] args) {
		//1、循环1-100
		//2、当sum>20时，记录下当前数，然后break
		//3、在for循环外部定义变量n，把当前i赋给n


		int sum = 0;
		
		int n = 0;
		label1:
		for (int i =1;i<=100 ;i++ ) {

			sum +=i;

			label2:

			if (sum>20) { 
				System.out.println("和>20时,当前数="+i);
				n = i;
				break label1;
				
			}
			
		}System.out.println("当前数="+n);

		//System.out.printlm("当前数="+i);注意i的作用域。
	}
}