/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nghia.mathutil.main;

import com.nghia.mathutil.core.MathUtility;

/**
 *
 * @author Vinacenter
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        System.out.println("1st upload form Local to GitHub!!!");
//        System.out.println("Welcome to GitHub");
        //test trâu bò

        long expected = 120; // tui kì vọng hàm tính giai thừa = 120
        long actual = 5; // nếu đưa vào 5)
        int input = 5;
        actual = MathUtility.getFactorial(input); // xem ói ra mấy
        System.out.println("5!: Expected: " + expected + "; Actual: " + actual);
        // một test  case, 1 tình huống xài hàm, test hàm, dùng hàm
        
        //case 2, 0! thì sao???
        expected = 1;
        input = 0;
        actual = MathUtility.getFactorial(input);
        System.out.println("0!: Expected: " + expected + "; Actual: " + actual);
        
        //case 3, 2! thì sao???
        expected = 1;
        input = 2;
        actual = MathUtility.getFactorial(input);
        System.out.println("2!: Expected: " + expected + "; Actual: " + actual);
        
        //case 4, -1! thì sao???
        expected = 1;
        input = -1;
        actual = MathUtility.getFactorial(input);
        System.out.println("-1!: Expected: " + expected + "; Actual: " + actual);
    }
    
}
