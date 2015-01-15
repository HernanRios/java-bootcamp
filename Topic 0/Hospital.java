public class Hospital extends Building {

	String complejidad;
	Double Cantdoctors;

	public Hospital(String dire, Double h, Double b, String com, Double d) {
		super(dire, h, b);
		this.complejidad = com;
		this.Cantdoctors = d;
	}

	public String getComplejidad() {
		return this.complejidad;
	}

	public Double getCantDoctors() {
		return this.Cantdoctors;
	}
}
