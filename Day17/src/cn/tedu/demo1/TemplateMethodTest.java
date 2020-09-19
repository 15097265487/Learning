package cn.tedu.demo1;
/*
 * 	模板设计模式
 */

public class TemplateMethodTest {
	public static void main(String[] args) {
		SubTemplate t = new SubTemplate();
		long time = t.time();
		System.out.println("time="+time);
	}

}
abstract class Template{
	public long time() {
		long start = System.currentTimeMillis();
		this.code();//不确定的部分，异变
		long end = System.currentTimeMillis();
		long time =end-start;
		long time2 = (end-start)/60000;
		return time;
	}
	public abstract void code();
}
class SubTemplate extends Template{

	@Override
	public void code() {
		for(int i=2;i<10000000;i++) {
			boolean isFlag = true;
			for(int j=2;j<=Math.sqrt(i);j++) {//Math.sqrt(j)开根号
				if(i%j==0) {//，不是质数
					isFlag = false;
					break;
				}
			}
			if(isFlag) {
				System.out.println(i);
			}
			
		}
	}
}