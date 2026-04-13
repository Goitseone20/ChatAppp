/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.chatappp;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.mycompany.chatappp.Login;
/**
 *
 * @author Tshireletso
 */
public class testChatApp {
    
    @Test
    public void checkUserNameiscorrect(){
        Login user=new Login();
        assertTrue(user.checkUserName("kyl_1"));
        
    }
    @Test
    public void checkUserNameisIncorrect(){
      Login user=new Login();
      assertFalse(user.checkUserName("kyle!!!!!!!!"));
    }
    @Test
    public void checkPasswordiscorrect(){
        Login user=new Login();
        assertTrue(user.checkPassword("Ch&&sec@ke99!"));
    }
    @Test
     public void checkPasswordisIncorrect(){
     Login user=new Login();
     assertFalse(user.checkPassword("password"));
   
             }
     @Test
     public void checkCellphoneiscorrect(){
         Login user=new Login();
         assertTrue(user.checkCellphone("+27838968976"));
         
     }
     @Test
     public void checkCellphoneisIncorrect(){
         Login user=new Login();
         assertFalse(user.checkCellphone("0896653"));    }
    
}
