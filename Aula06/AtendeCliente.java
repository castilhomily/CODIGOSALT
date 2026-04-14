package Aula06;
import java.util.Scanner;
public class AtendeCliente {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        Aula06.FilaInt fila = new Aula06.FilaInt();
        fila.init();
        int opcao;
        do {
            System.out.println("1- Insere aluno na fila");
            System.out.println("2- Atende 1 aluno");
            System.out.println("3- Encerra atendimento");
            opcao = le.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o RM do aluno: ");
                    int rm = le.nextInt();
                    fila.enqueue(rm);
                    break;

                case 2:
                    if (fila.isEmpty()) {
                        System.out.println("Não ha alunos na fila" );
                    } else {
                        System.out.println("O aluno: " + fila.dequeue() + "será atendido agora");
                    }
                    break;

                case 3:
                    if (!fila.isEmpty()) {
                        System.out.println("Fila ainda tem atendimento");
                    } else {
                        System.out.println("Ainda há alunos na fila!");
                        opcao = 0;
                    }
                    break;

                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 3);
    }
}