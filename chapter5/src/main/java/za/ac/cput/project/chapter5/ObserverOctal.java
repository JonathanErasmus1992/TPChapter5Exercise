package za.ac.cput.project.chapter5;

public class ObserverOctal extends ObserverPattern{
	public ObserverOctal(ObserverSubject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }

	   @Override
	   public void update() {
	     System.out.println( "Octal String: " + Integer.toOctalString( subject.getState() ) ); 
	   }
}
