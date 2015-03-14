package za.ac.cput.project.chapter5;

public class ObserverHexal extends ObserverPattern {
	public ObserverHexal(ObserverSubject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }
	   @Override
	   public void update() {
	      System.out.println( "Hex String: " + Integer.toHexString( subject.getState() ).toUpperCase() ); 
	   }
}
