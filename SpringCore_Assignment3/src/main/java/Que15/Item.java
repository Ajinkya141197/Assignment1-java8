package Que15;

public class Item {
	
int Item_id;
String Item_name;
Category cat;
public int getItem_id() {
	return Item_id;
}
public void setItem_id(int item_id) {
	Item_id = item_id;
}
public String getItem_name() {
	return Item_name;
}
public void setItem_name(String item_name) {
	Item_name = item_name;
}
public Category getCat() {
	return cat;
}
public void setCat(Category cat) {
	this.cat = cat;
}
public Item(int item_id, String item_name, Category cat) {
	super();
	Item_id = item_id;
	Item_name = item_name;
	this.cat = cat;
}
@Override
public String toString() {
	return "Item [Item_id=" + Item_id + ", Item_name=" + Item_name + ", cat=" + cat + "]";
}
public Item() {
	super();
	// TODO Auto-generated constructor stub
}

}
