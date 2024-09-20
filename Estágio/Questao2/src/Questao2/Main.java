package Questao2;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		while(true) {
			try {
			Variaveis V = new Variaveis();
			int cont = 0;
			for(int i = 0;i<V.getS().length();i++) {
				if(V.getS().charAt(i) == 'a' || V.getS().charAt(i) == 'A') {
					cont++;
				}
			}
			if(cont>0) {
				JOptionPane.showMessageDialog(null, "Existe a letra 'a' no texto, onde aparece "+cont+" vezes");
			}else{
				JOptionPane.showMessageDialog(null, "Não existe a letra 'a' no texto");
			}
			V.DesejaContinuar();
			if(V.getI() != 0) {
				break;
			}
		}catch(Exception NullPointerException) {
			int i = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			if(i != 0) {
				break;
			}
			
		}
		
		
	}
}
}
