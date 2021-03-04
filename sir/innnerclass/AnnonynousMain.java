interface A{
	void printer(){
		System.out.println("A- interface");
	}
}

class AMain implements A{
	public static void main(String[] args){
		A a = new A(){
			public void printer(){
				System.out.println("annonymous");
			}
			void p(){
				System.out.println("p");
			}
		};
		a.printer();
		a.p();
	}
}
