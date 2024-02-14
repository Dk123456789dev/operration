package Oppscocepts;

 class ReferenceClass1 {
	int id;
	String name;
	

}

 public class ReferenceClass{
	public static void main(String args[]) {
		ReferenceClass1 R2 = new ReferenceClass1();
		ReferenceClass1 R = new ReferenceClass1();
				R.id=100;
		       R.name="devendr";
		       R2.id=200;
		       R2.name="radhe";
		       System.out.println(R2.id+" "+R2.name);
		       System.out.println(R.id+" "+R.name);
		       
		
		
		
		
	}
	
}


