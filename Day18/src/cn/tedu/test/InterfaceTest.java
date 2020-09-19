package cn.tedu.test;

public class InterfaceTest {
	public static void main(String[] args) {
		Man m = new Man();
		
	}
}
interface Filial{
	default void help() {
		System.out.println("我来了");
	}
}
interface Spoony{
	default void help() {
		System.out.println("别怕，我来了");
	}
}
class Man implements Filial,Spoony{

	@Override
	public void help() {
		System.out.println("我该怎么办？");
		Filial.super.help();
		Spoony.super.help();
	}
	
}