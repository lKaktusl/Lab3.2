package com.company;

public class Main {

    public static void main(String[] args) {
	double a = 1;
	    for (double i = 2; i <= 10000; i++) {
	        if (i%2 == 0) {
	            a-=1/i;
            } else {
	            a+=1/i;
            }
            System.out.println(a);
        }
        System.out.println("Result: " + a);
    }
}