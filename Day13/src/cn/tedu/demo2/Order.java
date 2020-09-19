package cn.tedu.demo2;

public class Order {
	private int orderPrivate;
	int orderDefault;
	protected int orderProtected;
	public int orderPublic;
	
	private void methodPrivate() {
		orderPrivate=1;
		orderDefault=2;
		orderProtected=3;
		orderPublic=4;
	}
	void methodDefault() {
		orderPrivate=1;
		orderDefault=2;
		orderProtected=3;
		orderPublic=4;
	}
	protected void methodProtected() {
		orderPrivate=1;
		orderDefault=2;
		orderProtected=3;
		orderPublic=4;
	}
	public void methodPublic() {
		orderPrivate=1;
		orderDefault=2;
		orderProtected=3;
		orderPublic=4;
	}
	@Override
	public String toString() {
		return "Order [orderPrivate=" + orderPrivate + ", orderDefault=" + orderDefault + ", orderProtected="
				+ orderProtected + ", orderPublic=" + orderPublic + "]";
	}
	
}
