package ejemplo01;

public class FacadeImpresora {
	public void imprimirDocumentoNormal(String texto) {
		new ImpresoraNormal(texto).imprimirDocumento();;
	}
	
	public void imprimirDocumentoA3BN(String texto) {
		new ImpresoraA3BN(texto).imprimirDocumento();
	}
}
