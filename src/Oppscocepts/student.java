package Oppscocepts;

public class student {
	int id;
	int x;
	String y;
	
	String name;
static int  age=20;//static vlaible
static int account=211;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int roll=200;
		char lass = '6';

student s = new student();
s.id= 101;
s.name ="dev";

System.out.println(s.id+" "+s.name);
System.out.println(roll+" "+lass);

System.out.println( age+" "+account);
System.out.println(s.x+" "+s.y);
	}
																							
}
