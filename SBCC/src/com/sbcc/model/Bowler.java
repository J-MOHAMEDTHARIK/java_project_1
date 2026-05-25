package com.sbcc.model;

public class Bowler extends Player {

    private int noOfMaiden;
    private int noOfHattrick;
    private double starRating;

    public Bowler() {
    }

    public Bowler(String playerId, String playerName, int matchesPlayed,
                  int runScored, String playingZone,
                  int noOfMaiden, int noOfHattrick) {

        super(playerId, playerName, matchesPlayed, runScored, playingZone);
        this.noOfMaiden = noOfMaiden;
        this.noOfHattrick = noOfHattrick;
        findStarRating();
    }

    public int getNoOfMaiden() {
        return noOfMaiden;
    }

    public void setNoOfMaiden(int noOfMaiden) {
        this.noOfMaiden = noOfMaiden;
    }

    public int getNoOfHattrick() {
        return noOfHattrick;
    }

    public void setNoOfHattrick(int noOfHattrick) {
        this.noOfHattrick = noOfHattrick;
    }

    public double getStarRating() {
        return starRating;
    }

    public void setStarRating(double starRating) {
        this.starRating = starRating;
    }

    public void findStarRating() {
        starRating = ((noOfMaiden * 5.0) + (noOfHattrick * 10.0))
                        * getMatchesPlayed() / 100;
    }
}