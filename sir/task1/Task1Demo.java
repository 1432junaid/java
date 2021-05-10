import java.util.*;
import java.io.*;
class Task1Demo{
	public static void main(String[] args){
		try{
			Properties prop = new Properties();
//			FileOutputStream fos = new FileOutputStream("result.txt");
			File f = new File("/home/jd/Desktop/jd/java/sir/task1/properties.txt");		//f = property file
			FileInputStream fis1 = new FileInputStream(f);		//fis1
			prop.load(fis1);
			Enumeration<String>  e = (Enumeration<String>)prop.propertyNames();
			HashMap<String, Integer> hm = new HashMap<>();
			while(e.hasMoreElements()) {
				String name = e.nextElement();
//				System.out.println(name);
				String filePath = prop.getProperty(name);
//				System.out.println(filePath);
				FileInputStream tempFile = new FileInputStream(filePath);
				Properties tempProp = new Properties();
				tempProp.load(tempFile);
				ArrayList<String> cities = new ArrayList<>();

				cities.add(tempProp.getProperty("city"));

		                for(int i = 0; i<cities.size(); i++){
	                	        if(hm.get(cities.get(i)) != null){
        	                	        hm.put(cities.get(i), hm.get(cities.get(i))+1);
	        	                }else{
                		                hm.put(cities.get(i),1);
	        	             	}
        		        }
			}
			hm.forEach((K,V)->{System.out.println(K+"\t"+V);});
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
