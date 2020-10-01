package edu.tudai.pojo;

public interface Vendible {
	public float getPrecioVenta();

	public void preparar() throws SinSuficientesIngredientesException;
}
