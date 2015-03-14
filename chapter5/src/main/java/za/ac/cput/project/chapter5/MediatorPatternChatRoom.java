package za.ac.cput.project.chapter5;

import java.util.Date;

public class MediatorPatternChatRoom 
{
	public static void showMessage(MediatorUser user, String message)
	{
	      System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
	}
	   
}
