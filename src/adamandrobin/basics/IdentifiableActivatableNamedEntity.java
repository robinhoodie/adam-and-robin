package adamandrobin.basics;

public class IdentifiableActivatableNamedEntity extends IdentifiableActivatableEntity {

	private String name;
	
	public IdentifiableActivatableNamedEntity() {
		super();
		this.name = null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
