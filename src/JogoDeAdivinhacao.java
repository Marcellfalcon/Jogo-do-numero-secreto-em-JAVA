import java.util.Random;
import java.util.Scanner;
public class JogoDeAdivinhacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Bem vindo ao Jogo de adivinhação!");

        //Gerando o número aleatorio.
        int numeroAleatorio = new Random().nextInt(100);
        System.out.println(numeroAleatorio);

        int chute = -1;
        int tentativas = 0; //Quantidade de tentativas que vai tentar acertar
        int numeroDeTentativas = 5; //Quantidade de tentativas para acertar
        String palavraTentativas = "tentativa.";

        //Comparando o número digitado com o número aleatorio
        while (chute != numeroAleatorio) {
            //Pegando o número digitado e atribuindo a variavel chute
            System.out.println(String.format("Digite um número entra 0 e 100," +
                    " você tem %d tentativas", numeroDeTentativas));
            chute = leitura.nextInt();

            //Comparando o valor digitado com o número aleatorio
            if (chute == numeroAleatorio) {
                System.out.println(String.format("Acertou! Com %d %s",
                        (tentativas + 1), palavraTentativas));
            } else{
                if (chute < numeroAleatorio) {
                    System.out.println(String.format("O Número é maior que %d", chute));
                } else {
                    System.out.println(String.format("O Número é menor que %d", chute));
                }
                tentativas++;
                numeroDeTentativas--;
            }

            //Encerrando o jogo ao acabar o número de tentativas possivel
            if (tentativas == 5) {
                System.out.println("Acabaram suas tentativas. Reinicie o " +
                        "jogo e tente novamente!");
                System.out.println(String.format("O número era %d", numeroAleatorio));
                break;
            }
            //Plural da palavra tentativa
            if (numeroAleatorio > 1) {
                palavraTentativas = "tentativas.";
            }
        }
    }
}