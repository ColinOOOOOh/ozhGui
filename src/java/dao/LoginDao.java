/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import po.UserPo_old;

/**
 *
 * @author acer
 */
public class LoginDao {

                
                public String checkUser(UserPo_old user) 
		{
                    if(user.getUsername().equals("a")){
                        return "SUCCESS";
                    }else{
                        return "FAILED";
                    }
                    
		}
}
