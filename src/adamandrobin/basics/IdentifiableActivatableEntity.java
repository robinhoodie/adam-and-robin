package adamandrobin.basics;

public class IdentifiableActivatableEntity extends IdentifiableEntity{

	private Boolean active;
	
	public IdentifiableActivatableEntity() {
		super();
		this.active = null;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}
	
}
