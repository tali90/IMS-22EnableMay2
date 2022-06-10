package com.qa.ims.persistence.domain;

public class Item {
	private long items_id;
	private String items_name;
	private Float price;
	public Item(long items_id, String items_name, Float price) {
		super();
		this.items_id = items_id;
		this.items_name = items_name;
		this.price = price;
	}
	public Item(String items_name, Float price) {
		super();
		this.items_name = items_name;
		this.price = price;
	}
	public long getItems_id() {
		return items_id;
	}
	public void setItems_id(long items_id) {
		this.items_id = items_id;
	}
	public String getItems_name() {
		return items_name;
	}
	public void setItems_name(String items_name) {
		this.items_name = items_name;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "item [items_id=" + items_id + ", items_name=" + items_name + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (items_id ^ (items_id >>> 32));
		result = prime * result + ((items_name == null) ? 0 : items_name.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		return result;
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
		if (items_id != other.items_id)
			return false;
		if (items_name == null) {
			if (other.items_name != null)
				return false;
		} else if (!items_name.equals(other.items_name))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		return true;
	}
	
	
}