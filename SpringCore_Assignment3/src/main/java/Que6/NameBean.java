package Que6;

import java.util.Arrays;

public class NameBean {
	String [] names;
	

	public NameBean() {
		super();
	}

//	public NameBean(String[] names) {
//		super();
//		this.names = names;
//	}

	public String[] getNames() {
		return names;
	}

	public void setNames(String[] names) {
		this.names = names;
	}
	
	

	@Override
	public String toString() {
		return "NameBean [names=" + Arrays.toString(names) + "]";
	}

	public void show() {
		for( String i : names) {
		System.out.println(i);
	}
}
}