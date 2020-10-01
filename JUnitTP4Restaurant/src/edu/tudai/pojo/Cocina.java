package edu.tudai.pojo;

import java.util.List;

public class Cocina extends Thread {
	static List<Pedido> pedidos;

	static public void setPedidos(List<Pedido> pedidos) {
		Cocina.pedidos = pedidos;
	}

	public void run() {
		while (true) {
			
			for(int i = 0; i < pedidos.size(); i++) { 
				 if(!pedidos.isEmpty()) {
					 pedidos.get(i).prepararPedido();
				 }
			}
			 
			System.out.println("cocina");
			try {
				Thread.sleep(1000);
				for(int i = 0; i < pedidos.size(); i++) { 
					 if(!pedidos.isEmpty()) {
						 pedidos.get(i).terminarPedido();;
					 }
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void cocinar(Receta r) throws SinSuficientesIngredientesException {
		if (Almacen.esPosibleCocinar(r)) {
			for (ItemReceta item : r.getIngredientes())
				Almacen.ExtraerConsumibles(item.getIngrediente(), item.getCantidad());
		} else
			throw new SinSuficientesIngredientesException();
	}
}
