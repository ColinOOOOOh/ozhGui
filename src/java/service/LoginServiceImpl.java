/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import po.UserPo;
import dao.LoginDao;
import java.sql.SQLException;

/**
 *
 * @author acer
 */
public class LoginServiceImpl implements LoginService{
        private LoginDao m_loginDao = new LoginDao();

     public String checkUserInfo( UserPo user )throws SQLException{
        return  m_loginDao.checkUser(user);
    }
}
