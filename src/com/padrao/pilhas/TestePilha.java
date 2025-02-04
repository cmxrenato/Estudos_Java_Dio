package com.padrao.pilhas;

public class TestePilha {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        No no1 = new No(1);
        No no2 = new No(2);
        No no3 = new No(3);
        No no4 = new No(4);
        No no5 = new No(5);
        No no6 = new No(6);
        No no7 = new No(7);

        pilha.push(no1);
        pilha.push(no2);
        pilha.push(no3);
        pilha.push(no4);
        pilha.push(no5);
        pilha.push(no6);
        pilha.push(no7);

       System.out.println(pilha); 
        
        System.out.println("-----------------------------------------------------");
        System.out.println(no1.getRefNo());
        System.out.println(no2.getRefNo());
        System.out.println(no3.getRefNo());
        System.out.println(no4.getRefNo());
        System.out.println(no5.getRefNo());
        System.out.println(no6.getRefNo());
        System.out.println(no7.getRefNo());
        System.out.println("-----------------------------------------------------");
        System.out.println("Topo antes do pop: " + pilha.top().getDado()); // C
        

        No removido = pilha.pop();
        System.out.println("Nó removido: " + removido.getDado()); // C
        System.out.println("Topo após pop: " + pilha.top().getDado()); // B 
    }
}
