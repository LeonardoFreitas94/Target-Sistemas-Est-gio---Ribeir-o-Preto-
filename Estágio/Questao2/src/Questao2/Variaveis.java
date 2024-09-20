package Questao2;

import javax.swing.JOptionPane;

public class Variaveis {
	private String S;
	private int i;
	
	public Variaveis() {
		this.S = JOptionPane.showInputDialog("Digite o que quiser");
	}
	
	public void DesejaContinuar() {
		this.i = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
	}

	public String getS() {
		return S;
	}

	public void setS(String s) {
		S = s;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	
	
}
