public class IfExercise{
	public static void main(String[] args){
		int x = 7;
		int y = 4;
		if (x>5) {//对 
			if (y>5) { //错
				System.out.println(x+y);//不执行
			}
			System.out.println("韩顺平教育～");//执行输出

		}else {
			System.out.println("x is"+ x );//不输出，执行了if的代码块，所以else不执行。
		}


		double d1 = 15.0;
		double d2 = 3.5;

		if(d1>10.0 && d2<20.0){

			System.out.println("两数之和="+(d1+d2));
		}

		//思路：
		//1、定义两个变量int a，b
		//2、判断两个数的和，定义一个变量 int sum = a+b
		//3

		int a = 10;
		int b = 5;
		int sum = a+b;

		if (sum%3 == 0 && sum%5 == 0 ) {

			System.out.println("和可以被3又能被5整除");
			
		}else{

			System.out.println("和不能被3和5整除");}

		//思路分析，判断一个年份是否为闰年，闰年的条件是符合以下二者之一，
		//1、年俸能被4整除，但不能被100整除，2、能被400整除
			//思路分析
			//1、定义int yaer 保存年份
			//2、年份能被4整除，year%4=0,year%100!=0,
			//3、yaer%400=0,
			//2和3是逻辑或的关系，【满足下面两者之一】
			int year = 2048;
			if ((year%4==0 && year%100!=0)||year%400 == 0 ) {
			 	System.out.println(year +"是闰年");
			 				 } else {System.out.println(year+"不是闰年");
			 				}
		}
	}




