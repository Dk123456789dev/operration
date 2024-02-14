package Abstract;

abstract class Bike{ 
	Bike(){System.out.println("running...");}
abstract void Run();
void changegrea() {System.out.println("gear change");}
}
class Honda extends Bike{ void Run() {System.out.println("running...");}}

public class Testabstarct2  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bike b = new Honda();
b.changegrea();
b.Run();
	}
}




