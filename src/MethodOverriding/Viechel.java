package MethodOverriding;


class Viechel{void run(){System.out.println("viechel is running");}

}

 class bike  extends Viechel { 
	void run() { System.out.println("bike id running");}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bike b=new bike();
		b.run();}}