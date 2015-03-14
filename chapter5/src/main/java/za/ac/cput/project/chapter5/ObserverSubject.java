package za.ac.cput.project.chapter5;

import java.util.List;
import java.util.ArrayList;

public class ObserverSubject {
	private List<ObserverPattern> observers = new ArrayList<ObserverPattern>();
	   private int state;

	   public int getState() {
	      return state;
	   }

	   public void setState(int state) {
	      this.state = state;
	      notifyAllObservers();
	   }

	   public void attach(ObserverPattern observer){
	      observers.add(observer);		
	   }

	   public void notifyAllObservers(){
	      for (ObserverPattern observer : observers) {
	         observer.update();
	      }
	   } 	
}
