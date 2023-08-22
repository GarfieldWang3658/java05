import java.util.Scanner;
public class MulForExercise01{
	public static void main(String[] args) {
		//统计三个班级的成绩情况，每个班级有5名学生，
		//求出各个班级的平均分和所有班级的平均分，
		//统计三个班及格人数，每个班有5名同学。
		//
		//1）先统计一个班的情况。5个学生，使用for
		//1.1)创建一个Scanner对象，接收用户的输入。
		//1.2得到该班级的平均分，定义一个double sum，把该班级5个学生的成绩累积起来。

		//(2)统计3个班，每个班有5学生
		//(3)所有班级的平均分
		//3.1 定义一个变量，double total scroe 累积所有学生的成绩
		//3.2 多重循环结束后，totalscore/3*5

		//(4)统计3个班的及格人数，
		//4.1 定义一个变流，int passNum=0；当有一个学生成绩>=60，passNum++；
		//4.2 如果>=60 passNum++

		//(5)优化 【效率、可读性、结构】


		Scanner myScanner = new Scanner(System.in);


		double totalScore = 0;//累积成绩

		int passNum=0;//累积及格人数
		int classNum = 3; 
		int sutdenNum = 5; 

	

		for (int i = 1;i<= ;i++ ) {

			double sum = 0;	

		for(int j = 1; j<=5 ; j++){
			System.out.println("请输入第"+i+"个班"+j+"个同学的成绩");
			double score = myScanner.nextDouble();


			if (score>=60) {
				passNum++;}

	
			sum +=score;


			System.out.println("成绩为"+score);
			
		
		}//sum是5个学生的总成绩

		System.out.println("sum= " + sum + "平均分="+(sum/5));
		//把sum 累积到totalscore
		totalScore +=sum;
		
		
	}System.out.println("三个班级的总分="+totalScore+"平均分="+totalScore/15);
	System.out.println("及格人数="+passNum);


	}}
