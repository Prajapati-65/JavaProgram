package com.bridgeit.ObjectOrientedProgram;

public class CompanyShares {

	private String name;
	private int numberOfShares, price;

	/**
	 * Constructor
	 * 
	 * @param price
	 *            - price of each share
	 */
	public CompanyShares(String name, int numberOfShares, int price) {
		this.name = name;
		this.numberOfShares = numberOfShares;
		this.price = price;
	}

	/**
	 * @returns value of the all stocks
	 */
	public int getValue() {
		return numberOfShares * price;
	}

	/**
	 * @returns name of the stock
	 */
	public String getName() {
		return name;
	}

	/**
	 * @returns number of shares
	 */
	public int getNumberOfShares() {
		return numberOfShares;
	}

	/**
	 * @returns price of the each share
	 */
	public int getPrice() {
		return price;
	}
}
