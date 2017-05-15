package com.rentch.portal.property;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Property {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private PropertyType type;
	
	@ElementCollection
	private Set<String> pictures = new HashSet<>();
	
	private String primaryImage;
	
	private String description;
	
	private int price;
	
	public Property() {}

	public Property(PropertyType type, String description, int price) {
		this.type = type;
		this.description = description;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public PropertyType getType() {
		return type;
	}

	public Set<String> getPictures() {
		return pictures;
	}

	public String getPrimaryImage() {
		return primaryImage;
	}

	public String getDescription() {
		return description;
	}

	public int getPrice() {
		return price;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setType(PropertyType type) {
		this.type = type;
	}

	public void setPictures(Set<String> pictures) {
		this.pictures = pictures;
	}

	public void setPrimaryImage(String primaryImage) {
		this.primaryImage = primaryImage;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	

	@Override
	public String toString() {
		return "Property [id=" + id + ", type=" + type + ", pictures=" + pictures + ", primaryImage=" + primaryImage
				+ ", description=" + description + ", price=" + price + "]";
	}
	
}
