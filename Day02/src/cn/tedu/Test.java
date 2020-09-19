package cn.tedu;

public class Test {

	public static void main(String[] args) {
		boolean x=true;
		boolean y=false;
		short z=42;
		if((z++==42)&&(y=true))z++;//44
		if((x=false)||(++z==45))z++;//46
		
		System.out.println("z="+z);//46
	}

}
