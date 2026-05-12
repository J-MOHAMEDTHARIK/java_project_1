package com.sbcc.model;

public class Batsman extends Player {

	private int noOfHundreds;
	private int noOfFifties;
	private double starRating;

	public Batsman(String playerId, String playerName, int matchesPlayed, String playingZone, int noOfHundreds,
			int noOfFifties, double starRating) {
		super(playerId, playerName, matchesPlayed, noOfFifties, playingZone);
		this.noOfHundreds = noOfHundreds;
		this.noOfFifties = noOfFifties;
		this.starRating = starRating;
	}

	public Batsman() 
	{
		super();
	}

	public int getNoOfHundreds() 
	{
		return noOfHundreds;
	}

	public void setNoOfHundreds(int noOfHundreds) 
	{
		this.noOfHundreds = noOfHundreds;
	}

	public int getNoOfFifties() 
	{
		return noOfFifties;
	}

	public void setNoOfFifties(int noOfFifties) 
	{
		this.noOfFifties = noOfFifties;
	}

	public double getStarRating() 
	{

		return starRating;
	}

	public void setStarRating(double starRating) {
		this.starRating = starRating;
	}

	public void findStarRating() {
		
	

	}

}
