import java.util.logging.*;

class LoggingDemo2{
	public static void main(String[] args){
		Logger mylogger = Logger.getLogger("abc.xyz");
		mylogger.log(Level.FINE, "First Fine LEVEL LOG");
	}
}
