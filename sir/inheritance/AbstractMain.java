abstract class AbstractDemo{
	AbstractDemo(){
		System.out.println("AD - Demo");
	}
/*	void printer(){
		System.out.println("AB-Demo");
	}

	abstract void p();
*/
}

class AChild extends AbstractDemo{
	void AChild(){
		System.out.println("AB-CHild");
	}
}

class AbstractMain{
	public static void main(String[] args){
		AChild a = new AChild();
//		a.printer();
//		a.p();
	}
}
