import java.util.Scanner;

public class Contador {
    public static void main(String[] args){
     
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        int parametro1 = sc.nextInt();
        System.out.println("Digite o segundo número");
        int parametro2 = sc.nextInt();

        try {
            contar(parametro1, parametro2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O primeiro parâmetro deve ser menor que o segundo parâmetro!");
        }
        
        sc.close();
    }

    static void contar(int p1, int p2) throws ParametrosInvalidosException{
        if (p2 < p1) {
            throw new ParametrosInvalidosException();
        }
        else{
            int contagem = p2 - p1;

            for(int i = 0; i < contagem; i++){
                System.out.println("Imprimindo o número " + (i+1));
            }
        }
    }
}