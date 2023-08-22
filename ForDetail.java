public class ForDetail{
	public static void main(String[] args) {
		//演示for的使用细节

// 		int i = 1;

// 		for (;i<10 ; ) {


// 			System.out.println("hello，韩顺平教育"+i);

// 			i++;
// 		}

// System.out.println("i="+i);//ok i = 11,i通过for循环自增，只有判断为F的时候，for循环结束，

// for(;;){ 
// 	System.out.print("ok~");
// }无限循环，死循环。

         int count = 3;
         for (int i = 0, j = 0;i<count ;i++,j+= 2 ) {
         	System.out.println("i="+i+"j="+j);
         }

	}
}