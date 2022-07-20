package Que15;

public class Customer {
	int cust_id;
	String cust_name;
	
Item item;

public int getCust_id() {
	return cust_id;
}

public void setCust_id(int cust_id) {
	this.cust_id = cust_id;
}

public String getCust_name() {
	return cust_name;
}

public void setCust_name(String cust_name) {
	this.cust_name = cust_name;
}

public Item getItem() {
	return item;
}

public void setItem(Item item) {
	this.item = item;
}

public Customer(int cust_id, String cust_name, Item item) {
	super();
	this.cust_id = cust_id;
	this.cust_name = cust_name;
	this.item = item;
}

public Customer() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Customer [cust_id=" + cust_id + ", cust_name=" + cust_name + ", item=" + item + "]";
}

}
