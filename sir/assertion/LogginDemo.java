import java.util.logging.*;
class LoggingDemo{
	public static void main(String[] args){
//		Logger.getGlobal().severe("My first log");
		Logger mylogger =  Logger.getGlobal();
//		mylogger.setLevel(Level.WARNING);
		mylogger.info("My first log");
		mylogger.log(Level.WARNING,"warnign");
	}
}
