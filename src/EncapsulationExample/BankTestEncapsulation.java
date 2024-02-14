package EncapsulationExample;

class  Address{
	private long acc_co;
	private String name,Email, Address;
	private String Accout;
	 
	public long getAcc_co() {return acc_co;}
	 
	public void setAcc_co(long acc_co) {this.acc_co=acc_co;}
	
	public String getName() {return name;}
	 
	public void setName(String name) {this.name=name;}
	
	public String getEmail() {return Email;}
	 
	public void setEmail(String Email) {this.Email=Email;}
	
	public String getaddress() {return Address;}
	 
	public void setaddress(String Address) {this.Address=Address;}
	
	public String getaccout() {return Accout;}
	 
	public void setaccout(String Accout) {this.Accout=Accout;}
}

public class BankTestEncapsulation {
	public static void main(String Args[]) {
		Address a = new Address();
		a.setAcc_co(216481264816481L);
		a.setName("dgassafasf");
		a.setEmail("ajsfgsa@gamil.com");
		a.setaddress("KADKAGDGSAFSAFHGASFGASGFHA");
		a.setaccout("142142423435");
		 System.out.println(a.getAcc_co()+" "+a.getName()+" "
				 +a.getName()+" "
		+a.getaddress()+" "+a.getaccout()); 
	}

}
