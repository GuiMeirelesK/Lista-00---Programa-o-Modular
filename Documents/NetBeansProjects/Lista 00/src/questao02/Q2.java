/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questao02;

import java.util.Scanner;
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Valores x,y,z:");
        int x = entrada.nextInt();
        int y = entrada.nextInt();
        int z = entrada.nextInt();
        int valores[] = {x,y,z};
        int maior = valores[0];
        int menor = valores[0];
        for(int num:valores){
            if (num > maior){
                maior = num;
            }
            else if(num < menor){
                menor = num;
            }
        }
        System.out.println("Maior:"+maior);
        System.out.println("Menor:"+menor);
        if (y < x && x < z){
        System.out.println(x+" esta dentro do intervalo de "+ y+" e "+z);
        }
        else{
            System.out.println(x+" nao esta dentro do intervalor de "+y+" e "+z);
        }
        if(x%y==0){
            System.out.println(x+" é divisivel por "+y);
        }
        if(x%z==0){
            System.out.println(x+" é divisivel por "+z);
        }
    }
}
