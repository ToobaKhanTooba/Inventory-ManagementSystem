package application;

public class Users {
	public Users(int sno, String type, String item, int qty, int price) {
		super();
		Sno = sno;
		this.type = type;
		this.item = item;
		this.qty = qty;
		this.price = price;
	}

	int Sno;
	String type;
	String item;
	int qty;
	int price;

	public Users() {
		// TODO Auto-generated constructor stub
	}

	public int getSno() {
		return Sno;
	}

	public void setSno(int sno) {
		Sno = sno;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
