//This program will count the occurance of each character in a string

import java.util.HashMap;
import java.util.Scanner;

import javax.xml.stream.events.Characters;

public class Occurance {
    public static void main(String[] args) { 
CharacterCount("Test Automation Java Automation"); 
} 
  static void CharacterCount(String inputString) { 
      HashMap<String,Integer> charCountMap = new HashMap<>(); 
for(String s : inputString.split(" ")) 
{ 
   if(charCountMap.containsKey(s)) 
   { 
     charCountMap.put(s,charCountMap.get(s)+1); 
   } 
   else 
    { 
     charCountMap.put(s,1); 
    } 
} 

System.out.println("Count of Characters in a given string : " + 
charCountMap); 
     } 
  }

//Count of Characters in a given string : {Java=1, Automation=2, Test=1};



