public class SwitchDetail{
	public static void main(String[] args) {
// 1、表达式的数据类型，应和case后的常量【类型一致】，或者是【可以自动转成可以互相比较的类型】，比如输入的是字符，而常量是int，类型不匹配，无法进行比较。
// 2、swtich（表达式）中表达式的返回值必须是：（byte、short、int、char、enum【枚举】、String）
// 3、case 子句中的值必须是常量，而不能是变量
// 4、default子句是可选的，当没有匹配的case时，执行default，如果没有default子句，也没有匹配任何常量，则没有输出。
// 5、break语句用来执行完一个case分支后，是程序跳出switch语句块，如果没有break语句，程序会顺序执行到swtich的结尾，除非遇到break语句。

		char c = 'a';
		switch(c){
		case 'a':
			System.out.println("ok1");
			//break;
		case 'b':
			System.out.println("ok2");
			break;
		case 'c':
			System.out.println("ok3");
			break;
		default:
			System.out.println("ok3");

		}

		System.out.println("退出了switch，继续执行...");


	}
}