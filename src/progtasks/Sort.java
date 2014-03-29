/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package progtasks;

/**
 *
 * @author Dejan
 */
public abstract class Sort {
    public static int[] bubbleSort(String sequence) {
        int length = sequence.length();
        int[] seqArr = new int[length];
        for(int i = 0; i < length; i++) {
            seqArr[i] = sequence.charAt(i)-48;
        }
        
        return bubbleSort(seqArr);
    }
    
    public static int[] bubbleSort(int[] sequence) {
        boolean sorted;
        do {
            sorted = true;
            for(int i = 0; i < sequence.length-1; i++) {
                int elemA = sequence[i];
                int elemB = sequence[i+1];
                if(elemA > elemB) {
                    sorted = false;
                    sequence[i] = elemB;
                    sequence[i+1] = elemA;
                }
                
            }   
        } while(!sorted);
        return sequence;
    }
    
}
