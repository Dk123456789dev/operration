package Constructor;

public class student6 {
	int id;
	String name;
	student6 (int i, String n){
		id=i;
		name=n;
	}
student6(student6 s){
	id=s.id;
	name=s.name;
	
}
void display() {
	System.out.println(id+""+name);
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
student6 s1=new student6(101,"dev");
student6 s2 =new student6(s1);
s1.display();
s2.display();
	}
	

}
