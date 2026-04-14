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
            System.out.println("2- Executa processo");
            System.out.println("3- Shutdown");
            opcao = le.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe pid do processo: ");
                    int pid = le.nextInt();
                    fila.enqueue(pid);
                    break;

                case 2:
                    if (fila.isEmpty()) {
                        System.out.println("Não há mais processos");
                    } else {
                        pid = fila.dequeue();
                        System.out.println("O processo: " + pid + " será executado agora");
                        System.out.println("...Execução...");
                        System.out.println("Processo foi concluído? (1-sim): ");
                        int resp = le.nextInt();

                        if (resp == 1) {
                            System.out.println("O processo " + pid + " concluído");
                        } else {
                            fila.enqueue(pid);
                            System.out.println("O processo voltou para a fila!");
                        }
                    }
                    break;

                case 3:
                    if (!fila.isEmpty()) {
                        System.out.println("Processos ainda em execução");
                        System.out.println("Deseja fechar todos? (1- sim): ");
                        int resp = le.nextInt();

                        if (resp == 1) {
                            while (!fila.isEmpty()) {
                                System.out.println("O processo " + fila.dequeue() + " foi encerrado");
                            }
                            System.out.println("Shutdown...");
                        } else {
                            opcao = 0;
                        }
                    } else {
                        System.out.println("Shutdown...");
                    }
                    break;

                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 3);
    }
}