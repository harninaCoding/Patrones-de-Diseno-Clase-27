package ejemplo01;

public class ImpresoraA3BN extends Impresora {

	protected ImpresoraA3BN(String texto) {
		super();
		setHoja("a3");

		setColor(false);

		setTipoDocumento("excel");

		setTexto(texto);

	}	
}
