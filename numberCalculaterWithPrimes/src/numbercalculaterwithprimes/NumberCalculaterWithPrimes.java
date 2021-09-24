/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbercalculaterwithprimes;

/**
 *
 * @author Tamino
 */
public class NumberCalculaterWithPrimes {

    int MAX;

    public NumberCalculaterWithPrimes(int MAX) {
        this.MAX = MAX;
    }

    public void calculateNumers() {
        ErastosthenesPrimeSieve primeSieve = new ErastosthenesPrimeSieve(MAX);

        for (int i = 2; i < MAX; i++) {
            for (int j = 2; j < MAX/2; j++) {
                if (primeSieve.isPrime(j)) {
                    if(primeSieve.isPrime(i-j)){
                        System.out.println(i + " summe : " + i + " = " + j + " + " + (i-+j));
                        break;
                    }
                }
            }
        }
    }
}
