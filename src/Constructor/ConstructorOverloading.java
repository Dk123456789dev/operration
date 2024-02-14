package Constructor;

public class ConstructorOverloading {
	int id;
	String name;
	int Age;
	ConstructorOverloading(int i, String n){
		id=i;
		name=n;
	}
	ConstructorOverloading(int i,String n, int a){
		id=i;
		name=n;
		Age=a;
		
	}
	 void display() {
		 System.out.println(id+""+name+""+Age);}
	 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverloading C1=new ConstructorOverloading(1,"dev");
		ConstructorOverloading c2 =new ConstructorOverloading(2, "ran", 28);
		C1.display();
		c2.display();
	}

}
