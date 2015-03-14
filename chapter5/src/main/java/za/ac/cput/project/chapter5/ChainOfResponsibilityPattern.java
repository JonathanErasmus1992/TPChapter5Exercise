package za.ac.cput.project.chapter5;

public abstract class ChainOfResponsibilityPattern {
	public static int INFO = 1;
	   public static int DEBUG = 2;
	   public static int ERROR = 3;

	   protected int level;

	   //next element in chain or responsibility
	   protected ChainOfResponsibilityPattern nextLogger;

	   public void setNextLogger(ChainOfResponsibilityPattern nextLogger){
	      this.nextLogger = nextLogger;
	   }

	   public void logMessage(int level, String message){
	      if(this.level <= level){
	         write(message);
	      }
	      if(nextLogger !=null){
	         nextLogger.logMessage(level, message);
	      }
	   }

	   abstract protected void write(String message);
}
