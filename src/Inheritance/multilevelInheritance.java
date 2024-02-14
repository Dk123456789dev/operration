package Inheritance;

class animal1 {
	void eat() {
		System.out.println("Animal is eating");
	}
}
class dog1 extends animal1 {  
	void meow() {System.out.println("Animal is meow");

	}
	}
class babydog extends dog1{  
	void weep() {System.out.println("Animal is weeping");
}
	
}

public class multilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		babydog b = new babydog();
		 b.meow();
		 b.eat();
		 b.weep();
			}

	}


