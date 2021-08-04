package mypackage;

class Link { // (could be other items)
	private Employee iData; // data item
	public Link next; // next link in list
	// -------------------------------------------------------------

	public Link(Employee employee) // constructor
	{
		iData = employee;
	}

	// -------------------------------------------------------------
	public Employee getKey() {
		return iData;
	}

	// -------------------------------------------------------------
	public void displayLink() // display this link
	{ 
		System.out.print(iData + " "); 
	}
} // end class Link
