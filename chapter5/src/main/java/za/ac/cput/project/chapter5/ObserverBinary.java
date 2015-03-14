package za.ac.cput.project.chapter5;

public class ObserverBinary extends ObserverPattern {
	public ObserverBinary(ObserverSubject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }
	   @Override
	   public void update() {
	      System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) ); 
	   }
}
