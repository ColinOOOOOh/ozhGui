package action;
import java.sql.SQLException;

import pojo.User;


import Model.ModelBean;

public class RegistAction {

	private User user; 
	private ModelBean business;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String execute() 
	{
		try
		{
			business = new ModelBean();
			
			if (business.InsertUser(user)) 
			{
				return  "success";  
			}
			else
			{
				return "error";   				
			}
		}catch(SQLException e)
			{
				System.out.println("SQL exception occurred while registing");
				return  "exception";     
			}
		 catch(ClassNotFoundException ne)
		 {
				System.out.println("ClassNotFoundException occurred while registing");
				return  "exception";  
		 }
	}
}
