class User {
	protected String name;
	protected String nic;
	
	public User() {}
	
	/**
	 * @param name
	 * @param nic
	 */
	public User(String name, String nic) {
		this.name = name;
		this.nic = nic;
	}
	
	public User(User u) {
		this.name = u.getName();
		this.nic = u.getNic();
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the nic
	 */
	public String getNic() {
		return nic;
	}


	/**
	 * @param nic the nic to set
	 */
	public void setNic(String nic) {
		this.nic = nic;
	}
	
	
	public void printDetails() {
		System.out.println("Name: " + name);
		System.out.println("NIC: " + nic);
	}
}
