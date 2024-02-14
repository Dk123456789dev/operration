package Abstract;

abstract class bike{
	abstract void run() ;}

public class AbstarctExample extends bike {
	void run() {System.out.println("running");}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bike b =new AbstarctExample();
		b.run();
	}

}
