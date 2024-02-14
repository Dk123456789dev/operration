package Interface;


interface printable2{
	void print();
}

interface showable2 extends printable2 {
	void show();
}


public class InterfaceWithInheritance implements showable2 {
	public void print() {System.out.println("Hellow");}
	public void show() {System.out.println("devendra fgsdfgdsgfg");}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceWithInheritance b = new InterfaceWithInheritance();
		b.show();
		b.print();
	}

}



