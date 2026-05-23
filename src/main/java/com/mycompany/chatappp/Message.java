/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatappp;
import java.util.Scanner;
import java.util.Scanner;
/**
 *
 * @author Tshireletso
 */

public class Message {
    
   
       Scanner input= new Scanner(System.in);
       
       void Messages(){
       
       String option;
       String Option1=null, Option2=null, Option3=null;
       int totalmessages;
       int count;
       
    System.out.println("Welcome to QuickChat.");
    
    do{
    System.out.println("Please select an option (1-3): ");
    System.out.println("\n--- Main Menu ---");
    System.out.println("Option 1) Send Messages");
    System.out.println("Option 2) Show recently sent messages");
    System.out.println("Option 3) Quit");
    
     option= Integer.toString(input.nextInt());
     
  }
    while{
               
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
    System.out.println("How many messages do you want to enter?");
    totalmessages=input.nextInt();
    
    for(count=0; count<totalmessages; count++){
}
}


    