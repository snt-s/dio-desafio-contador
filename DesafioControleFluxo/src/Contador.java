import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        
        try {

            Scanner sc = new Scanner(System.in);

            System.out.println("Digite o primeiro parâmetro: ");
            int parametroA = sc.nextInt();

            System.out.println("Digite o segundo parâmetro: ");
            int parametroB = sc.nextInt();

            contar(parametroA , parametroB);

        } catch (ParametrosInvalidosException e){

            System.out.println("Os valores devem ser numéricos e o primeiro parâmetro deve ser menor que o segundo");
        }

    }

    public static void contar(int parametroA , int parametroB) throws ParametrosInvalidosException {
        
        if (parametroA < parametroB){
            int contagem = parametroB - parametroA;

            for (int i = 1;  i < contagem + 1; i++){

             System.out.println("Interação " + i );
            }
        } 
    }
}
