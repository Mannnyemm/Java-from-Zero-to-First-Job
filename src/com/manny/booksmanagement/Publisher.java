package com.manny.booksmanagement;

import java.util.Objects;

public class Publisher {
	// Unique identifier of a publisher
	private int id;
	// Name of a publisher
	private String publisherName;
	
	// Constructors
	public Publisher(int id, String publisherName) {
		this.id = id;
		this.publisherName = publisherName;
	}
	
	public Publisher() {
		
	}
	

	/**
	 * @return Integer - the id of a Publisher
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the id of a Publisher to given id
	 * @param id Integer of id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return String - the publisherName of a Publisher
	 */
	public String getPublisherName() {
		return publisherName;
	}

	/**
	 * Sets the PublisherName of a Publisher to given PublisherName
	 * @param publisherName String of publisherName to set
	 */
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, publisherName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Publisher other = (Publisher) obj;
		return id == other.id && Objects.equals(publisherName, other.publisherName);
	}

	/**
	 * Return string of a Publisher
	 */
	@Override
	public String toString() {
		return "Publisher [id=" + id + ", publisherName=" + publisherName + "]";
	}

}
