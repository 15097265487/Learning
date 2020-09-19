package cn.tedu.demo;

public class Order {

		private int orderPrivate;
		int orderDefault;
		public int orderPublic;
		
		
		
		private void methodPrivate() {
			System.out.println("Private");
			orderPrivate=1;
			orderDefault=2;
			orderPublic=3;
		}
		 void methodDefault() {
			System.out.println("default");
			orderPrivate=1;
			orderDefault=2;
			orderPublic=3;
		}
		public void methodPublic() {
			System.out.println("public");
			orderPrivate=1;
			orderDefault=2;
			orderPublic=3;
		}
	

}
