package cn.tedu.demo;

public class TriAngle {
	/**������������*/
	private int base;
	private int height;
	
	/**�������в�*/
	public TriAngle(int i, int n) {
		base = i;
		height = n;
	}
	/**�޲ι�����*/
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
	/**�������������*/
	public double Area() {
		return base*height/2.0;
	}
	@Override
	public String toString() {
		return "TriAngle [base=" + base + ", height=" + height + ", ���������="+(base*height/2.0)+"]";
		//return getArea()+"";
		
		
	}
}
