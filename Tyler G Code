package com.mycompany.password;

import java.util.Scanner;

public class PasswordGenTyler {

public static void main(String[] args) {
   
    int min = 10;
    int max= 16;
    int digit = 0;
    int special = 0;
    int upCount = 0;
    int loCount = 0;
   
   
    boolean incorrect = true;
    String password;
   
   System.out.println("\nThe password must be at least 10 characters, at most 16, contain uppercase letter, a lowercase, and a special character");
   
    Scanner scan = new Scanner(System.in);
   
    System.out.println("\nPlease enter your password:");
   
    while(incorrect) {
   
        password = scan.nextLine();
       
        if(password.length()>=min&&password.length()<=max){

            for(int i =0;i<password.length();i++){

                char c = password.charAt(i);

                if(Character.isUpperCase(c)){

                    upCount++;

                }

                if(Character.isLowerCase(c)){

                    loCount++;

                }

                if(Character.isDigit(c)){

                    digit++;

                }

                if(c>=33&&c<=46||c==64){

                    special++;

                }

            }

            if(special>=1&&loCount>=1&&upCount>=1&&digit>=1){

                Scanner myObj = new Scanner(System.in);

                System.out.println("This a valid password!");
       

                System.out.println("Please enter a secret word: ");

                String Secret = myObj.nextLine();

               

                System.out.println("The secret word is recieved, thank you!");
               
               
                System.out.println("Secret word: " +Secret);


               
                break;


            }

     

        }

     

        if(password.length()<min){

     

            for(int i =0;i<password.length();i++){

                char c = password.charAt(i);

                if(Character.isLowerCase(c)){

                    loCount++;

                }

                }

     

            if(loCount>0){

                System.out.println(" Password must be at least "+min+" characters:");

                System.out.println(" You did not meet requirements for uppercase");

                System.out.println(" You did not meet requirements for numbers");

                System.out.println(" You did not meet requiremnts for special character");

     

     

     

        }

        }

        else if(password.length()<min&&upCount>1){

            for(int i =0;i<password.length();i++){

            char c =password.charAt(i);

            if(Character.isLowerCase(c)){

                loCount++;

            }

             if(Character.isUpperCase(c)){

                upCount++;

            }

            }

            if(loCount>0&&upCount>0){

            System.out.println(" Password must be at least "+min+" characters:");

            System.out.println(" You need at least one digit:");

            System.out.println(" You need at least one special character:");

        }

        }

         if(password.length()>max||password.length()>=max&&upCount>1&&loCount>1&&digit>1){

             System.out.println(" Password has exceeded the limit .Limit is "+max+" chracters:");

                     System.out.println(" You need at least one special character:");

     

            }

          if(password.length()>=min&&password.length()<=max&&loCount>0&&upCount>0&&digit>0&&special==0){

             System.out.println(" You need at least a special character");

         }

          if(password.length()>=min&&password.length()<=max&&loCount>0&&upCount>0&&digit==0&&special==0){

             System.out.println(" You need at least one digit:");

             System.out.println(" You need at least one special chracter:");

         }

       }

    }
}


