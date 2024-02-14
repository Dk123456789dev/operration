package Superkey;


class Animal1{ void eat() {System.out.println("eating....");}}
class Dog1 extends Animal1{
	
	void bark(){System.out.println("barking....");}

	
	void display() {
		
		bark();super.eat();
	}
}


public class TestSuper2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog1 d =new Dog1();
d.display();
	}

}
