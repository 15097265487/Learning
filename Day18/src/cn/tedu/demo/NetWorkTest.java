package cn.tedu.demo;
/*
 * �ӿڵ�Ӧ��
 * 			����ģʽ
 * 	���ǣ�������-----�����ˣ�����
 */

public class NetWorkTest {
	public static void main(String[] args) {
		Server s = new Server();
		proxyServer p = new proxyServer(s);                              
		p.browse();
	}

}
interface NetWork{
	public void browse();
}
//�����������
class Server implements NetWork{

	@Override
	public void browse() {
		System.out.println("��������������");
	}
}
class proxyServer implements NetWork{
	private NetWork work;
	public proxyServer(NetWork work) {
		this.work=work;
	}
	@Override
	public void browse() {
		check();
		work.browse();
		
	}
	private void check() {
		System.out.println("����ǰ�ļ��");
		
	}
	
}