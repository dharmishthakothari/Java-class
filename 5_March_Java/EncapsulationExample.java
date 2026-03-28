package oopConcept;
class Person
{
	private int c_no;
	private String name,address;
	public int getC_no() {
		return c_no;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public void setC_no(int c_no) {
		this.c_no = c_no;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}



public class EncapsulationExample {
public static void main(String[] args) {
	Person p=new Person();
	p.setC_no(123456);
	System.out.println(p.getC_no());
}
}
