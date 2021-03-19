/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import java.util.Scanner;

/**
 *
 * @author vastv
 */
public class CalculadoraSimples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaração de Variáveis
        int n1,n2;
        
        //Instância e objetos de entrada
        Scanner entrada= new Scanner(System.in);
        
        //Apresentação do Sistema
        System.out.println("\n\t\t\t =Calculadora Simples=\n");
        
        //Apresentação da operação aritmética
        System.out.println("\n Soma Simples...");
        
        //Entradas
        System.out.print("Informe N1: ");
        n1 = entrada.nextInt();
        System.out.println("Informe N2: ");
        n2 = entrada.nextInt();
        
        //Processamento
        int total = n1 + n2;
        
        //Saída
        System.out.printf ("\n\t %d + %d = %d \n", n1,n2,total);
        
        
    }
    
}
