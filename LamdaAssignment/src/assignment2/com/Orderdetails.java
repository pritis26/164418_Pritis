package assignment2.com;

public class Orderdetails {
String itemname;
int itemprice;
String orderstatus;


public Orderdetails(String itemname, int itemprice, String orderstatus) {
	super();
	this.itemname = itemname;
	this.itemprice = itemprice;
	this.orderstatus = orderstatus;	// TODO Auto-generated constructor stub
}
public String getItemname() {
	return itemname;
}
public void setItemname(String itemname) {
	this.itemname = itemname;
}
public int getItemprice() {
	return itemprice;
}
public void setItemprice(int itemprice) {
	this.itemprice = itemprice;
}
public String getOrderstatus() {
	return orderstatus;
}
public void setOrderstatus(String orderstatus) {
	this.orderstatus = orderstatus;
}

}
