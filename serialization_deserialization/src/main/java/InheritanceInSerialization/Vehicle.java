package InheritanceInSerialization;

public class Vehicle extends Engine {

	String comp;
	int no;    
	
	Vehicle(){
		super();
	}
	Vehicle(String comp,int no){
		super(comp,no);
		this.comp=comp;
		this.no=no;
	}
	public String getComp() {
		return comp;
	}
	public void setComp(String comp) {
		this.comp = comp;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	@Override
	public String toString() {
		return "Vehicle [comp=" + comp + ", no=" + no + ", type=" + type + ", id=" + id + "]";
	}
	
	
}
