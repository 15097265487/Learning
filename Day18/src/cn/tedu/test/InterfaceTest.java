package cn.tedu.test;

public class InterfaceTest {
	public static void main(String[] args) {
		Man m = new Man();
		
	}
}
interface Filial{
	default void help() {
		System.out.println("������");
	}
}
interface Spoony{
	default void help() {
		System.out.println("���£�������");
	}
}
class Man implements Filial,Spoony{

	@Override
	public void help() {
		System.out.println("�Ҹ���ô�죿");
		Filial.super.help();
		Spoony.super.help();
	}
	
}