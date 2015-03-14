package za.ac.cput.project.chapter5;

public class ChainOfResponsibilityConsoleLogger extends ChainOfResponsibilityPattern {
	public ChainOfResponsibilityConsoleLogger(int level){
	      this.level = level;
	   }
	   @Override
	   protected void write(String message) {		
	      System.out.println("Standard Console::Logger: " + message);
	   }
}
