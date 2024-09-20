package listaExercicios;
import java.util.Scanner;
public class exercicio4 {
	public static void main(String[] args) {
		Scanner input = nem Scanner(System.in);
		int anoNasc, anoAtual, i;
		int maisVelho = 0, maisNovo = 100;
		
		for (i = 1; i<=10; i++) {
			System.out.println("Insira seu ano de nascimento: ");
			anoNasc = input.nextInt();
			System.out.println("Insira o ano atual: ");
			anoAtual = input.nextInt();
			
			int idade;
			idade = anoAtual - anoNasc;
			System.out.println("Sua iade é" + idade + "anos");
			
			if (idade > maisVelho) {
				maisVelho = idade;
			}
			if (idade < maisJovem) {
				maisJovem = idade;
			}
			}
		System.out.println("Idade do mais velho: " + maisVelho);
		System.out.println("Idade do mais novo: " + maisNovo);
	}

}
