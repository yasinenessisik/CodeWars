package org.example;
/*
Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.

Examples
pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
pigIt('Hello world !');     // elloHay orldway !
 */
public class PigLatin {
    public static void main(String[] args) {
        System.out.println(pigIt("Pig latin is cool !"));
    }

    public static String pigIt(String str) {
        String[] words = str.strip().split(" ");
        String newStr = new String();
        for (int i = 0; i< words.length; i++){
            if(32<words[i].charAt(0) && words[i].charAt(0)<48){
                newStr += words[i];
                continue;
            }
            newStr += words[i].substring(1);
            newStr += words[i].charAt(0);
            if(i == words.length-1) {
                newStr += "ay";
            }else
                newStr += "ay ";
        }
        return newStr;    }
}


