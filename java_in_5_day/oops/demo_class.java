public class demo_class{
	public static void main(String[] args){
//		Person p1 = new Person();
//		p1.name = "Junaid";
//		p1.age = 23;
//		Person p2 = new Person(45,"Ram");
		Developer  d1 = new Developer(35,"Junaid");
		System.out.println(d1.age + " " +d1.name);
		d1.walk();
//		System.out.println(p1.age +" " + p1.name);
		System.out.println(Person.count);
	}
}

class Person{
	String name;
	static int count;

	public Person(){
		count++;
		System.out.println("creating object");
	}
	public Person(int age, String name){
		this();
		this.name = name;
		this.age = age;
	}

	int age;
}


class Developer extends Person{		//inherits class
	public Developer(int age, String name){
		super(age,name); 	//call the parents constructor
	}
	void walk(){
		System.out.println("Developer " + name + " is walking ");
	}
};
