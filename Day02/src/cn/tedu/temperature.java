package cn.tedu;

public class temperature {

	public static void main(String[] args) {
		int h = 80;
		double s=(h-32)/1.8;
		System.out.println(h+"华氏度转换为摄氏度是"+Math.round(s)+"度");
	}

}
