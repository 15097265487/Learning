package cn.tedu.demo2;
/*
 * 	����ʽ
 */

public class Bank {
	public static void main(String[] args) {
		My m = My.getInstance();
		
	}
}
class My{
	private My() {}
    private static  My instance = null;
    //3.���������ķ��������ص�ǰ��Ķ���
    //public static synchronized My getInstance(){
    public static My getInstance(){
    	//��ʽһ
//    	synchronized (My.class) {
//    		if (instance==null) {
//    			instance = new My();
//    		}
//    		return instance;
//		}
    	//��ʽ����Ч�ʸ���
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