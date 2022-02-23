/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class UserProfiletest {
    public static void main (String [] args){
    Scanner in = new Scanner(System.in); 
  System.out.println("Enter an id: ");
     String givenId = in.nextLine();
   System.out.println("Select from the following genres: Comedy, Mystery,Drama, action");
   String givenGenre = in.nextLine();
   UserProfile User1 = new UserProfile(givenId, givenGenre);
   System.out.println("User Created");
   
}
}
