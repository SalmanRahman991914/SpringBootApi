package com.SpringApi.entities;

public class Cource {

	private int id;
	private String title;
	private String description;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Cource(int id, String title, String description) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
	}
	public Cource() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Cource [id=" + id + ", title=" + title + ", description=" + description + "]";
	}
	
}
