package EncapsulationExample;

class Student1{  
	//private data member  
	private String name;  
	//getter method for name  
	public String getName(){  
	return name;  
	}  
	//setter method for name  
	public void setName(String name){  
	this.name=name;  
	}  
	}  

class Test{  
public static void main(String[] args){  
//creating instance of the encapsulated class  
Student1 s=new Student1();  
//setting value in the name member  
s.setName("vijay");  
//getting value of the name member  
System.out.println(s.getName());  
}  
}  
