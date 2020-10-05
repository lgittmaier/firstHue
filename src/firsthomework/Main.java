/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firsthomework;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
           System.out.println("Obergrenze festlegen");
        int o = Integer.parseInt(s.nextLine());
        
        EratosthenesPrimeSieve primeSieve = new EratosthenesPrimeSieve(o);
        
        primeSieve.isPrime(o);
        primeSieve.printPrime();
        primeSieve.primeAlgorithm();
    }
    
}
