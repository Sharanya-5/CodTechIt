import java.util.*;
public class Chatbot
{
     static void generateRespone(String response)
     {
        //System.out.println("User: "+input);
          System.out.println("ChatBot: "+response+"\n");
     }
     public static void main(String args[])
     {
          Scanner sc=new Scanner(System.in);
          System.out.println("\nWelcome!I'm ChatBot!!How can I assist you today\n");
          while(true)
          {
               System.out.print("You:");
               String userInput=sc.nextLine();
               
                userInput=userInput.toLowerCase();
               if(userInput.contains("hello") || userInput.contains("hi"))
               generateRespone("Hi there!!");
              else if(userInput.contains("how are you"))
               generateRespone( "thanks for asking! I'm happy for asking about me, I'm fine and you ?");
              else if(userInput.contains("weather"))
               generateRespone("hiCurrently, the weather is sunny with a temperature of 20 degrees Celsius.");
              else if(userInput.contains("what is the full form of bot?"))
               generateRespone("Build,Operate,Transfer");
              else if(userInput.contains("news"))
               generateRespone("Here are some of the latest news headlines...");
              else if(userInput.contains("any internship opportunities for btech students?"))
               generateRespone("yes! CodTech IT Solutions currently providing internships for btech students");
               else if(userInput.contains("thank you"))
               generateRespone("You're welcome!if you have any more questions,feel free to ask.");
               else if(userInput.contains("bye"))
               {
                    generateRespone("Goodbye! Have a great day!");
                     System.exit(0);
               }
               else {
                generateRespone( "I'm sorry, I didn't understand that. Can you please rephrase?");
            }
           }
      }
}
               