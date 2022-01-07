package com.estudo.gof;

public class AcaoMemento {
	private float valor;

	public AcaoMemento(float valor) {
		this.valor = valor;
	}

	public float getState() {
		return valor;
	}
}
