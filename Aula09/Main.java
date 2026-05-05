package Aula09;

public class Main {
    public static void main(String[] args) {
        NoLista lista = new NoLista();
        lista.dado = 1;
        //sucesor nao existe o atributo precisa receber null (não tem objeto)
        // area de memoria 0 não pode ser accessada
        lista.prox = null;

        System.out.println("Lista: " + lista);
        System.out.println("\t dado: " + lista.dado);
        System.out.println("\t prox: " + lista.prox);

        System.out.println("\n Inserindo 2o elemenro na lista");
        NoLista novo = new NoLista();
        novo.dado = 2;
        novo.prox = null;
        lista.prox = novo;

        System.out.println("novo: " + novo);
        System.out.println("\t dado: " + lista.dado);
        System.out.println("\t prox: " + lista.prox);


    }
}
