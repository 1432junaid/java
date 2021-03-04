class StringBuilderMain{
	public static void main(String[] args){
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder("Lucknow");
		StringBuilder sb3 = new StringBuilder(10);
//		System.out.println("capacity\tlength");
		sb1.append("Lucknow Junction");
		sb1.ensureCapacity(16);
//		sb1.append("East");
//		System.out.println(sb1.capacity()+"\t\t"+sb1.length());
//		System.out.println(sb2.capacity()+"\t\t"+sb2.length());
//		System.out.println(sb3.capacity()+"\t\t"+sb3.length());

		System.out.println(sb2.indexOf("cl"));


	}
}
