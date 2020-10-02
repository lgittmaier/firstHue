/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firsthomework;

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
            System.out.println(i + "is Prime");
        }
        
        }
    }
    
    
    
    
}
