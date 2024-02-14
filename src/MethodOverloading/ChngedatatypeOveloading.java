package MethodOverloading;



class Address1{ static int add(int a, int b) { return a+b;}
static double add(double a, double b,double c) { return a+b+c;}
}


public class ChngedatatypeOveloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Address1.add(11,11));
		System.out.println(Address1.add(11,11,11));

	}

}
