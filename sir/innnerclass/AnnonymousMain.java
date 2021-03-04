interface A{
	void printer();
}

class AnnonynousMain{
	public static void main(String[] args){
		A a = new A(){
			public void printer(){
				System.out.println("Hello printer");
			}
		};
		a.printer();
	}
}
