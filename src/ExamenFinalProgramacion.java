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

public class ExamenFinalProgramacion {
    
    public int[][] Ejercicio1(int dimen, int numInit){        
       System.out.println("Ejercicio 1: ");
        int[][] matriz = new int[dimen][dimen];
        
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[0].length; j++) {
                
                if(j < dimen - i){
                    matriz[i][j] = numInit + (i + j) * (i + j + 1) / 2 + i;
                }else{
                    matriz[i][j] = 0;
                }
            }
        }
        return matriz;
    }
    
    public int[][] Ejercicio2(int dimen, int numInit){
        System.out.println("Ejercicio 2: ");
        int[][] matriz = new int[dimen][dimen];
        
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[0].length; j++) {
                
                if(j<dimen-i){
                    matriz[i][j] = numInit + (i + j) * (i + j + 1) / 2 + j;
                }else{
                    matriz[i][j] = 0;
                }
            }
        }
        return matriz;
    }
    
    public int[][] Ejercicio3(int dimen, int numInit){
        System.out.println("Ejercicio 3: ");
        int[][] matriz = new int[dimen][dimen];
        
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[0].length; j++) {
                
                if(j < dimen - i){
                    if((i + j) % 2 == 0){
                        matriz[i][j] = numInit + (i + j) * (i + j + 1) / 2 + j;
                    }else{
                        matriz[i][j] = numInit + (i + j) * (i + j + 1) / 2 + i;
                    }
                }else{
                    matriz[i][j] = 0;
                }
            }
        }
        return matriz;
    }
    
    public int[][] Ejercicio4(int dimen, int numInit){
        System.out.println("Ejercicio 4: ");
        int[][] matriz = new int[dimen][dimen];
        
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[0].length; j++) {
                
                if(j < dimen - i){
                    if((i + j) % 2 == 0){
                        matriz[i][j] = numInit + (i + j) * (i + j + 1) / 2 + i;
                    }else{
                        matriz[i][j] = numInit + (i + j) * (i + j + 1) / 2 + j;
                    }
                }else{
                    matriz[i][j] = 0;
                }
            }
        }
        return matriz;
    }
    
    public int[][] Ejercicio5(int dimen, int numInit){
        System.out.println("Ejercicio 5: ");
        int[][] matriz = new int[dimen][dimen];
        int contador = 0;
        
            for(int i = 0; i < matriz.length; i++) {
                for(int j = matriz[0].length - 1; j >= 0; j--) {
                    
                    if(contador <= i){
                        matriz[i][j] = numInit;
                        numInit++;
                        contador++;
                    }else{
                        matriz[i][j] = 0;
                    }
                } 
            contador = 0;
            }        
        return matriz;
    }
    
    public int[][] Ejercicio6(int dimen, int numInit){
        System.out.println("Ejercicio 6: ");
        int[][] matriz = new int[dimen][dimen];
        int contador = 0;
        
            for(int i = 0; i < matriz.length; i++) {
                for(int j = 0; j < matriz.length; j++) {

                    if (j < i + 1){
                        matriz[i][j] = numInit;
                        numInit++;
                        contador++;
                    }else{
                        matriz[i][j] = 0;
                    }   
                }
            contador = 0;
            }
        return matriz;
    }
    
    public int[][] Ejercicio7(int dimen, int numInit){
        System.out.println("Ejercicio 7: ");
        int[][] matriz = new int[dimen][dimen];
        int contador = 0;
        
            for(int i = 0; i < matriz.length; i++) {
               for(int j = 0; j < matriz.length; j++) {
                   
                    if(j < dimen - i){
                        matriz[i][j] = numInit;
                        numInit++;
                        contador++;
                    }else{
                        matriz[i][j] = 0;
                }
            } 
            contador = 0;
        }        
        return matriz;
    }
    
    public int[][] Ejercicio8(int dimen, int numInit){
        System.out.println("Ejercicio 8: ");
        int[][] matriz = new int[dimen][dimen];
        int contador = 0;
        
            for(int i = 0; i < matriz.length; i++) {
               for(int j = 0; j < matriz.length; j++) {
                   
                    if(j >= i){
                        matriz[i][j] = numInit;
                        numInit++;
                        contador++;
                    }else{
                        matriz[i][j] = 0;
                    }
                } 
            contador = 0;
            }        
        return matriz;
    }
    
    public int[][] Ejercicio9(int dimen, int numInit){
        System.out.println("Ejercicio 9: ");
        int[][] matriz = new int[dimen][dimen];
        int contador = 0;
        
            for(int i = 0; i < matriz.length; i++) {
                for(int j = 0; j < matriz.length; j++) {
                    
                    if(j >= dimen - (i + 1)){
                        matriz[i][j] = numInit;
                        numInit++;
                        contador++;
                    }else{
                        matriz[i][j] = 0;
                    }
                } 
            contador = 0;
            }
        return matriz;
    }
    
    public int[][] Ejercicio10(int dimen, int numInit){
        System.out.println("Ejercicio 10: ");
        int[][] matriz = new int[dimen][dimen];
        int contador = 0;
        
            for(int i = 0; i < matriz.length; i++) {
                for(int j = matriz[0].length - 1; j >= 0; j--) {
                    
                    if (j <= i){
                        matriz[i][j] = numInit;
                        numInit++;
                        contador++;
                    }else{
                        matriz[i][j] = 0;
                    }
                } 
            contador = 0;
            }
        return matriz;
    }
    
    public int[][] Ejercicio11(int dimen, int numInit){
        System.out.println("Ejercicio 11: ");
        int[][] matriz = new int[dimen][dimen];
        int contador = 0;
        
            for(int i = 0; i < matriz.length; i++) {
                for(int j = matriz[0].length - 1; j >= 0; j--) {
                    
                    if(j <= dimen - (i + 1)){
                        matriz[i][j] = numInit;
                        numInit++;
                        contador++;
                    }else{
                        matriz[i][j] = 0;
                    }
                } 
            contador = 0;
            }
        return matriz;
    }
    
    public int[][] Ejercicio12(int dimen, int numInit){
        System.out.println("Ejercicio 12: ");
        int[][] matriz = new int[dimen][dimen];
        int contador = 0;
        
            for(int i = 0; i < matriz.length; i++) {
                for(int j = matriz[0].length - 1; j >= 0; j--) {
                    
                    if(j >= i){
                        matriz[i][j] = numInit;
                        numInit++;
                        contador++;
                    }else{
                        matriz[i][j] = 0;
                    }
                } 
            contador = 0;
            }
        return matriz;
    }
    
    public int[][] Ejercicio13(int dimen, int numInit){
        System.out.println("Ejercicio 13: ");
        int[][] matriz = new int[dimen][dimen];
        int contador = 0;
        
            for(int i = 0; i < matriz.length; i++) {
                for(int j = 0; j < matriz.length; j++) {
                    
                    if(j < dimen - i){
                        matriz[j][i] = numInit;
                        numInit++;
                        contador++;
                    }else{
                        matriz[i][j] = 0;
                    }
                } 
            contador = 0;
            }
        return matriz;
    }
    
    public int[][] Ejercicio14(int dimen, int numInit){
        System.out.println("Ejercicio 14: ");
        int[][] matriz = new int[dimen][dimen];
        int contador = 0;
        
            for(int i = 0; i < matriz.length; i++) {
                for(int j = 0; j < matriz.length; j++) {
                    
                    if(j <= i){
                        matriz[j][i] = numInit;
                        numInit++;
                        contador++;
                    }else{
                        matriz[j][i] = 0;
                    }
                } 
            contador = 0;
            }
        return matriz;
    }
    
    public int[][] Ejercicio15(int dimen, int numInit){
        System.out.println("Ejercicio 15: ");
        int[][] matriz = new int[dimen][dimen];
        int contador = 0;
        
            for(int i = 0; i < matriz.length; i++) {
                for(int j = matriz[0].length - 1; j >= 0; j--) {
                    
                    if(j >= i){
                        matriz[j][i] = numInit;
                        numInit++;
                        contador++;
                    }else{
                        matriz[j][i] = 0;
                    }
                } 
            contador = 0;
            }
        return matriz;
    }
    
    public int[][] Ejercicio16(int dimen, int numInit){
        System.out.println("Ejercicio 16: ");
        int[][] matriz = new int[dimen][dimen];
        int contador = 0;
          
            for(int i = 0; i < matriz.length; i++) {
                for(int j = matriz[0].length - 1; j>=0; j--) {
                    
                    if(contador <= i){
                        matriz[j][i] = numInit;
                        numInit++;
                        contador++;
                    }else{
                        matriz[j][i] = 0;
                    }
                } 
            contador = 0;
            }        
        return matriz;
    }
    
    public int[][] Ejercicio17(int dimen, int numInit){
        System.out.println("Ejercicio 17: ");
        int[][] matriz = new int[dimen][dimen];
        int contador = 0;
        
            for(int j = matriz[0].length - 1; j >= 0; j--) {
                for(int i = 0; i < matriz.length; i++) {
                    
                    if(contador <= j){
                        matriz[i][j] = numInit;
                        numInit++;
                        contador++;
                    }else{
                        matriz[i][j] = 0;
                    }
                } 
            contador = 0;
            }        
        return matriz;
    }
    
    public int[][] Ejercicio18(int dimen, int numInit){
        System.out.println("Ejercicio 18: ");
        int[][] matriz = new int[dimen][dimen];
        int contador = 0;
        
            for(int i = matriz[0].length - 1; i >= 0; i--) {
                for(int j = 0; j < matriz.length; j++) {
                    
                    if(j < dimen - i){
                        matriz[j][i] = numInit;
                        numInit++;
                        contador++;
                    }else{
                        matriz[i][j] = 0;
                    }
                } 
            contador = 0;
            }        
        return matriz;
    }
    
    public int[][] Ejercicio19(int dimen, int numInit){
        System.out.println("Ejercicio 19: ");
        int[][] matriz = new int[dimen][dimen];
        int contador = 0;
        
            for(int i = matriz[0].length - 1; i >= 0; i--) {
                for(int j = matriz[0].length - 1; j >= 0; j--) {
                    
                    if(j >= dimen - (i + 1)){
                        matriz[j][i] = numInit;
                        numInit++;
                        contador++;
                    }else{
                        matriz[i][j] = 0;
                    }
                } 
            contador = 0;
            }        
        return matriz;
    }
    
    public int[][] Ejercicio20(int dimen, int numInit){
        System.out.println("Ejercicio 20: ");
        int[][] matriz = new int[dimen][dimen];
        int contador = 0;
        
            for(int i = matriz[0].length - 1; i >= 0; i--) {
                for(int j = matriz[0].length - 1; j >= 0; j--) {
                    
                    if(j >= i){
                        matriz[j][i] = numInit;
                        numInit++;
                        contador++;
                    }else{
                        matriz[j][i] = 0;
                    }
                } 
            contador = 0;
            }        
        return matriz;
    }
    
    public int[][] Ejercicio21(int dimen, int numInit){
        System.out.println("Ejercicio 21: ");
        int[][] matriz = new int[dimen][dimen];
        int contador = 0;
        
            for(int i = 0; i < matriz.length; i++) {
                if(contador % 2 == 0){
                    for(int j = 0; j < matriz.length; j ++) {
                        matriz[j][i] = numInit;
                        numInit++;
                        contador++;
                    }
                }else{
                    for(int j = matriz[0].length - 1; j >= 0; j--) {
                        matriz[j][i] = numInit ;
                        numInit++;
                        contador++;
                    }
                } 
            } 
        contador = 0;         
        return matriz;
    }
    
    public int[][] Ejercicio22(int dimen, int numInit){
        System.out.println("Ejercicio 22: ");
        int[][] matriz = new int[dimen][dimen];
        int contador = 0;
        
            for(int i = 0; i < matriz.length; i++) {
                if(contador % 2 == 0){
                    for(int j = matriz[0].length - 1; j >= 0; j--) {
                        matriz[j][i] = numInit; 
                        numInit++;
                        contador++;
                    }
                }else{
                    for(int j = 0; j< matriz.length; j ++) {
                        matriz[j][i] = numInit;
                        numInit++;
                        contador++;
                    }
                } 
            } 
        contador = 0;         
        return matriz;
    }
    
    public int[][] Ejercicio23(int dimen, int numInit){
        System.out.println("Ejercicio 23: ");
        int[][] matriz = new int[dimen][dimen];
        int contador = 0;
        
            for(int i = matriz[0].length - 1; i >= 0; i--) {
                if(contador % 2 == 0){
                    for(int j = 0; j < matriz.length; j ++) {
                        matriz[j][i] = numInit; 
                        numInit++;
                        contador++;
                    }
                }else{
                    for(int j = matriz[0].length - 1; j >= 0; j--) {
                        matriz[j][i] = numInit;
                        numInit++;
                        contador++;
                    }
                } 
            } 
        contador = 0;         
        return matriz;
    }
    
    public int[][] Ejercicio24(int dimen, int numInit){
        System.out.println("Ejercicio 24: ");
        int[][] matriz = new int[dimen][dimen];
        int contador = 0;
        
            for(int i = matriz[0].length - 1; i >= 0; i--) {
                if(contador % 2 == 0){
                    for(int j = matriz[0].length - 1; j >= 0; j--) {
                        matriz[j][i] = numInit; 
                        numInit++;
                        contador++;
                    }
                }else{
                    for(int j = 0; j < matriz.length; j ++) {
                        matriz[j][i] = numInit;
                        numInit++;
                        contador++;
                    }
                } 
            } 
        contador = 0;         
        return matriz;
    }
    
    public int[][] Ejercicio25(int dimen, int numInit){
        System.out.println("Ejercicio 25: ");
        int[][] matriz = new int[dimen][dimen];
        int contador = 0;
            
            for(int i = 0; i < matriz.length; i ++) {
                if(contador % 2 == 0){
                    for(int j = 0; j < matriz.length; j ++) {
                        matriz[i][j] = numInit; 
                        numInit++;
                        contador++;
                    }
                }else{
                    for(int j = matriz[0].length - 1; j >= 0; j--) {  
                        matriz[i][j] = numInit;
                        numInit++;
                        contador++;
                    }
                } 
            } 
        contador = 0;         
        return matriz;
    }
    
    public int[][] Ejercicio26(int dimen, int numInit){
        System.out.println("Ejercicio 26: ");
        int[][] matriz = new int[dimen][dimen];
        int contador = 0;
        
            for(int i = 0; i < matriz.length; i ++) {
                if(contador % 2 == 0){
                    for(int j = matriz[0].length - 1; j >= 0; j--) { 
                        matriz[i][j] = numInit; 
                        numInit++;
                        contador++;
                    }
                }else{
                    for(int j = 0; j < matriz.length; j ++) {
                        matriz[i][j] = numInit;
                        numInit++;
                        contador++;
                    }
                } 
            } 
        contador = 0;         
        return matriz;
    }
    
    public int[][] Ejercicio27(int dimen, int numInit){
        System.out.println("Ejercicio 27: ");
        int[][] matriz = new int[dimen][dimen];
        int contador = 0;
        
            for(int i = matriz.length - 1; i >= 0; i--) {
                if(contador % 2 == 0){
                    for(int j = matriz[0].length - 1; j >= 0; j--) {
                        matriz[i][j] = numInit;
                        numInit++;
                    }
                }else{
                    for(int j = 0; j < matriz[0].length; j++) {
                        matriz[i][j] = numInit;
                        numInit++;
                    }
                }
            contador++;   
            }
        return matriz;
    }
    
    public int[][] Ejercicio28(int dimen, int numInit){
        System.out.println("Ejercicio 28: ");
        int[][] matriz = new int[dimen][dimen];
        int contador = 0;
        
            for(int i = matriz.length - 1; i >= 0; i--) {
                if(contador % 2 == 0){
                    for(int j = 0 ; j < matriz[0].length; j++) {
                        matriz[i][j] = numInit;
                        numInit++;
                    }
                }else{    
                    for(int j = matriz[0].length - 1; j >= 0; j--) {
                        matriz[i][j] = numInit;
                        numInit++;
                    }
                }
            contador++;   
            }
        return matriz;
    }
    
    public int[][] Ejercicio29(int dimen, int numInit){
        System.out.println("Ejercicio 29: ");
        int[][] matriz = new int[dimen][dimen];
        
            for(int c = 0; c < dimen / 2; c++) {
                for(int ldS = c; ldS < dimen - c - 1; ldS++) {
                    matriz[c][ldS] = numInit++;   
                }               
                for(int fil = c; fil < dimen - c - 1; fil++) {
                    matriz[fil][dimen - 1 - c] = numInit++;   
                }            
                for(int col = dimen - c - 1; col > c; col--) {
                    matriz[dimen - 1 - c][col] = numInit++;
                }
                for(int ldI = dimen - c - 1; ldI > c; ldI--) {
                    matriz[ldI][c] = numInit++;  
                } 
            }
            if(dimen % 2 != 0){
                matriz[dimen / 2][dimen / 2] = numInit;
            }
        return matriz;
    }
    
    public int[][] Ejercicio30(int dimen, int numInit){
        System.out.println("Ejercicio 30: ");
        int[][] matriz = new int[dimen][dimen];
        
            for(int c = 0; c < dimen / 2; c++) {
                for(int ldS = c; ldS < dimen - c - 1; ldS++) {
                    matriz[ldS][dimen - 1 - c] = numInit++;   
                }
                for(int fil = dimen - c - 1; fil > c; fil--) {
                    matriz[dimen - 1 - c][fil] = numInit++;
                }
                for(int col = dimen - c - 1; col > c; col--) {
                    matriz[col][c] = numInit++;
                }
                for(int ldI = c; ldI < dimen - c - 1; ldI++) {
                    matriz[c][ldI] = numInit++;
                }
            }
            if(dimen % 2 != 0){
                matriz[dimen / 2][dimen / 2] = numInit;
            }
        return matriz;
    }
    
    public int[][] Ejercicio31(int dimen, int numInit){
        System.out.println("Ejercicio 31: ");
        int[][] matriz = new int[dimen][dimen];
        
            for(int c = 0; c < dimen / 2; c++) {
                for(int ldS = dimen - c - 1; ldS > c; ldS--) {
                    matriz[dimen - 1 - c][ldS] = numInit++;
                }
                for(int fil = dimen - c - 1; fil > c; fil--) {
                    matriz[fil][c] = numInit++;
                } 
                for(int col = c; col < dimen - c - 1; col++) {
                    matriz[c][col] = numInit++;
                }
                for(int ldI = c; ldI < dimen - c - 1; ldI++) {
                    matriz[ldI][dimen - 1 - c] = numInit++;
                }
            } 
            if(dimen % 2 != 0){
                matriz[dimen / 2][dimen / 2] = numInit;
        }
    return matriz;
    }
    
    public int[][] Ejercicio32(int dimen, int numInit){
        System.out.println("Ejercicio 32: ");
        int[][] matriz = new int[dimen][dimen];
        
            for(int c = 0; c < dimen / 2; c++) {
                for(int ldS = dimen - c - 1; ldS > c; ldS--) {
                    matriz[ldS][c] = numInit++;
                } 
                for(int fil = c; fil < dimen - c - 1; fil++) {
                    matriz[c][fil] = numInit++;
                }
                for(int col = c; col < dimen - c - 1; col++) {
                    matriz[col][dimen - 1 - c] = numInit++;
                } 
                for(int ldI = dimen - c - 1; ldI > c; ldI--) {
                    matriz[dimen - 1 - c][ldI] = numInit++;
                }
            }
            if(dimen % 2 != 0){
                matriz[dimen / 2][dimen / 2] = numInit;
            }
    return matriz;
    }
    
    public int[][] Ejercicio33(int dimen, int numInit){
        System.out.println("Ejercicio 33: ");
        int[][] matriz = new int[dimen][dimen];
            
            for(int c = 0; c < dimen / 2; c++) {
                for(int ldS = dimen - c - 1; ldS >= c; ldS--) {
                    matriz[c][ldS] = numInit++;
                }            
                for(int fil = c; fil < dimen - c - 1; fil++) {
                matriz[fil + 1][c] = numInit++;
                }
                for(int col = c+1; col <= dimen - c - 1; col++) {
                matriz[dimen - c - 1][col] = numInit++;
                }         
                for(int ldI = dimen - c - 2; ldI > c; ldI--) {
                matriz[ldI][dimen - c - 1] = numInit++;
                } 
            } 
            if(dimen % 2 != 0){
                matriz[dimen / 2][dimen / 2] = numInit;
            }    
    return matriz;
    }
    
    public int[][] Ejercicio34(int dimen, int numInit){
        System.out.println("Ejercicio 34: ");
        int[][] matriz = new int[dimen][dimen];
        
            for(int c = 0; c < dimen / 2; c++) {
                for(int ldS = c; ldS <= dimen - c - 1; ldS++) {
                    matriz[ldS][c] = numInit++;
                }
                for(int fil = c + 1; fil <= dimen - c - 1; fil++) {
                    matriz[dimen - 1 - c][fil] = numInit++;   
                }
                for(int col = dimen - c - 1; col >= c; col--) {
                    matriz[col][dimen - 1 - c] = numInit++;
                }
                for(int ldI = dimen - c - 2; ldI > c; ldI--) {
                    matriz[c][ldI] = numInit++;  
                }  
            }
            if(dimen % 2 != 0){
                matriz[dimen / 2][dimen / 2] = numInit;
            }
    return matriz;
    }
    
    public int[][] Ejercicio35(int mn, int numInit){
        System.out.println("Ejercicio 35: ");
        int matriz[][] = new int[mn][mn];
        int m,m1,m2,n,n1;
        
            for(m = matriz.length - 1; m >= matriz.length / 2; m--) {
                for(n = (mn - 1)- m ;n <= m; n++) {
                    matriz[m][n] = numInit++;
                }
                for(m1 = n - 2; m1 >= (mn - 1) - m; m1--) {
                    matriz[m1][m] = numInit++;
                }
                for(n1 = n - 2; n1 >= (mn - 1) - m; n1--) {
                    matriz[m1 + 1][n1] = numInit++; 
                }
                for(m2 = n1 + 2; m2 < n - 1; m2++){
                    matriz[m2][n1 + 1] = numInit++;
                }
            }
        return matriz;
    }
    
    public int[][] Ejercicio36(int dimen, int numInit){
        System.out.println("Ejercicio 36: ");
        int[][] matriz = new int[dimen][dimen];
            
            for(int prin = 0; prin < dimen / 2; prin++) {
                for(int ldx = dimen - prin - 1; ldx > prin; ldx--) {
                    matriz[ldx][dimen - prin - 1] = numInit++;
                }
                for(int lsx = dimen - prin - 1; lsx > prin; lsx--) {
                    matriz[prin][lsx] = numInit++;  
                } 
                for(int lxx = prin; lxx < dimen - prin - 1; lxx++) {
                    matriz[lxx][prin] = numInit++;
                }
                for(int lix = prin; lix < dimen - prin - 1; lix++) {
                    matriz[dimen - prin - 1][lix] = numInit++;
                }
            } 
            if(dimen % 2 != 0){
                matriz[dimen / 2][dimen / 2] = numInit;
            }    
    return matriz;
    }
    
    public void imprimir(int[][] matriz){
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        ExamenFinalProgramacion or = new ExamenFinalProgramacion();
        System.out.println("Ingrese la dimencion de la matriz: ");
        int din = o.nextInt();
        System.out.println("Ingrese el numero de inicio: ");
        int ini = o.nextInt();
        System.out.println("\n");
            or.imprimir(or.Ejercicio1(din, ini));
            or.imprimir(or.Ejercicio2(din, ini));
            or.imprimir(or.Ejercicio3(din, ini));
            or.imprimir(or.Ejercicio4(din, ini));
            or.imprimir(or.Ejercicio5(din, ini));
            or.imprimir(or.Ejercicio6(din, ini));
            or.imprimir(or.Ejercicio7(din, ini));
            or.imprimir(or.Ejercicio8(din, ini));
            or.imprimir(or.Ejercicio9(din, ini));
            or.imprimir(or.Ejercicio10(din, ini));
            or.imprimir(or.Ejercicio11(din, ini));
            or.imprimir(or.Ejercicio12(din, ini));
            or.imprimir(or.Ejercicio13(din, ini));
            or.imprimir(or.Ejercicio14(din, ini));
            or.imprimir(or.Ejercicio15(din, ini));
            or.imprimir(or.Ejercicio16(din, ini));
            or.imprimir(or.Ejercicio17(din, ini));
            or.imprimir(or.Ejercicio18(din, ini));
            or.imprimir(or.Ejercicio19(din, ini));
            or.imprimir(or.Ejercicio20(din, ini));
            or.imprimir(or.Ejercicio21(din, ini));
            or.imprimir(or.Ejercicio22(din, ini));
            or.imprimir(or.Ejercicio23(din, ini));
            or.imprimir(or.Ejercicio24(din, ini));
            or.imprimir(or.Ejercicio25(din, ini));
            or.imprimir(or.Ejercicio26(din, ini));
            or.imprimir(or.Ejercicio27(din, ini));
            or.imprimir(or.Ejercicio28(din, ini));
            or.imprimir(or.Ejercicio29(din, ini));
            or.imprimir(or.Ejercicio30(din, ini));
            or.imprimir(or.Ejercicio31(din, ini));
            or.imprimir(or.Ejercicio32(din, ini));
            or.imprimir(or.Ejercicio33(din, ini));
            or.imprimir(or.Ejercicio34(din, ini));
            or.imprimir(or.Ejercicio35(din, ini));
            or.imprimir(or.Ejercicio36(din, ini));

    }
}
