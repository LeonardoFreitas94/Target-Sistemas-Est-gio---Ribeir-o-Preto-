package Questao1;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		while(true){
		try{
				Variaveis V = new Variaveis();
				int N = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
				V.setN(N);
				for(int soma = 0;N>soma;) {
					soma = (V.getA() + V.getB());
					V.setA(V.getB());
					V.setB(soma);
					V.setSoma(soma);
				}
				if(V.getSoma() == V.getN()) {
					JOptionPane.showMessageDialog(null, "O número informado pertence a sequencia de fibonacci");
				}else {
					JOptionPane.showMessageDialog(null, "O número informado não pertence a sequencia de fibonacci");
				}
				break;
			}catch (Exception NumberFormatException) {
				JOptionPane.showMessageDialog(null, "Numero incorreto, tente novamente");
				int I = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
				if(I != 0) {
					break;
				}
				
				
			}
		
		}

	}

}
