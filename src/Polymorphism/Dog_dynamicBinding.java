package Polymorphism;
//dynamic polymorfism
class Animal{
	void eat() {System.out.println("animal is eatting");
}
}
public class Dog_dynamicBinding extends Animal {

	void eat() {System.out.println("dog is eatting");}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a =new Dog_dynamicBinding();
		a.eat();
	}

}
