/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author RONNY
 */
import java.util.Scanner;

public class ConjeturaCollatz {
    
    static int Numero;
    
    public static void main(String[] args){
        LeerNumero();
        conjeturaCollats();
    }
    
    public static void LeerNumero(){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("-- COLLATS --");
        System.out.println("Ingrese un numero: ");
        Numero = leer.nextInt();
    }
    
    public static void conjeturaCollats(){
        int i = Numero;
        
        System.out.println("---------------");
        System.out.println("Reaultado: ");
        System.out.println("...........");
        
        do {            
            if(i % 2 == 0){
                i /= 2;
            }else if(i > 1){
                i = i * 3 + 1;
            }
        Imprimir(i);
        } while (i > 1);    
    }
    
    public static void Imprimir(int Numero){
        if(Numero > 1){
            System.out.print(Numero + ", ");
        }else {
            System.out.print(Numero + "\n ");
        }
    }
}
