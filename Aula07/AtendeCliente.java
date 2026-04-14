package Aula07;

import java.util.Scanner;

public class AtendeCliente {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        int opcao;
        do{
            System.out.println("1- Insere aluno na fila");
            System.out.println("2- Atende 1 aluno");
            System.out.println("3- Encerra atendimento");
            opcao = le.nextInt();
            switch (opcao){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opção invalida");
            }
        } while (opcao != 3);
    }
}
