

public class SXH {

	//编写一个main方法
	public static void main(String[]args) {
		/*
		需求：输出从指定起始值到999以内（包括999）的“水仙花数”
		水仙花数是指一个三位数，其各位数字的立方和等于其本身
		 */
		//1.通过for循环获取是100-999
		for(int i = 100 ; i <= 999 ; i++){
			//2.获取三位数的每一位数字
			int ge = i % 10;
			int shi = i / 10 % 10;
			int bai = i / 10 / 10 % 10;
			//3.每一位数字的的立方合加在一起等于这个三位数，满足的则是水仙花数
			if(ge*ge*ge + shi*shi*shi + bai*bai*bai == i){
				System.out.print(i + " ");
			}
		}
	}
}