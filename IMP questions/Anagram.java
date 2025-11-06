package Practice;

import java.util.Arrays;

public class Anagram
{
  public static void main(String[]args)
  {
	  String word = "silent";
	  String word1="listen";
	  boolean con;
	  //SORTIING A STRING WORD
	  char charArray[]=word.toCharArray();
	  Arrays.sort(charArray);
	  System.out.println(new String(charArray));
	  
	//SORTIING A STRING WORD
	  char charArray1[]=word1.toCharArray();
	  Arrays.sort(charArray);
	  System.out.println(new String(charArray));
	  
	  
	  //ASSINGING NEW STRING INTO A VARIABLE
	  String newword = new String(charArray);
	  
	  //COMPARING THE LENGTHS OF BOTH STRINGS
	  if(word.length() != newword.length())
	  {
		  System.out.println(word+" is not an anagram");
	  }
	  
	  
	  for(int i=0;i<word.length();i++)
	  {
		  if (charArray[i] == charArray1[i])
		  {
			 con=true;
		  }
		  else
		  {
			  con=false;
		  }
	  }
	  
	  if(con=true) 
	  {
		  System.out.println(word+word1+" are anagrams");
	  }
	  else
	  {
		  System.out.println(word+word1+" are not anagrams");
	  }
	  
  }
}
