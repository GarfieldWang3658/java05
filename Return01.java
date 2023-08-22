public class Return01{
	public static void main(String[] args) {
		for (int i = 1;i<=5 ;i++ ) {
			if (i==3) {

				System.out.println("韩顺平教育"+i)；
				return；//当return用在方法时，表示跳出方法，如果使用在main（主方法），表示退出程序
				//return的情况，输出 H H 教3
				//continue； //H H 教3 H H H go on
				//break；退出for循环，输出 H H 教3 go on
			}

			System.out.println("Hello World!");


		}
		System.out.println("go on ...");
	}
}