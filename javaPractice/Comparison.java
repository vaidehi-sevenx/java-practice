/* java t point **/
/* comparison of two objects */

package javaPractice;

class Pet {
	String name;
	int age;
	String gender;
	Pet(String name, int age, String gender){
		this.name = name;
		this.age = age;	
		this.gender= gender;
	}
}
public class Comparison {
	public static void main(String args[]) {
		Pet dog1 = new Pet("Snoop", 3,"Male");
		Pet dog2 = new Pet("Mickey",4,"Male");
		Pet dog3 = new Pet("Lily",2,"Female");
		
		
		System.out.println(dog1.equals(dog2));
		System.out.println(dog1.equals(dog3));
	}
		
		
	}


