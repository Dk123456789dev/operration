package Polymorphism;

class bank{ void getinterst() {
	System.out.println("intersret ");
}
}
class sbi extends bank{ void getinterst() {
	System.out.println("intersret SBI ");
}}
class CICI extends bank{ void getinterst() {
	System.out.println("intersret CICI");
}}


public class Polymorfistexamplre {
	
	public static void main( String args[])
	
	{  bank b;
	b = new sbi();
	b.getinterst();
	b = new CICI();
	b.getinterst();
	
	
	}

	
}
