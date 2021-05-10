import java.io.*;
class ImageCopy{
	public static void main(String[] args){
		File f1 = new File("/home/jd/Desktop/jd/java/sir/filehandling/IMG_20201108_143723.jpg");
		File f2 = new File("/home/jd/Desktop/jd/java/sir/filehandling/MyIMG_20201108_143723.jpg");
//		String h = System.getProperty("pwd");
//		System.out.println(h);
		try{
			FileInputStream fis = new FileInputStream(f1);
			BufferedInputStream bis = new BufferedInputStream(fis,1028);
			FileOutputStream fos = new FileOutputStream(f2);
			BufferedOutputStream bos  = new BufferedOutputStream(fos,1028);
			int b;
			while((b =bis.read()) != -1){
				bos.write(b);
			}
			bos.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
