/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questao04;

/**
 *
 * @author guime
 */
import java.util.Scanner;
public class Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       System.out.println("Indique o tamanho de n:");
       int n = entrada.nextInt();
       System.out.println("Indique o tamanho de m:");
       int m = entrada.nextInt();
       int [] X = new int[n];
       int [] Y = new int[m];
       int [] Z = new int[n+m];
       System.out.println("Indique valores de X:");
       for(int i=0;i<n;i++){
           X[i]=entrada.nextInt();
       }
       System.out.println("Indique valores de Y:");
       for(int i=0;i<m;i++){
           Y[i] = entrada.nextInt();
       }
       int k  = 0;
       for (int i = 0; i < n; i++) {
            boolean jaExiste = false;
            for (int j = 0; j < k; j++) {
                if (X[i] == Z[j]) {
                    jaExiste = true;
                    break;
                }
            }
            if (!jaExiste) {
                Z[k] = X[i];
                k++;
            }
        }
        
        for (int i = 0; i < m; i++) {
            boolean jaExiste = false;
            for (int j = 0; j < k; j++) {
                if (Y[i] == Z[j]) {
                    jaExiste = true;
                    break;
                }
            }
            if (!jaExiste) {
                Z[k] = Y[i];
                k++;
            }
        }
        System.out.println("Uniao Z:");
        for (int i = 0; i < k; i++) {
            System.out.println(Z[i]);
        }
    }
}
