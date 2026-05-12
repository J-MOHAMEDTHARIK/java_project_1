package com.sbcc.model;

public class Player {
	
	private String playerId;
	private String playerName;
	private int matchesPlayed;
	private int runScored;
	private String playingZone;
	public String getPlayerId() {
		return playerId;
	}
	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getMatchesPlayed() {
		return matchesPlayed;
	}
	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}
	public int getRunScored() {
		return runScored;
	}
	public void setRunScored(int runScored) {
		this.runScored = runScored;
	}
	public String getPlayingZone() {
		return playingZone;
	}
	public void setPlayingZone(String playingZone) {
		this.playingZone = playingZone;
	}
	
	
	public Player() {
		super();
	}
	
	public Player(String playerId, String playerName, int matchesPlayed, int runScored, String playingZone) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.matchesPlayed = matchesPlayed;
		this.runScored = runScored;
		this.playingZone = playingZone;
	}
	
	
	public int 	calculateTotalRuns(String[]  runScored) 
	{
		int totalRun=0;
		for(String run:runScored)
		{
			totalRun+= Integer.parseInt(run);
		}
		return totalRun;
	}
	
	
	
	
	

}
