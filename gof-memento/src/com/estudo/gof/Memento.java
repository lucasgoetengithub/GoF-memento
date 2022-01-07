package com.estudo.gof;

public class Memento {
	public static void main(String[] args) {
		bolsa();
	}

	public static void bolsa() {
		Acao padrao = new Acao("Patterns Inc.");
		padrao.setValor(3.0f);
		System.out.println(padrao);
		padrao.setValor(8.0f);
		System.out.println(padrao);
		padrao.setValor(25.0f);
		System.out.println(padrao);
		padrao.undo();
		System.out.println(padrao);
		padrao.undo();
		System.out.println(padrao);
		padrao.undo();
		System.out.println(padrao);
	}
}
