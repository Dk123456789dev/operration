package Interface;

interface share{
	void draw();
	default void show() { System.out.println("showing the enteries");}
	
}
class rectangle implements share{
	public void draw(){System.out.println("running the enteries");}
}

public class Defautmethod_Interface {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		share b = new rectangle();
		b.draw();
		b.show();
	}

}
