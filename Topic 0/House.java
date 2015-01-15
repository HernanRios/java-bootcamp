
public class House extends Building{
	String owner;
	double tel;

	public House (String dire, Double h, Double b, String own, Double t){
		super(dire,h,b);
		this.owner=own;
		this.tel=t;
	}
	
	public String getOwner (){
		return this.owner;
	}
	public double getTel (){
		return this.tel;
	}
	}
