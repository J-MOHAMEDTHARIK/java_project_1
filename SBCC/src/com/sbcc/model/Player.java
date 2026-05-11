package com.sbcc.model;

public class Player 
{
    private String playerId;
    private String playerName;
    private int matchesPlayed;
    private String playingZone;

    
    public Player()
    {
    }

    
    public Player(String playerId, String playerName, int matchesPlayed, String playingZone) 
    {
        this.playerId = playerId;
        this.playerName = playerName;
        this.matchesPlayed = matchesPlayed;
 
        this.playingZone = playingZone;
    }

    
    public String getPlayerId() 
    {
        return playerId;
    }

    public void setPlayerId(String playerId) 
    {
        this.playerId = playerId;
    }

    public String getPlayerName() 
    {
        return playerName;
    }

    public void setPlayerName(String playerName) 
    {
        this.playerName = playerName;
    }

    public int getMatchesPlayed() 
    {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed) 
    {
        this.matchesPlayed = matchesPlayed;
    }

  

  

    public String getPlayingZone() 
    {
        return playingZone;
    }

    public void setPlayingZone(String playingZone) 
    {
        this.playingZone = playingZone;
    }
}
