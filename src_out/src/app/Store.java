package app;

class Store {
    private String name;
    private Rent[] history;
    private Prod[] carList;
    private User[] userList;
    
	public Store(String name) {
		super();
		this.name = name;
		this.history = new Rent[100];
		this.carList = new Prod[100];
		this.userList = new User[100];
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isHistory(int index) {
		if (history[index] != null) {
			return true;
		} else return false;
	}
	
	public void addHistory(Rent newrent) {
		for (int i = 0; i < history.length; i++) {
			if (history[i] == null) {
				history[i] = newrent;
				break;
			}
		}
	}
	
	public Rent getHistory(int index) {
		if (isHistory(index) == true) {
			return history[index];
		} else return null;
	}
	    
}