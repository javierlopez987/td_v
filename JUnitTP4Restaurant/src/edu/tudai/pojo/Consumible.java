package edu.tudai.pojo;

public interface Consumible {
	public void consumirStock(int cantidad);

	public void reponerStock(int cantidad);

	public int getStock();

	public String getNombre();

	public float getPrecioCompra();
}
