import java.util.Scanner;
public class SwitchExercise{
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);

		System.out.println("请输入字母（a、b、c、d、e)");

		char alphabet = myScanner.next().charAt(0);

		switch(alphabet){

		case 'a':
			System.out.println('A');
			break;
		case 'b':
			System.out.println('B');
			break;
		case 'c':
			System.out.println('C');
			break;
		case 'd':
			System.out.println('D');
			break;
		case 'e':	
			System.out.println('E');
			break;
		default:
			System.out.println("你的输入有误");

		}

		//可以用分支结构完成，if else
		//要求使用switch
		//需要进行一个转换，编程思想。
		//如果成绩在【60，100】，（int）成绩/60=1 强转
		//【0，60）


		System.out.println("请输入你的成绩");

		double score = myScanner.nextDouble();  

		if (score>0 && score<=100) {

		switch((int)(score/60)){
		case 1:
			System.out.println("合格");
			break;
		case 0:
			System.out.println("不合格");
			break;
		default:
			System.out.println("输入有误");
		}
	}else {

		System.out.println("输入的成绩请在0-100内");

	}

	System.out.println("请输入几月");

	int month = myScanner.nextInt();

	switch(month){
	case 3:
	case 4:
	case 5:
		System.out.print("春季");
		break;
	case 6:
	case 7:
	case 8:
		System.out.print("夏季");
		break;
	case 9:
	case 10:
	case 11:
		System.out.print("秋季");
		break;
	case 12:
	case 1:
	case 2:
		System.out.print("冬季");
		break;
	default :
		System.out.print("输入的月份不对（1-12）");
	}

	}
}