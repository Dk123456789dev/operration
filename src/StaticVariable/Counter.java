package StaticVariable;

public class Counter { static int Count=0;
 Counter(){Count++;
 
System.out.println(Count);
 }
/* void display() {
	 System.out.println(Count);
	 
 }*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Counter C=new Counter();
Counter C1=new Counter();
Counter C2=new Counter();
/*C.display();
C2.display();
C1.display();*/

	}

}
