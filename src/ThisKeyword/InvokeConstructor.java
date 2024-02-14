package ThisKeyword;

class B{
	B(){System.out.println("helleo");
	
	}
	B(int i){this();
		System.out.println(i);
		
	}
	
}

public class InvokeConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
B a = new B(10);

	}

}
