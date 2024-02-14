package Interface;


interface bank{
	void GetInterest(); }


class SBI implements bank{
	public void GetInterest() { System.out.println("interste of SBI");}
}
class CICI implements bank{
	public void GetInterest() { System.out.println("interste of CICI");}
}
class Pnb implements bank{
	public void GetInterest() { System.out.println("interste of Pnb");}
}
public class InterfaceExmaple2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
bank B;
B =new SBI();
B.GetInterest();
B =new CICI();
B.GetInterest();
B =new Pnb();
B.GetInterest();
	}

}
