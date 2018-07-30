package _4_2_SuperclassPersonAndItsSubclasses;
/*
 * 
 * @author DNABigBoss - hanunalya22@gmail.com
 * 
 */
public class Person {
	private String name;
	private String address;
	
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String Address) {
	}
	
	public String toString() {
		return "Person[name="+name+",address="+address+"]";
	}
}
