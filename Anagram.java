import java.util.Arrays;
import java.util.Scanner;

public class Anagram{
//fucntion checks if the strings are anagram or not
 public static boolean isAnagram(String str1, String str2)
 //comparing the length of both the strings are equal or not
 {
    if (str1.length() != str2.length())
//if length of the sttrings are not equal returns false
    return false;
//if lengths are equal executes	
    else
    {
//converting both the strings into character arrays
        char[] str1Array = str1.toCharArray();
        char[] str2Array = str2.toCharArray();
//sorting both the arrays
        Arrays.sort(str1Array);
        Arrays.sort(str2Array);
//comparing the strings
        return Arrays.equals(str1Array, str2Array);
    } 

 }
 public static void main(String[] args){
//creating a scanner object and mapping it to input stream
      Scanner sc = new Scanner(System.in);
//printing a message on the console requesting to enter the strings
      System.out.println("Please enter the 1st string : ");
      String str1 = sc.nextLine();

      System.out.println("Please enter the 2nd string : ");
      String str2 = sc.nextLine();
     //Removing the spaces between the strings and convert into lowercase
      str1 = str1.replaceAll("\\s", "").toLowerCase();
      str2 = str2.replaceAll("\\s", "").toLowerCase();
//calling fucntion
   if (isAnagram(str1, str2))
      System.out.println("Strings : "+ str1 +" and "+ str2 +" are Anagrams");
   else
      System.out.println("Strings : "+ str1 +" and "+ str2 +" are not Anagrams");
  
    }
}