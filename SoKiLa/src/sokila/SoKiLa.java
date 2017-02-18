/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sokila;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class SoKiLa {

    static int[] timUoc(int number) {
        int sum = 0;
        ArrayList<Integer> u = new ArrayList<>();
        for (int i = 1; i * i <= number; ++i) {
            if (number % i == 0) {
                u.add(i);
                u.add(number / i);
                sum += (i + number / i);
            }
        }
        int sq = (int) Math.sqrt(number);
        if (sq * sq == number) {
            u.remove(u.size() - 1);
            sum -= sq;
        }
        Collections.sort(u);
        int[] u2 = new int[u.size() + 1];
        int i = 0;
        for (int j : u) {
            u2[i] = j;
            ++i;
        }
        u2[i] = sum - number;
        return u2;
    }

    static void booleanFill(boolean[] arr, boolean value) {
        int len = arr.length;
        if (len > 0) {
            arr[0] = value;
        }
        for (int i = 1; i < len; i += i) {
            System.arraycopy(arr, 0, arr, i, ((len - i) < i) ? (len - i) : i);
        }
    }

    static boolean check(int[] u) {
        int len = u.length;
        int max = len - 2;
        boolean[] dp = new boolean[u[max] + 1];
        booleanFill(dp, false);
        dp[0] = true;
        for (int i = 0; i < max; ++i) {
            for (int j = u[max]; j >= u[i]; --j) {
                if (dp[j - u[i]]) {
                    dp[j] = true;
                }
            }
            if (dp[u[max]]) {
                return true;
            }
        }
        return dp[u[max]];
    }

    public static void main(String[] args) {

        try {
            FileWriter fw = new FileWriter("Weird1m.txt");

            for (int i = 1; i < 100000; ++i) {
                int[] u = timUoc(i);
                int len = u.length;
                if (u[len - 1] > u[len - 2]) {
                    if (!check(u)) {
//                        fw.write(i + " ");
                        System.out.println(i + " ");
                    }
                }
            }
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(SoKiLa.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
