package ThisKeyword;

public class Student3 {
	
	
	
		int id;
		String name;
		String collage;
		 
		Student3(int i,String n, String c){
			collage =c;
			name=n;
			id=i;
			
		}
	void display() {
		System.out.println(id+" "+name+" "+collage);
		}
	
public static void main(String[] args) {
			// TODO Auto-generated method stub
			Student1 s =new Student1(1, "dev", "1008dev");
			Student1 s1= new Student1(2, "ram", "devewuyrew");
			s.display();
			s1.display();
		}

	}


