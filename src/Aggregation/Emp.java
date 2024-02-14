package Aggregation;

public class Emp {
	int id;
	String name;
	Address address;
	
	Emp(int id, String name, Address address){ this.id=id;
	this.name=name;
	this.address=address;
	
	}
void display() {
	System.out.println(id+" "+name);
	System.out.println(address.City+" "+address.state+" "+address.country);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address1 =new Address("g","dev","dd");
		Address address2 =new Address("gd","dedv","ddd");
		
Emp e =new Emp(11, "ram",address1);

Emp e2 =new Emp(111, "ram1",address2);
e.display();
e2.display();
	}

}
