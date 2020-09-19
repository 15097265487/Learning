package cn.tedu.demo;
/*
 * 接口的应用
 * 			代理模式
 * 	明星（被代理）-----经记人（代理）
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
//，被代理的类
class Server implements NetWork{

	@Override
	public void browse() {
		System.out.println("服务器真正访问");
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
		System.out.println("联网前的检查");
		
	}
	
}