/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sokila;

/**
 *
 * @author Administrator
 */
public class dq1 {

    static char[] rst = {96, 96, 96, 96, 96, 96, 96};

    static void rc(int j) {
        if (j == 7) {
            System.out.println((rst[0] + "") + (rst[1] + "") + (rst[2] + "") + (rst[3] + "") + (rst[4] + "") + (rst[5] + "") + (rst[6] + ""));
            return;
        }
        for (int i = 1; i <= 3; i++) {
            rst[j] = (char) (rst[j] + i);
            rc(j + 1);
            rst[j] = (char) 96;
        }
    }

    public static void main(String[] args) {
        rc(0);
    }

}
