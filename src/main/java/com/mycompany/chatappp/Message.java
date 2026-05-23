/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatappp;
import java.util.Scanner;
import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
/**
 *
 * @author Tshireletso
 */

public class Message {
    
   
       Scanner input= new Scanner(System.in);
       Random random=new Random();
       
       String option;
       String Option1=null, Option2=null, Option3=null;
       int totalmessages;
       int count;
       String recipient;
       String messageText;
       long messageID;
       int counter;
       
       void Messages(){
       
       
       
    System.out.println("Welcome to QuickChat.");
           
    
    do{
    System.out.println("Please select an option (1-3): ");
    System.out.println("\n--- Main Menu ---");
    System.out.println("Option 1) Send Messages");
    System.out.println("Option 2) Show recently sent messages");
    System.out.println("Option 3) Quit");
    
     option= Integer.toString(input.nextInt());
   
     
         if(option==Option1) {
            System.out.println("Send Message");
          }
          else if(option==Option2){
              System.out.println("Coming soon");
          }
          else if(option==Option3){
              System.out.println("Quit");
          }
          else{
              System.out.println("Invalid option, please choose option 1-3");
          }
         
    
    
    }
    }

       
    int createmessage(){
     System.out.println("How many messages do you want to enter?");
    totalmessages=input.nextInt();
       
    for(count=0; count<totalmessages; count++){
        System.out.println("the total number of messages is"+count+"of"+totalmessages+"_____");
    }
    return totalmessages;
    
    
  }
    
    String createcellphone(){
    System.out.println("Enter recipient cellphone number including international code and max of 10 charchters");
    recipient=input.nextLine();
    return recipient;
   
 }
    
    String createmessagetext(){
    System.out.println("Enter your message text");
    messageText=input.nextLine();
    return messageText;
    
 }
    
    
    
       long MessageID(){
    System.out.println("Enter message id");
    long ID=1_000_000_000L+(long)Math.random()*9000000000L;
    return ID;
       }
    

       String createmessageHash(long ID, int numofmess, String message){
           String id=Long.toString(ID);
           String firsttwonum=id.substring(0,2);
           
           int firstindex=message.indexOf(" ");
           String firstword=message.substring(0, firstindex);
           
           int lastindex=message.lastIndexOf(" ");
           String lastword=message.substring(lastindex+1);
           
           return firsttwonum : firstword : lastword;
           
       }
       boolean checkmessageID(String messageID){
           if(messageID.length()==10){
              System.out.println("messsageID is correctly formatted");
           return true;
       }
       else{
           System.out.println("messageID is incorrectly formatted");
           
}
           return false;
       }
       String checkrecipientcell(String recipientcell){
          if(recipientcell.length()==10 && recipientcell.contains(".[*//(+27\\d(9)")){
             System.out.println("cellphone number is correctly formatted");
          } 
          else{
              System.out.println("cellphone number is incorrectly formatted");
          }
          return recipientcell;
       }
       int returnTotalMessages(){
           
           for(count=0; count<totalmessages; count++){
        System.out.println("the total number of messages is"+count+"of"+totalmessages+"_____");
           }
           return totalmessages;
       }
       String sentMessages(){ 
         if(messageText.length()<=250){
            
         System.out.println("send message ");
         System.out.println("Disregard message(press0");
         System.out.println("Store message to send it later");
         System.out.println("Choose the following options to decide what you want to do with your message");
         
         return option;
       }
      
       Gson gson=new GsonBuilder().setPrettyPrinting().create();
       try (FileWriter writer=new FileWriter("Message")){
           
         System.out.println("JSON FILE CREATED SUCCESSFULLY");
       }catch(JOException e){
           System.out.println("error"+e.getMessage());
       }
       
}
       
       


    