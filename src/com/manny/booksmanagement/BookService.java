package com.manny.booksmanagement;

import java.util.Arrays;

public class BookService {
	// Default length of booksResult
	private final int DEFAULT_BOOK_ARRAY_LENGTH = 10;
	
	/**
	 * Filter books a given author is part of authors
	 * @param author Author - author to search
	 * @param books Book[]	- array of Book
	 * @return Book[] - filtered array of books given author is part of authors
	 */
	public Book[] filterBooksByAuthor(Author author, Book[] books) {
		  // Return an empty array of book if all parameters are not met.
		  if (author == null || books == null) {
			  return new Book[0];
		  }
		  // Array of books matching search parameters
		  Book[] booksResult;
		  // Last inserted index of booksResult
		  int lastIndex = 0;
		  // Initialize length of bookResult to DEFAULT_BOOK_ARRAY_LENGTH
		  booksResult = new Book[DEFAULT_BOOK_ARRAY_LENGTH];
		  
		  // Loop through all books in books array
		  for (Book book : books) {
			  // Loops through all authors of current book
		  for (Author currAuthor : book.getAuthors()) {
			  // If an author of current book's id is same as id of author we are searching for
		  if (currAuthor.getId() == author.getId()) {
			  // If booksResult length is equal to or less than lastIndex
		  if (booksResult.length <= lastIndex) {
			  // Assign bookResult to a copy of booksResult array with length double of old length
			  booksResult = Arrays.copyOf(booksResult, booksResult.length << 1);
			}
		  // Add current book to booksResult
				  booksResult[lastIndex++] = book;
				}
				
			}
		}
		// Returns a copy of BookResult with non null values
		return Arrays.copyOf(booksResult, lastIndex);
	}

	/**
	 * Filter books a published by a given publisher
	 * @param publisher Publisher - publisher to search for
	 * @param books Book[]	- array of Book
	 * @return Book[] - filtered array of books published by a given publisher
	 */
	public Book[] filterBooksByPublisher(Publisher publisher, Book[] books) {
		// Return an empty array of book if all parameters are not met.
		if (publisher == null || books == null) {
			return new Book[0];
		}
		// Array of books matching search parameters
		Book[] booksResult;
		// Last inserted index of booksResult
		int lastIndex = 0;
		// Initialize length of bookResult to DEFAULT_BOOK_ARRAY_LENGTH
		booksResult = new Book[DEFAULT_BOOK_ARRAY_LENGTH];
		
		// Loop through all books in books array
		for (Book book : books) {
			// If Publisher of current book's id is same as id of Publisher we are searching for
			if (book.getPublisher().getId() == publisher.getId()) {
				// If booksResult length is equal to or less than lastIndex
				if (booksResult.length <= lastIndex) {
					// Assign bookResult to a copy of booksResult array with length double of old length
					booksResult = Arrays.copyOf(booksResult, booksResult.length << 1);
				}
				  // Add current book to booksResult
				  booksResult[lastIndex++] = book;
			}
				
		}
		// Returns a copy of BookResult with non null values
		return Arrays.copyOf(booksResult, lastIndex);
	}

	/**
	 * Filter books with publishing year after specified year inclusively.
	 * @param yearFromInclusively Integer - minimum publishing year of a book
	 * @param books Book[]	- array of Book
	 * @return Book[] - filtered array of books with publishing year >= yearFromInclusively
	 */
	public Book[] filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] books) {
		// Return an empty array of book if all parameters are not met.
		if (books == null) {
			return new Book[0];
		}
		// Array of books matching search parameters
		Book[] booksResult;
		// Last inserted index of booksResult
		int lastIndex = 0;
		// Initialize length of bookResult to DEFAULT_BOOK_ARRAY_LENGTH
		booksResult = new Book[DEFAULT_BOOK_ARRAY_LENGTH];
		
		// Loop through all books in books array
		for (Book book : books) {
			// If publishing year of current book is same as or greater than yearFromInclusively
			if (book.getPublishingYear() >= yearFromInclusively) {
				// If booksResult length is equal to or less than lastIndex
				if (booksResult.length <= lastIndex) {
					// Assign bookResult to a copy of booksResult array with length double of old length
					booksResult = Arrays.copyOf(booksResult, booksResult.length << 1);
				}
				  // Add current book to booksResult
				  booksResult[lastIndex++] = book;
			}
				
		}
		// Returns a copy of BookResult with non null values
		return Arrays.copyOf(booksResult, lastIndex);
	}
		
}
