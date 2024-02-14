package Oppscocepts;

class Employe{
	int id;
	String Ename;
	float slary;
	 void insert(int i, String ES, float S) {
		 id=i;
		 Ename =ES;
		 slary =S;
	 }
	 void display() {
		 System.out.println(id+""+Ename+""+slary);}
}

public class ExampleEmploye {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employe E1 =new Employe();
		Employe E2 =new Employe();
	/*	E1.id=101;
		E2.id=102;
		E1.Ename="DEV";
		E2.Ename="Radhe";
		E1.slary=100.23f;
		E2.slary =24234.00f;*/
		E1.insert(101, "dev", 10377.f);
		E2.insert(102, "ram", 234235.45f);
		E1.display();
		E2.display();
		
	}

}
