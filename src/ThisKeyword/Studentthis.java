package ThisKeyword;
class Student1 {
	int id;
	String name;
	String collage;
	 
	Student1(int id,String name, String collage){
		this.collage =collage;
		this.name=name;
		this.id=id;
		
	}
void display() {
	System.out.println(id+" "+name+" "+collage);
	}
}

public class Studentthis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s =new Student1(1, "dev", "Window");
		Student1 s1= new Student1(2, "ram", "RRA");
		s.display();
		s1.display();
	}

}
