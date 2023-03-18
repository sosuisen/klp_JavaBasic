public class Manager extends Member {
	private String role;

	public Manager(String name, String role) {
		super(name);
		this.role = role;
	}

	@Override
	public String getInfo() {
		return name + "(" + role + ")";
	}
}
