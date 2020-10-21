
package passwords;
import java.util.*;
/**
 * @author Chris
 */
public class Passwords {

    
    public static void main(String[] args) {
    int Min = 10;
    int Max= 16;
    int Digit = 0;
    int Special = 0;
    int UpperC = 0;
    int LowerC = 0;
    boolean Citeria = true;
    String Password;

        System.out.println("The password must be at least 10 characters and 16 max, \n" 
                + "contains a uppercase letter, a lowercase, and a special character");
        
    Scanner input = new Scanner(System.in);

 
        System.out.println("\nPlease enter your password:");

        while(Citeria) {

        Password = input.nextLine();

        if(Password.length() >= Min && Password.length() <= Max){

            for(int i =0; i < Password.length(); i++){

                char c = Password.charAt(i);

                if(Character.isUpperCase(c)){
                    UpperC++;

                }

                if(Character.isLowerCase(c)){
                    LowerC++;
                }

                if(Character.isDigit(c)){
                    Digit++;
                }
                if(c >= 33 && c <= 46||c == 64){
                    Special++;

                }

            }
            
            if(Special >= 1 && LowerC >= 1 && UpperC >= 1 && Digit >= 1){

                Scanner myObj = new Scanner(System.in);
                
                System.out.println("This a valid password!");
                System.out.println("Now enter a secret word: ");
                String Secret = myObj.nextLine();
                System.out.println("The secret word is recieved, thank you!");
                System.out.println("Secret word: " +Secret);
                break;
    }
}
        if(Password.length() < Min){

            for(int i =0; i < Password.length(); i++){
                char c = Password.charAt(i);
                
                if(Character.isLowerCase(c)){
                    LowerC++;
                }
                }
        if(LowerC > 0){
            
                System.out.println(" Password must be at least " + Min + " characters:");
                System.out.println(" You did not meet requirements for uppercase");
                System.out.println(" You did not meet requirements for numbers");
                System.out.println(" You did not meet requiremnts for special character");
        }
        }
        else if(Password.length() < Min && UpperC > 1){

            for(int i =0; i < Password.length(); i++){

            char c = Password.charAt(i);

            if(Character.isLowerCase(c)){

                LowerC++;
            }

            if(Character.isUpperCase(c)){
                UpperC++;

            }
            }

            if(LowerC > 0 && UpperC > 0){

            System.out.println(" Password must be at least "+ Min + " characters:");

            System.out.println(" You need at least one digit:");

            System.out.println(" You need at least one special character:");

        }

        }
        
        if(Password.length() > Max || Password.length() >= Max && UpperC > 1 && LowerC > 1 && Digit > 1){

             System.out.println(" Password has exceeded the limit .Limit is " + Max + " chracters:");

                     System.out.println(" You need at least one special character:");

            }

          if(Password.length() >= Min && Password.length() <= Max && LowerC > 0 && UpperC > 0 && Digit > 0 && Special == 0){

             System.out.println(" You need at least a special character");

         }

          if(Password.length() >= Min && Password.length() <= Max && LowerC > 0 && UpperC > 0 && Digit == 0 && Special == 0){

             System.out.println(" You need at least one digit:");

             System.out.println(" You need at least one special chracter:");

         }

       }

    }

}

        
        
               