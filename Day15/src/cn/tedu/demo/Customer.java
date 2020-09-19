package cn.tedu.demo;

public class Customer {
	String name;
	int age;
	
	public Customer() {
		super();
	}
	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * 重写原则：比较两个对象的实体是否相同
	 * 即：name age
	 * 手动重写
	 */
//	@Override
//	public boolean equals1(Object obj) {
//		if(this==obj) {
//			return true;
//		}
//		if(obj==null) {
//			return false;
//		}
//		if(obj instanceof Customer) {
//			Customer c = (Customer) obj;
//			if(this.age==c.age && this.name.equals(c.name)) {
//				return true;
//			}
//		}
//		return false;
//	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Customer other = (Customer) obj;
//		if (age != other.age)
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		return true;
//	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + "]";
	}
}
