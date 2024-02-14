package Abstract;

abstract class bank{ abstract  void getIntrest();}

class SBI extends bank{ void getIntrest() {System.out.println("  SBI");}}
class CICI extends bank{ void getIntrest() {System.out.println("  CICI");}}
class Pnb extends bank{ void getIntrest() {System.out.println("  Pnb");}}

public class bankabstracvt {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		bank b;
		b =new SBI();
		b.getIntrest();
		b =new CICI();
		b.getIntrest();
		b =new Pnb();
		b.getIntrest();
	}

}


