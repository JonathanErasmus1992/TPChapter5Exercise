package za.ac.cput.project.chapter5;

public class MediatorUser 
{
	private String name;

	   public String getName() 
	   {
	      return name;
	   }

	   public void setName(String name) 
	   {
	      this.name = name;
	   }

	   public MediatorUser(String name)
	   {
	      this.name  = name;
	   }

	   public void sendMessage(String message)
	   {
	      MediatorPatternChatRoom.showMessage(this, message);
	   }
}
