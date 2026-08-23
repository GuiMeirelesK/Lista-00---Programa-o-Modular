/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questao06;

/**
 *
 * @author guime
 */
import java.util.Scanner;
public class Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String [] gabarito = new String[8];
        int aprovados = 0;
        System.out.println("Gabarito:");
        for(int i=0;i<8;i++){
            System.out.println("Questao "+(i+1));
            gabarito[i] = entrada.nextLine();
        }
        System.out.println("N° de alunos: ");
        int alunos = entrada.nextInt();
        int [] notas = new int[alunos];
        entrada.nextLine();
        for(int i=0;i<alunos;i++){
            System.out.println("Aluno "+ (i+1));
            int acertos =0;
            for(int j=0; j<8;j++){
                System.out.println("Questao " + (j+1) +":");
                String questao = entrada.nextLine();
                if(questao.equalsIgnoreCase(gabarito[j])){
                    acertos++;}
            }
            notas[i]=acertos;
            if(acertos>=6){
            aprovados++;}
        }
        double porcentagem = ((double)aprovados/alunos)*100;
        for(int i=0;i<alunos;i++){
            System.out.println("Aluno "+(i+1)+":");
            System.out.println("Nota: "+notas[i]);
        }
        System.out.println("Porcentagem aprovacao: "+ porcentagem+"%");
    }
}
