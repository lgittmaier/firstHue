/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firsthomework;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class EratosthenesPrimeSieve implements PrimeSieve{
    private int o;

    public EratosthenesPrimeSieve(int o) {
        this.o = o;
    }

    @Override
    public boolean isPrime(int p) {
        boolean prime = true;
        
        if(p <= 1) {
            prime = false;
        }else{
            for(int i = 2; i <= p /2; i++){
                if((p%i) == 0){
                    prime = false;
                    break;
                }
            }
        }
        return prime;
    }

    @Override
    public void printPrime() {
        for(int i = 2; i <= o; i++){
            boolean prime = true;
            
            for(int x = 2; x < i && prime; x++){
                if((i%x) == 0){
                    prime = false;
                }
            }
            if(prime){
            System.out.println(i + " is Prime");
        }
        
        }
    }
    
    public void primeAlgorithm(){
        List<Integer> primes = new ArrayList<>();
        List<Integer> notPrimes = new ArrayList<>();
        
        for(int i = 2; i <= o; i++){
            if(isPrime(i)){
                primes.add(i);
            }else{
                notPrimes.add(i);
            }
        }
        for(int i: notPrimes){
            for(int x : primes){
                for(int y: primes){
                    if((y +x) == i){
                        System.out.println(i + " Summe:" + i + " = " + x + "+" + y);
                    }
                }
            }
        }
    }
    
    
}
