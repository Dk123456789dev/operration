package Inheritance;


class animal{
	void eat() {
		System.out.println("Animal is eating");
	}
}
class dog extends animal {  
	void brave() {System.out.println("Animal is barking");
}
	
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 dog d = new dog();
 d.brave();
 d.eat();
 
	}

}
