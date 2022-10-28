package com.manny.booksmanagement;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Objects;

public class Book {
		// Fields
	// Unique identifier of a book
	private int id;
	// Name of a book
	private String name;
	// Array of Authors
	private Author[] authors;
	// Book publisher
	private Publisher publisher;
	// Year of publishing
	private int publishingYear;
	// Number of pages
	private int amountOfPages;
	// Price of book
	private BigDecimal price;
	// Type of book cover
	CoverType coverType;
	
	/**
	 * Constructor
	 * @param id
	 * @param name
	 * @param authors
	 * @param publisher
	 * @param publishingYear
	 * @param amountOfPages
	 * @param price
	 * @param coverType
	 */
	public Book(int id, String name, Author[] authors, Publisher publisher, int publishingYear, int amountOfPages,
			BigDecimal price, CoverType coverType) {
		this.id = id;
		this.name = name;
		this.authors = authors;
		this.publisher = publisher;
		this.publishingYear = publishingYear;
		this.amountOfPages = amountOfPages;
		this.price = price;
		this.coverType = coverType;
	}
	
	// Construct 2
	public Book() {
		
	}
	
	/**
	 * @return Integer id of a book
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Sets the id of a Book to given id
	 * @param id Integer
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return String name of a book
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name of a Book to given name
	 * @param name String
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return array of authors Author[]
	 */
	public Author[] getAuthors() {
		return authors;
	}

	/**
	 * Sets the authors of a Book to given authors
	 * @param authors Authors[]
	 */
	public void setAuthors(Author[] authors) {
		this.authors = authors;
	}

	/**
	 * @return Publisher of Book's publisher
	 */
	public Publisher getPublisher() {
		return publisher;
	}

	/**
	 * Sets the publisher of a Book to given publisher
	 * @param publisher Publisher
	 */
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	/**
	 * @return Integer of a Book's publishingYear
	 */
	public int getPublishingYear() {
		return publishingYear;
	}

	/**
	 * Sets the publishingYear of a Book to given publishingYear
	 * @param publishingYear Integer
	 */
	public void setPublishingYear(int publishingYear) {
		this.publishingYear = publishingYear;
	}

	/**
	 * @return Integer the amountOfPages in a book
	 */
	public int getAmountOfPages() {
		return amountOfPages;
	}

	/**
	 * Sets amountOfPages of a Book to given amountOfPages
	 * @param amountOfPages Integer
	 */
	public void setAmountOfPages(int amountOfPages) {
		this.amountOfPages = amountOfPages;
	}

	/**
	 * @return BigDecimal of price of book
	 */
	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * Sets the price of a Book to given price
	 * @param price BigDecimal
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	/**
	 * @return CoverType of the coverType
	 */
	public CoverType getCoverType() {
		return coverType;
	}

	/**
	 * Sets the coverType of a Book to given coverType
	 * @param coverType CoverType
	 */
	public void setCoverType(CoverType coverType) {
		this.coverType = coverType;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(authors);
		result = prime * result + Objects.hash(amountOfPages, coverType, id, name, price, publisher, publishingYear);
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
		Book other = (Book) obj;
		return amountOfPages == other.amountOfPages && Arrays.equals(authors, other.authors)
				&& coverType == other.coverType && id == other.id && Objects.equals(name, other.name)
				&& Objects.equals(price, other.price) && Objects.equals(publisher, other.publisher)
				&& publishingYear == other.publishingYear;
	}

	/**
	 * Returns string of a Book
	 */
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", authors=" + Arrays.toString(authors) + ", publisher="
				+ publisher + ", publishingYear=" + publishingYear + ", amountOfPages=" + amountOfPages + ", price="
				+ price + ", coverType=" + coverType + "]";
	}
}
