package ejemploordenador;


public class DiscoDuro implements Ordenador{

	private Ordenador actual;
	
	public DiscoDuro(Ordenador actual) {
		this.actual = actual;
	}

	@Override
	public float calculateCost() {
		System.out.println("mio actual Disco "+actual);
		return this.actual.calculateCost()+120;
	}

}
