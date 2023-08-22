public class HomeWork01{
	public static void main(String[] args) {

		//1、定义double money保存100000
		//2、根据题目要求，分析三种情况，1）money>50000,2)money<=50000,3)money>=1000
		//3、使用多分支 if - else if - else
		//4、while+break{money<1000},同时使用一个变量count来保存通过路口
		int count = 0;
		double pay=0;
		double money=100000;

		while(true){
			if(money>50000){
				money*=0.95;
				count++;
				System.out.println("剩余现金"+money+"经过路口"+count+"次");
			}else if (money>=1000) {//money<=50000可以省略。
				money-=1000;
				count++;
				System.out.println("剩余现金"+money+"经过路口"+count+"次");

			}else {break;
				
			
		}System.out.println("剩余"+money+"，100000可以过"+count+"次路口");
			}

			}
		}
		