/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erastosthenesprimesieve;

/**
 *
 * @author Silke
 */
public class ErastosthenesPrimeSieve {
    
    double MAX;
    boolean[] notPrime;

    public ErastosthenesPrimeSieve(int max){
        this.MAX = max;
    }
    
    public boolean isPrime(int i){
        return notPrime[i+2];
    }
    
    public void printPrimes(){
        
        notPrime = new boolean[Integer.parseInt(MAX-2.0)];
        
        for(int i=2;i<MAX;i++){
           notPrime[i] = false;
        }
        
        for(int i=2;i<Math.sqrt(MAX);i++){
            if(!notPrime[i]){
                System.out.println(i);
            }
            for(int j=i*i;j<MAX;i++){
                notPrime[j] = true;
            }
        }
        
        for(int i= Integer.parseInt(Math.sqrt(MAX));i<MAX;i++){
            if(!notPrime[i]){
                System.out.println(i);
            }
        }
    }
}
