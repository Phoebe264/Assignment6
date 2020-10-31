/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author litong
 */
public class Main {

    public static void main(String[] args) {
        String input = "the sky is blue";
        String output = reverse(input);
        System.out.println(output);
        System.out.println();
        System.out.println();
    }
        public static String reverse(String s){
        String sOut = "";
        String []words = s.split(" ");
        for (int w = 0; w < words.length; w++) {
            sOut = sOut + words[words.length-1-w];
            if(w!=words.length-1)
                sOut = sOut + " ";
        }
        return sOut;
    }

}
