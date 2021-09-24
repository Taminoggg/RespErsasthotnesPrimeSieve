/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erastosthenesprimesieve;

/**
 *
 * @author Tamino
 */
public class ErastosthenesPrimeSieve1 {

    private int MAX;

    public ErastosthenesPrimeSieve1(int max) {
        this.MAX = max;
    }

    public boolean isPrime(int number) {
        if (number <= 1) {
               return false;
           }
           for (int i = 2; i <= Math.sqrt(number); i++) {
               if (number % i == 0) {
                   return false;
               }
           }
           return true;
    }

    public void printPrimes() {
        boolean[] isPrime = new boolean[MAX];

        for (int i = 2; i < MAX; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i < MAX; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < MAX;j=j+i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 2; i < MAX; i++) {
            if (isPrime[i]) {
                System.out.println(i);
            }
        }
    }
}
