package MethodOverloading;


class Address{ static int add(int a, int b) { return a+b;}
static int add(int a, int b,int c) { return a+b+c;}
}


public class TestOverloading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(Address.add(11,11));
System.out.println(Address.add(11,11,11));

	}

}
