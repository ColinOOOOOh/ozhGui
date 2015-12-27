package actionTest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import base.UnitTestBase;
import action.LoginAction;
import org.apache.struts2.ServletActionContext;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

/**
 *
 * @author acer
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class testLoginAction extends UnitTestBase{
    
    public testLoginAction() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }


     @Test
     public void test() {
         //MockHttpServletRequest request = new MockHttpServletRequest();
         //MockHttpServletResponse response = new MockHttpServletResponse();
         LoginAction loginAction = super.getBean("LoginAction");
         System.out.println(loginAction.getClass().getName());
     }
}
