
class hello{
	int roll;
	String collage;
	String name;
	void getdata(int n , String nm){
		name = nm;
		roll = n;
	}
	void show(){
		System.out.println(roll+ " "+name+""+collage);
	}
	public static void main(String args[]){
		hello hello1 = new hello();
		hello1.getdata(12,"junaid");
		hello1.show();
	}
}
