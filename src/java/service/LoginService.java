/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import dao.LoginDao;
import java.sql.*;    //导入JDBC

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;

import po.*;
public class LoginService {

    private LoginDao m_loginDao = new LoginDao();

    public String checkUserInfo( UserPo user ) throws SQLException{
        return  m_loginDao.checkUser(user);
    }
}
