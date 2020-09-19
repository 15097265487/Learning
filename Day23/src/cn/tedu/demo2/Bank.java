package cn.tedu.demo2;
/*
 * 	懒汉式
 */

public class Bank {
	public static void main(String[] args) {
		My m = My.getInstance();
		
	}
}
class My{
	private My() {}
    private static  My instance = null;
    //3.声明公共的方法，返回当前类的对象
    //public static synchronized My getInstance(){
    public static My getInstance(){
    	//方式一
//    	synchronized (My.class) {
//    		if (instance==null) {
//    			instance = new My();
//    		}
//    		return instance;
//		}
    	//方式二，效率更高
    	if(instance==null) {
    		synchronized (My.class) {
    			if (instance==null) {
    				instance = new My();
    			}
			}
    	}
    	return instance;
    }
}