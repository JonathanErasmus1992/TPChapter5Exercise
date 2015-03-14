package za.ac.cput.project.chapter5;

public class ChainOfResponsibilityErrorLogger extends ChainOfResponsibilityPattern {
	public ChainOfResponsibilityErrorLogger(int level){
	      this.level = level;
	   }
	   @Override
	   protected void write(String message) {		
	      System.out.println("Error Console::Logger: " + message);
	   }
}
