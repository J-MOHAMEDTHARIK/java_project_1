package com.sbcc.dao;

import java.util.*;

import com.sbcc.model.*;
import com.sbcc.utility.SBCCUtility;

public class SBCCBoard {

    private List<Player> playerList = new ArrayList<Player>();

    public List<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }

    public int addPlayerObject(String[] playerDetails) {
        SBCCUtility utility = new SBCCUtility();
        int count = 0;

        for (String detail : playerDetails) {
            Player player = utility.parsePlayerDetails(detail);

            if (player != null) {
                playerList.add(player);
                count++;
            }
        }

        return count;
    }

    public Map<String, Double> findTopPlayerDetails(String playerType) {
        Map<String, Double> result = new LinkedHashMap<String, Double>();

        List<Player> filteredList = new ArrayList<Player>();

        for (Player player : playerList) {
            if (playerType.equalsIgnoreCase("Batsman")
                    && player instanceof Batsman) {
                filteredList.add(player);
            } else if (playerType.equalsIgnoreCase("Bowler")
                    && player instanceof Bowler) {
                filteredList.add(player);
            }
        }

        Collections.sort(filteredList, new Comparator<Player>() {
            public int compare(Player p1, Player p2) {
                double rating1 = 0;
                double rating2 = 0;

                if (p1 instanceof Batsman)
                    rating1 = ((Batsman) p1).getStarRating();
                else
                    rating1 = ((Bowler) p1).getStarRating();

                if (p2 instanceof Batsman)
                    rating2 = ((Batsman) p2).getStarRating();
                else
                    rating2 = ((Bowler) p2).getStarRating();

                return Double.compare(rating2, rating1);
            }
        });

        for (int i = 0; i < 3; i++) {
            Player p = filteredList.get(i);

            if (p instanceof Batsman) {
                result.put(p.getPlayerId(),
                        ((Batsman) p).getStarRating());
            } else {
                result.put(p.getPlayerId(),
                        ((Bowler) p).getStarRating());
            }
        }

        return result;
    }
}