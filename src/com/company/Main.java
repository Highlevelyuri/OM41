package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
	int x []=new int  [35];

        boolean r = true;
        int sum =0;
        for ( int i =0; i<x.length; i++ ) {
            x[i] = random.nextInt(10000);
            sum += x[i];

            if (sum / 100000 >= 1) {
                System.out.println(r);

            }
          

        }


        System.out.println( " Массив:");
        for( int a : x){
            System.out.println( a + "  ");
        }





    }
}
