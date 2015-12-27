package action;
import java.sql.SQLException;

import org.apache.struts2.ServletActionContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import com.opensymphony.xwork2.ActionSupport;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import po.*;
import service.LoginService;


	public class LoginAction extends ActionSupport
	{  
		private UserPo_old m_user; 
		private LoginService m_loginService;
		public UserPo_old getUser() {
			return m_user;
		}

		public void setUser( UserPo_old user) {
			this.m_user = user;
		}

		public String execute() 
		{
			try
			{
				
				m_loginService =new LoginService();
				if (m_loginService.checkUserInfo(m_user).equals("SUCCESS")) 
				{
					HttpServletRequest request = ServletActionContext.getRequest();
					HttpSession session = request.getSession();
					session.setAttribute("u", m_user);
					return  "SUCCESS"; 
				}
				else
				{
					return "ERROR";
				}
			}catch(SQLException e)
			{
				System.out.println("SQL exception occurred while Loginning");
				return  "exception";  
			}
		}
	}

