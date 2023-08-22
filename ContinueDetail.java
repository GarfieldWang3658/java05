public class ContinueDetail{
	public static void main(String[] args) {
		
		label1:
		for (int j = 0;j<4 ;j++ ) {

			label2:
			for (int i =0;i<10 ;i++ ) {

				if(i==2){

					//continue;如果没有任何标签，等价于返回label2（上一个层级）
					continue label1;//i输出2次0，1
					//continue label2;//等价于continue无标签

				}
				System.out.println("i="+i);//输出4次013456789
			}
			
		}

	}
}