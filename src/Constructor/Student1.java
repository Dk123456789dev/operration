package Constructor;

public class Student1 {
 int id;
 String name;
 Student1(int i,String n){//parametrized cunstructor
	 id=i;
	name=n;
	
	 //System.out.println(id+" "+name);
	 
 }
void display() {
	System.out.println(id+" "+name);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Student1 s =new  Student1(101,"name");
		 Student1 s2 =new  Student1(102, "dev");
		 s.display();
		 s2.display();
	}

}
