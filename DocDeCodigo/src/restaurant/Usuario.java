package restaurant;

import java.util.Date;

/**
 * 
 * @author Javier Lopez
 *
 */

public class Usuario {
	static int nextID;
	int id;
	String nombreYApellido;
	int tipoUsuario;
	float saldoCuenta;
	Date ultimaRecarga;
	String email;

	/**
	 * 
	 * @param nombreYApellido
	 * @param tipoUsuario
	 * @param saldoCuenta
	 * @param email
	 */
	public Usuario(String nombreYApellido, int tipoUsuario, float saldoCuenta, String email) {
		super();
		this.nombreYApellido = nombreYApellido;
		this.tipoUsuario = tipoUsuario;
		this.saldoCuenta = saldoCuenta;
		this.email = email;
	}

	/**
	 * 
	 * @param cuanto
	 */
	public void cargarCredito(float cuanto) {
		saldoCuenta += cuanto;

	}

	/**
	 * 
	 * @param cuanto
	 * @return
	 * @throws SinSaldoException
	 */
	float descontarSaldo(float cuanto) throws SinSaldoException {
		if ((saldoCuenta - cuanto) < 0)
			throw new SinSaldoException();
		else
			saldoCuenta -= cuanto;
		return saldoCuenta;

	}
}
