/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sokila;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

/**
 *
 * @author Administrator
 */
public class temp2 {

    static class TwoNumber {

        int num1, num2;

        public TwoNumber(int num1, int num2) {
            this.num1 = num1;
            this.num2 = num2;
        }
    }

    public static void main(String[] args) {
        Random rd = new Random();
        ArrayList<TwoNumber> al = new ArrayList<>();
        for (int i = 0; i < 20; ++i) {
            al.add(new TwoNumber(rd.nextInt()%10000, i));
        }
        Collections.sort(al, new Comparator<TwoNumber>() {
            @Override
            public int compare(TwoNumber o1, TwoNumber o2) {
                return o1.num1 - o2.num1;
            }
        });
        System.out.println("List sorted: ");
        al.stream().forEach((num) -> {
            System.out.println("num1: " + num.num1 + ", num2: " + num.num2);
        });
        
        HashSet hashset = new HashSet<>();
        
                
    }
}
