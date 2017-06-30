package seedu.addressbook.data.person;

public class Contact {
	protected boolean isPrivate;
	
	public Contact(){
		isPrivate = true;
	}
	
	public boolean isPrivate(){
		return isPrivate;
	}
}


