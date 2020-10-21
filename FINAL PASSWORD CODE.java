import java.util.Scanner;
public class Main {

public static void main(String[] args) {
   
    int min = 10;
    int max= 16;
    int digit = 0;
    int special = 0;
    int upCount = 0;
    int loCount = 0;
   
   
    boolean incorrect = true;
    String password;
   
    System.out.println("Hello, First please enter a complex password to protect your account. It must meet our security guidelines");
   
    System.out.println("\nThe password must be atleast 10 characters long, max of 16, have a uppercase letter, a lowercase, and a special character");
   
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

                System.out.println("This a valid password");
       

                System.out.println("Enter a secret word to go along with your password.");

                String Sword = myObj.nextLine();

               

                System.out.println("The word is recieved");
               
               
                System.out.println(Sword);


               
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

                System.out.println(" Password must be atleast "+min+" characters:");

                System.out.println(" You did not meet requirements for upper case");

                System.out.println(" You did not meet requirements for numbers");

                System.out.println(" You did not meet requiremnts for special chracter");

     

     

     

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

            System.out.println(" Password must be atleast "+min+" chracters:");

            System.out.println(" You need atleast one digit:");

            System.out.println(" You need atleast one special chracter:");

        }

        }

         if(password.length()>max||password.length()>=max&&upCount>1&&loCount>1&&digit>1){

             System.out.println(" Password has exceeded the limit .Limit is "+max+" chracters:");

                     System.out.println(" You need atleast one special chracter:");

     

            }

          if(password.length()>=min&&password.length()<=max&&loCount>0&&upCount>0&&digit>0&&special==0){

             System.out.println(" You need atleast a special chracter");

         }

          if(password.length()>=min&&password.length()<=max&&loCount>0&&upCount>0&&digit==0&&special==0){

             System.out.println(" You need atleast one digit:");

             System.out.println(" You need atleast one special chracter:");

         }

       }

    }
}
