package Inheritance;

class animal3 {
	void eat() {
		System.out.println("Animal is eating");
	}
}
class dog2 extends animal3 {  
	void meow() {System.out.println("Animal is meow");

	}
	}
class babydog1 extends animal3{  
	void weep() {System.out.println("Animal is weeping");
}
	
}


public class Herarchcal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		babydog1 b = new babydog1();
		dog2 d = new dog2();
		 d.meow();
		 b.eat();
		 b.weep();
	}

}
