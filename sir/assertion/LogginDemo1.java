import java.util.logging.*;
class LoggingDemo1{
	public static void main(String[] args){
		Logger mylogger = Logger.getLogger("abc.xyz");
//		mylogger.setLevel(Level.WARNING);
//		mylogger.warning("this is first warning");
//		Logger mlogger = Logger.getLogger("abc.xyz");
//		mlogger.info("this is second waring");
//		if(mylogger == mlogger) System.out.println("True");
		mylogger.log(Level.FINE, "First Fine LEVEL LOG");
	}
}
