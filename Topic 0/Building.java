public class Building {
	String adress;
	Double rooms;
	Double baths;

	public Building(String d, Double h, Double b) {
		this.adress = d;
		this.rooms = h;
		this.baths = b;
	}

	public String getadress() {
		return this.adress;
	}

	public Double getrooms() {
		return this.rooms;
	}

	public Double getBaths() {
		return this.baths;
	}
}
