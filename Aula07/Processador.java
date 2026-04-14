package Aula07;

import java.util.Scanner;
public class Processador {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        Aula06.FilaInt fila = new Aula06.FilaInt();
        fila.init();
        int opcao;
        do {
            System.out.println("1- Submete processo para execução");
            System.out.println("2- Execulta processo");
            System.out.println("3- Shutdown");
            opcao = le.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe pi do processo: ");
                    int pid = le.nextInt();
                    fila.enqueue(pid);
                    break;

                case 2:
                    if (fila.isEmpty()) {
                        System.out.println("Não ha mais processos" );
                    } else {
                        System.out.println("O processo: " + fila.dequeue() + "será executado agora");
                    }
                    break;

                case 3:
                    if (!fila.isEmpty()) {
                        System.out.println("Processo ainda tem execução");
                    } else {
                        System.out.println("Ainda há processos na fila!");
                        opcao = 0;
                    }
                    break;

                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 3);
    }
}