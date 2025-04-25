import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro parametro!");
        int paramatroUm = entrada.nextInt();
        System.out.println("Digite o segundo parametro!");
        int paramatroDois = entrada.nextInt();

        try {
            contar(paramatroUm, paramatroDois);
        } catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int quantidade = parametroDois - parametroUm;
        int maximo = 50;
        if (quantidade > maximo) {
            throw new ParametrosInvalidosException("O intervalo entre os numeros nao pode ser maior que " + maximo);
        }

        for (int i = parametroUm; i <= parametroDois; i++) {

            System.out.println("Imprimindo o numero " + i);
        }

    }
}