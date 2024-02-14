package Oppscocepts;


class rectangle{
	int length;
	int width;
	void insert(int i,int w) {
		length =i;
		width =w;
	}
	void display() {
		System.out.println(length*width);
		

	}
}

public class Multipleobject {

	public static void main(String[] args) {
		rectangle r1 =new rectangle(),r2 =new rectangle();
r1.insert(11, 5);	
r2.insert(20, 5);
r1.display();
r2.display();	// TODO Auto-generated method stub

	}

}
