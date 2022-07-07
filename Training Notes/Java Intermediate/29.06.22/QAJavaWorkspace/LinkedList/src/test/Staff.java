package test;

public class Staff {
	
	int id;
	String name;
	
	public Staff(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Staff [id: " + id + ", name: " + name + "]";
	}
	
	

}
