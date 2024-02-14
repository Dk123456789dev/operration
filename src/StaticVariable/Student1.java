package StaticVariable;

public class Student1 {
	int id;
	String name;
	static String collage="ITS";

	 
	Student1(int i, String n ){
		 id=i;
	name=n;
		
	}
	void display() {
		System.out.println(id+"  "+name+" "+collage);
	}
public static void main(String[] args) {
Student1 S = new Student1(1, "Ram");
Student1 S1 = new Student1(2, "Shyam");
S.display();
S1.display();

}
}
