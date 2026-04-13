/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatappp;
import java.util.Scanner;
/**
 *
 * @author Tshireletso
 */
public class Login {
    Scanner input =new Scanner(System.in);
    
    void register(){
        System.out.println("Enter UserName");
        String storedUserName=input.nextLine();
        checkUserName(storedUserName);
        
        System.out.println("Enter Password");
        String storedPassword=input.nextLine();
        checkPassword(storedPassword);
        
        System.out.println("Enter Cellphone");
        String storedCellphone=input.nextLine();
        checkCellphone(storedCellphone);
        registeruser(storedUserName, storedPassword);
        Login(storedUserName,storedPassword);  
    }
    boolean checkUserName(String UserName){
        if (UserName.length()==5 &&UserName.contains("_")){
            System.out.println("UserName successfully captured");
            return true;
        }
        else{
            System.out.println("Username is not correctly formatted");
            return false;
        }
    }
    boolean checkPassword(String StoredPassword){
        if(StoredPassword.length()>8 &&StoredPassword.contains(".*[A-Z].") &&StoredPassword.contains("\\d")&& StoredPassword.contains(".[!@#$%^&*]")){
            System.out.println("Password successfully captured");
            return true;
        }
        else{
            System.out.println("Password is not correctly formatted");
            return false;
        }
    }
    boolean checkCellphone(String StoredCellphone){
        if(StoredCellphone.length()==10 && StoredCellphone.contains(".[*//(+27\\d(9)")){
            System.out.println("Cellphone number successfully added");
            return true;
        }
        else{
           System.out.println("Cellphone number incorrectly formatted or does not contain international code");
           return false;
    }
    }
    public String registeruser(String storedUserName, String storedPassword){
        
        if (checkUserName(storedUserName) &&checkPassword(storedPassword)){
            return "Successfully registered";
        }
        else{
            return "Incorrect password or username";
        }
    }
    void Login(String storedUserName,String storedPassword){
        String UserName;
        String Password;
        String FirstName;
        String LastName;
        
         System.out.println("Enter your first name");
         FirstName=input.nextLine();
         
         System.out.println("Enter your last name");
         LastName=input.nextLine();
         
        System.out.println("Enter UserName");
        UserName=input.nextLine();
        
         System.out.println("Enter Password");
         Password=input.nextLine();
       loginuser(UserName,storedUserName,Password,storedPassword);  
       
    }
    
    
    
    public boolean loginuser(String UserName,String storedUserName,String Password,String storedPassword){
   
        return UserName.matches(storedUserName)&& Password.matches(storedPassword);
    
}
}



