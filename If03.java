import java.util.Scanner;

public class If03{
	public static void main(String[] args){
	
	Scanner myscanner = new Scanner(System.in);

	System.out.println("保国同志的芝麻信用分（1-100）");

	//先对输入的信用分，进行一个范围的有效判断，1-100，否则提示输入错误
	//如果输入的不是整数，而是hello等，
	//可以使用异常机制处理。
	int grade = myscanner.nextInt();

	if (grade>=1&&grade<=100) {

	if(grade>=100){
		System.out.println("信用极好");
	}else if (grade>80&&grade<=99) {//信用分为[80，99]时，输出信用优秀
		System.out.println("信用优秀");
	}else if (grade>=60&&grade<=80) {//信用分为[60,80]时，输出，信用一般
		System.out.println("信用一般");
	}
	else{
		System.out.println("信用不及格");}
	} else{

		System.out.println("信用分需要在1-100，请重新输入：）");

	}//双分支嵌入了一个多分支。

	boolean b = true;
	//if (b == false) //答案为b
	if (b = false){//答案为c，！b=b的取反，因此b=ture，
	 System.out.println("a");
	}else if(b){
			System.out.println("b");
		}else if(!b){ //取反，b=false取反，b=ture，故输出c
		System.out.println("c");
			}else {System.out.println("d");	
				}//只要找到一个执行路口，程序就结束了。
				 
			}
			}