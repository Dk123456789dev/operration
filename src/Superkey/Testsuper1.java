package Superkey;


class Animal{ String color="White";}
class Dog extends Animal{
	String color="balck";
	void display() {
		System.out.println(color);
		System.out.println(super.color);
	}
}


public class Testsuper1 {
 public static void main(String args[]) {
	 Dog d= new Dog();
	 d.display();
 }
}
