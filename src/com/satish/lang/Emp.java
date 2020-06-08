package com.satish.lang;

public class Emp implements Cloneable {
	int id;
	String name;
	Adress ad;
	
	public void show() {
		System.out.println("Hello"+ad.village);
	}

	public Emp(int id, String name, Adress ad) {
		super();
		this.id = id;
		this.name = name;
		this.ad = ad;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", ad=" + ad + "]";
	}
	public Adress getAd() {
		return ad;
	}
	public void setAd(Adress ad) {
		this.ad = ad;
	}
	public String getName() {
		return name;
	}
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		if ( obj instanceof Emp) {
			Emp em = (Emp)obj;
			return  this.id==em.getId()&& this.name.equals(em.getName());
			}
		return false;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
