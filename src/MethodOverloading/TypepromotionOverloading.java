package MethodOverloading;

class Address2{ void sum(int a, long b) { System.out.println(a+b);}
void sum(int a, int b,int c) { System.out.println(a+b+c);}
}


public class TypepromotionOverloading {

	public static void main(String[] args) {
		
		Address2 s =new Address2();
		
		// TODO Auto-generated method stub
				s.sum(11,11);
				s.sum(2, 2, 2);

	}

}
