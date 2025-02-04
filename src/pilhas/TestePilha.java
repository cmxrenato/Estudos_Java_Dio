package pilhas;

public class TestePilha {
    public static  void main(String[] args) {
        Pilha<String> pilha = new Pilha<String>();

        

        pilha.push("Um");
        pilha.push("Dois");
        pilha.push("Três");
        pilha.push("Quatro");
        pilha.push("Cinco");
        pilha.push("Seis");
        pilha.push("Sete");
        pilha.push("oito");

       System.out.println(pilha); 
      System.out.println(pilha.top());
      System.out.println(pilha.first());

    }
}
