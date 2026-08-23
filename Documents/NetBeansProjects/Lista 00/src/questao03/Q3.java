/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questao03;

/**
 *
 * @author guime
 */
import java.util.Scanner;
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escreva o valor de n:");
        int n = entrada.nextInt();
        int [] programacao_modular = new int[n];
        int [] calculo = new int[n];
        int [] intersecao = new int[n];
        int x = 0;
        System.out.println("Matricula de programacao modular:");
        for(int i=0;i<n;i++){
            programacao_modular[i] = entrada.nextInt();
        }
        System.out.println("Matricula de calculo:");
        for(int i=0;i<n;i++){
            calculo[i] = entrada.nextInt();
        }
        System.out.println("Intersecao: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(programacao_modular[i] == calculo[j]){
                   intersecao[x]=programacao_modular[i];x++;
                }
            }
            
        }
        for(int i=0;i<x;i++){
            System.out.println(intersecao[i]);
        }
    }    
}
