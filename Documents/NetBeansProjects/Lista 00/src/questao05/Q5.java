/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questao05;

/**
 *
 * @author guime
 */
import java.util.Scanner;
public class Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        
        int contador_referencia = 0;
        System.out.println("Indique os dados:");
        System.out.println("Indique a idade(-1 para encerrar):");
        int idade = entrada.nextInt();
        int menor = idade;
        int maior  = idade;
        while(idade!=-1){
            entrada.nextLine();
            System.out.println("Indique o sexo(masculino/feminino):");
            String sexo = entrada.nextLine();
            System.out.println("Indique aa cor do olho(azul/verde/castanho):");
            String olho = entrada.nextLine();
            System.out.println("Indique a cor do cabelo(loiro/castanho/preto):");
            String cabelo = entrada.nextLine();
            if(idade>maior){
            maior=idade; }
            if(idade<menor){
            menor=idade; }
            if(sexo.equalsIgnoreCase("feminino")&& olho.equalsIgnoreCase("verde") && cabelo.equalsIgnoreCase("loiro") && idade >= 18 && idade <= 35){
                contador_referencia++;
            }
            System.out.println("Indique a idade(-1 para encerrar):");
            idade = entrada.nextInt();
    }
        System.out.println("Maior idade: "+ maior);
        System.out.println("Menor idade: "+ menor);
        System.out.println("Quantidade referencia: "+ contador_referencia);
    }
}

