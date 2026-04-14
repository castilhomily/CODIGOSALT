package Aula06;

public class FilaInt {
    final int N = 3;
    int dados [] = new int[N];
    int ini,fim,cont;

    public void init(){
        ini = fim = cont = 0;
    }
    public boolean isEmpty(){
        return (cont==0);
    }
    public boolean isFull(){
        return (cont == N);
    }
    public void enqueue(int elem){
        if (isFull()){
            System.out.println("A fila está cheia");
        } else {
            dados[fim] = elem;
            cont ++;
           //jeito mais tradicional:
           // fim++;
           // if (fim == N) {
           //     fim = 0;
           // }
           // jeito mais atualizado:
           fim = (fim+1)% N;
        }
    }
    public int dequeue(){
        int elem = dados[ini];
        cont--;
        ini = (ini + 1) % N;
        return elem;
    }
}
