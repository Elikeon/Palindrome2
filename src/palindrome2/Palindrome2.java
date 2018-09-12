/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package palindrome2;
import javax.swing.*;
/**
 *
 * @author jacra1226
 */
public class Palindrome2 {

 public static void main(String[] args) {
        String palindrome = JOptionPane.showInputDialog("words that are the same forwards and backwards are caled palindromes This program determines if a words is a palindrome" + "\n Enter a word:"); 
                String palindromeCon = palindrome.toLowerCase();
                palindromeCon +=" ";
                String reverse = "";
               String word; 
                int spacePos;
                
                while(palindromeCon.length()>0) {
                  spacePos = palindromeCon.indexOf(" ");
                 word = palindromeCon.substring(0,spacePos);
                            palindromeCon = palindromeCon.substring (spacePos + 1, palindromeCon.length());          
               
                
                
                
                for(int i = word.length() -1; i >= 0; i--)
        {
            
            reverse += word.charAt(i);
        }
                if(reverse.equals(word)){
        System.out.println(word + " Is a palindrome"); 
        reverse = ""; 
                }
             else   if(!reverse.equals(word)){
                    System.out.println(word + " Isnt a palindrome"); 
                    reverse = ""; 
                }
 }     
                    
 }
}
