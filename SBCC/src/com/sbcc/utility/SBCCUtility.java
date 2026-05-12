package com.sbcc.utility;

import com.sbcc.model.Player;

public class SBCCUtility {
	//playerDetails = HXCB1234D:Dhoni:5:20:130:55:102:100:North:Batsman:3:1
	public Player parsePlayerDetails( String playerDetails)
	{
		Player player=null;
		String[] playerDetailsArr=playerDetails.split(":");
		//{"HXCB1234D","Dhoni","5","20","130","55","102","100","North","Batsman","3",1}
		int index=0;
		String id=playerDetailsArr[index++];
		String name=playerDetailsArr[index++];
		int matchPlayed=Integer.parseInt(playerDetailsArr[index++]);
		String[] runScored = new String[matchPlayed];
		
		for(int i=0;i<matchPlayed;i++)
		{
			runScored[i]=playerDetailsArr[index++];
		}
		//runScored = {"20","130","55","102","100"}
		
		String zone=playerDetailsArr[index++];
		player = new Player(id,name,matchPlayed,0,zone);
		int totalRun=player.calculateTotalRuns(runScored);
		
		player.setRunScored(totalRun);
		return player;
	}

}
