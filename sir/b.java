class b{
	public static void main(String[] args){
		a a1 = new a();
		a a2 = new a();
		System.out.println(a1.age + " " + a1.salary + " " + a1.name);
		a2.age = 20;
		a2.salary = 3.5f;
		a2.name = "Mahesh";
		System.out.println(a2.age+" "+ a2.salary+ " " + a2.name);
	}
}
