class Coffee{
	public static void main(String[] args){
		Mocha m = new Mocha(new Expresso());
		Mocha m1 = new Mocha(new HouseBlend());
		Mocha m3 = new Mocha(new Mocha(new Expresso()));
		System.out.println(m1.cost());
 		System.out.println(m1.getDescription());
	}
}
