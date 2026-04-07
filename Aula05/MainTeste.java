package Aula05;

import Aula04.Pilha;

public class MainTeste {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        pilha.init();
        pilha.push(11);
        pilha.push(22);
        pilha.push(33);
        pilha.push(44);
        pilha.push(55);
        pilha.push(66);


        if(pilha.isEmpty()){
            System.out.println("Stack is empty");
        } else {
            System.out.println("Valor do daod que esta no topo da pilha: " +pilha.top());
        }
        System.out.println("***Dados empilahdos***");
        pilha.esvazia();

        /*
        if (pilha.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Valor retirado:" + pilha.pop());
            if (pilha.isEmpty()) {
                System.out.println("Stack is empty");
            } else {
                System.out.println("Valor retirado:" + pilha.pop());
                if (pilha.isEmpty()) {
                    System.out.println("Stack is empty");
                } else {
                    System.out.println("Valor retirado:" + pilha.pop());
                    if (pilha.isEmpty()) {
                        System.out.println("Stack is empty");
                    } else {
                        System.out.println("Valor retirado:" + pilha.pop());
                        if (pilha.isEmpty()) {
                            System.out.println("Stack is empty");
                        } else {
                            System.out.println("Valor retirado:" + pilha.pop());
                            if (pilha.isEmpty()) {
                                System.out.println("Stack is empty");
                            } else {
                                System.out.println("Valor retirado:" + pilha.pop());


                                System.out.println("Valor retirado: " + pilha.pop());
                                System.out.println("Valor retirado: " + pilha.pop());
                                System.out.println("Valor retirado: " + pilha.pop());
                                System.out.println("Valor retirado: " + pilha.pop());
                                System.out.println("Valor retirado: " + pilha.pop());
                                System.out.println("Valor retirado:  " + pilha.pop());
                            }
                        }
                    }
                }
            }
        }

         */
    }
}
