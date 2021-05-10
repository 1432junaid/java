import java.io.*;

class MyClass implements Serializable{
	transient private int age;
	public MyClass(int x){
		age = x;
	}
	public String toString(){
		return "Age is : "+age;
	}
}

class SerializationDemo{
	public static void main(String[] args){
/*		MyClass m = new MyClass(20);
		try{
			FileOutputStream fos = new FileOutputStream("abc.dat");
			ObjectOutputStream os = new ObjectOutputStream(fos);
			os.writeObject(m);
			FileInputStream fis = new FileInputStream("abc.dat");
			ObjectInputStream is = new ObjectInputStream(fis);
			MyClass m1 = (MyClass)is.readObject();
			System.out.println(m1.toString());
			if(m1 == m) System.out.println("True");
			else System.out.println("flase");
		}catch(Exception e){
			e.printStackTrace();
		}
*/
		try{
//			File f = new File("/home/jd/Desktop/jd/java/sir/serializable/jd.txt");
			FileOutputStream fis = new FileOutputStream("jd1.txt");
			DataInputStream data = new DataInputStream(System.in);
			String s = data.readLine();
			DataOutputStream dos = new DataOutputStream(fis);
			dos.writeBytes(s);
			dos.close();
			System.out.println(s);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}




