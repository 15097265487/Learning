package cn.tedu.demo;

public class TriAngle {
	/**定义两个变量*/
	private int base;
	private int height;
	
	/**构造器有参*/
	public TriAngle(int i, int n) {
		base = i;
		height = n;
	}
	/**无参构造器*/
	public TriAngle(){
		
	}
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	/**计算三角形面积*/
	public double Area() {
		return base*height/2.0;
	}
	@Override
	public String toString() {
		return "TriAngle [base=" + base + ", height=" + height + ", 三角形面积="+(base*height/2.0)+"]";
		//return getArea()+"";
		
		
	}
}
