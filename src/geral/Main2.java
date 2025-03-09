package geral;

class Numero {
    int valor;
}

public class Main2 {
    public static void main(String[] args) {
        Numero a = new Numero();
        a.valor = 2;

        Numero b = new Numero();
        b.valor = 5;

        a = b; // Aqui 'a' passa a referenciar o mesmo objeto que 'b'

        b.valor = 6; // Como 'a' e 'b' apontam para o mesmo objeto, isso afeta ambos

        System.out.println(a.valor); // Saída: 6
        
        int c = 6;
        int d = 9;
        
        c = d;
        
        d = 80;
        
        
        
        System.out.println(c);
        
        
    }
}
