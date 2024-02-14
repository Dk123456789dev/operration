package Oppscocepts;



class student2{
	int id;
	String name;
void insert(int i,String r) {
	id=i;
	name=r;
}
void display() {
	System.out.println(id+" "+name);
	

}

}

public class ClassCallingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
student2 S = new student2();
student2 s1 = new student2();

S.id=100;
s1.id=220;
S.name="dev";
s1.name="radhe";
s1.display();
S.display();


	}

}
