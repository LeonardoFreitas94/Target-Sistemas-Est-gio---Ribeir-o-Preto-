package Questao3;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int indice = 12, soma = 0, k = 1;
		while(k < indice) {
			k = k + 1;
			soma = soma + k;
			System.out.print(soma);
		}
		JOptionPane.showMessageDialog(null, "A resposta correta para a questão 3 é: "+soma);

	}

}