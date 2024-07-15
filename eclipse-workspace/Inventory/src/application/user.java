package application;

public class user {
 int sno;
 String item, itemtype;
 int qty;
 double price;
 
	public user(int sno, String item, String itemtype, int qty, double price) {
	super();
	this.sno = sno;
	this.item = item;
	this.itemtype = itemtype;
	this.qty = qty;
	this.price = price;
}

	public int getSno() {
	return sno;
}

public void setSno(int sno) {
	this.sno = sno;
}

public String getItem() {
	return item;
}

public void setItem(String item) {
	this.item = item;
}

public String getItemtype() {
	return itemtype;
}

public void setItemtype(String itemtype) {
	this.itemtype = itemtype;
}

public int getQty() {
	return qty;
}

public void setQty(int qty) {
	this.qty = qty;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

	public user() {
		// TODO Auto-generated constructor stub
	}

}
