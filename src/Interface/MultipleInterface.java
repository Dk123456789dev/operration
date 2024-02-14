package Interface;

interface printable1{
	void print();
}

interface showable{
	void show();
}


public class MultipleInterface implements printable1,showable {
	public void print() {System.out.println("Hellow");}
	public void show() {System.out.println("devendra fgsdfgdsgfg");}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInterface b = new MultipleInterface();
		b.show();
		b.print();
	}

}
