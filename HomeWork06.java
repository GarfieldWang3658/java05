public class HomeWork06{
	public static void main(String[] args) {

		//输出1-100
		//输出不能被5整除的数
		//过滤出
		//每5个换行，用计数器

		int n =0;
		int count =0;
		for (int i=0;i<=100 ;i++){
		 if (i%5!=0) {
		 	System.out.print(i+" ");
		 	count++;
		 	if (count % 5 == 0) {
		 		System.out.println("");
		 	}


		 	
		 }
		}
			
		}
	}