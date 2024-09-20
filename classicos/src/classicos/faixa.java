package classicos;
import java.util.Scanner;
public class faixa {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int faixa1 = 0, faixa2 = 0, faixa3 = 0, faixa4 = 0, faixa5 = 0;
        int maisVelho = 0, maisJovem = 100;

        int i = 0;

        while (i < 15) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            int idade = input.nextInt();

            if (idade <= 15) {
                faixa1++;
            } else if (idade <= 30) {
                faixa2++;
            } else if (idade <= 45) {
                faixa3++;
            } else if (idade <= 60) {
                faixa4++;
            } else {
                faixa5++;
            }

            if (idade > maisVelho) {
                maisVelho = idade;
            }
            if (idade < maisJovem) {
                maisJovem = idade;
            }

            i++;
        }

        double percFaixa1 = (faixa1 / 15.0) * 100;
        double percFaixa2 = (faixa2 / 15.0) * 100;
        double percFaixa3 = (faixa3 / 15.0) * 100;
        double percFaixa4 = (faixa4 / 15.0) * 100;
        double percFaixa5 = (faixa5 / 15.0) * 100;

        System.out.println("\nQuantidade de pessoas em cada faixa etária:");
        System.out.println("Até 15 anos: " + faixa1 + " pessoas (" + percFaixa1 + "%)");
        System.out.println("De 16 a 30 anos: " + faixa2 + " pessoas (" + percFaixa2 + "%)");
        System.out.println("De 31 a 45 anos: " + faixa3 + " pessoas (" + percFaixa3 + "%)");
        System.out.println("De 46 a 60 anos: " + faixa4 + " pessoas (" + percFaixa4 + "%)");
        System.out.println("Acima de 61 anos: " + faixa5 + " pessoas (" + percFaixa5 + "%)");

        System.out.println("\nIdade do mais velho: " + maisVelho);
        System.out.println("Idade do mais jovem: " + maisJovem);

    }
}
