import java.io.*;

class CheckedException{
	public static void main(String[] args){
		File f = new File("/home/jd/Desktop/jd/java/sir/exception/UnCheckedException.java");
		try{
			FileInputStream fis = new FileInputStream(f);
			int data = 0;
			while((data = fis.read()) != -1){
				System.out.print((char)data);
			}
		}catch(Throwable th){
			System.out.println("File not found");
//			th.printStackTrace();
		}
	}
}

