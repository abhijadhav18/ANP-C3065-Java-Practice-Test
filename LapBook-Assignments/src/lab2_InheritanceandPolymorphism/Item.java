package lab2_InheritanceandPolymorphism;

import java.util.Objects;

public abstract class Item {
	private int number;
	private String title;
	private int noOfcopies;
	public Item() {
		super();
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNoOfcopies() {
		return noOfcopies;
	}
	public void setNoOfcopies(int noOfcopies) {
		this.noOfcopies = noOfcopies;
	}
	public void print() {
		
	}
	public void checkIn() {
		
	}
	public void checkOut() {
		
	}
	public void addItem() {
		
	}
	@Override
	public String toString() {
		return "Item [number=" + number + ", title=" + title + ", noOfcopies=" + noOfcopies + ", getNumber()="
				+ getNumber() + ", getTitle()=" + getTitle() + ", getNoOfcopies()=" + getNoOfcopies() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(noOfcopies, number, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return noOfcopies == other.noOfcopies && number == other.number && Objects.equals(title, other.title);
	}


}
