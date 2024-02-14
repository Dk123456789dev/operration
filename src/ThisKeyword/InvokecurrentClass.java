package ThisKeyword;

class A {
	
	void m() {
		System.out.println("hellow");}
	void n() {
		System.out.println("h");
		this.m();
	}
}
	 class InvokecurrentClass{
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.n();
		//a.m();

	}

}
