package za.ac.cput.project.chapter5;

public class ChainOfResponsibilityFileLogger extends ChainOfResponsibilityPattern{
	public ChainOfResponsibilityFileLogger(int level){
	      this.level = level;
	   }
	   @Override
	   protected void write(String message) {		
	      System.out.println("File::Logger: " + message);
	   }
}
