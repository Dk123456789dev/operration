package Abstract;

abstract class Shape{  
abstract void draw();  
}  

 class Rectangle extends Shape{  
void draw(){System.out.println("drawing rectangle");}  
}  
 class Circle1 extends Shape{  
void draw(){System.out.println("drawing circle");}  
} 
public class Abstract_Shape_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{ Shape s =new Circle1();
		s.draw();
		}
	}}


