public abstract class AbstractHuisdier {

	private String naam;

	public AbstractHuisdier(String naam) {
		this.naam = naam;
	}

	public String getNaam() {
		return naam;
	}

	abstract public void maakGeluid();
}
