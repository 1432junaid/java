import java.io.*;
import java.util.Scanner;
class FileDemo{
	public static void main(String[] args){
		String h = System.getProperty("user.home");
		String sep = File.separator;
		File f = new File(h+sep+"abc"+sep+"myfile.txt");
//2		File f = new File(h+sep+"abc"+sep+"kkv");
//1		f.mkdir();
//2		f.mkdirs();
//		f.delete();
/*		try{
//			f.createNewFile();
//			f.delete();
		}catch(IOException e){
			e.printStackTrace();
			System.out.println("file exist");
		}
*/
		Scanner sc = new Scanner(System.in);
		try{
//			FileInputStream fis = new FileInputStream(f);	//for input
			FileOutputStream fis = new FileOutputStream(f);
			char data = 0;
//			String data = sc.nextLine();
//			while((data=fis.read()) != -1){
			while((data = sc.next().charAt(0)) != '#'){
				fis.write(data);
//				System.out.print((char)data);
			}
//			fis.close();		//pehle flush hogi stream then close hogi
//			fis.flush();		//only flush krta hai
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
