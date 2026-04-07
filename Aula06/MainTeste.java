package Aula06;

public class MainTeste {
    public static void main(String[] args) {
        Filas fila = new Filas();
        fila.init();
        //enqueue
        fila.enqueue (23);
        fila.enqueue (66);
        fila.enqueue (17);
        fila.enqueue (44);
        if (fila.isEmpty()){
            System.out.println("A fila está vazia");
        } else {
            System.out.println("Valor retirado da fila: "+ fila.dequeue());
        }
    }
}
