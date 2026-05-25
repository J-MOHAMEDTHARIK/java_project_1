package com.sbcc.utility;

import com.sbcc.model.*;
import com.sbcc.exception.InvalidPlayerIdException;

public class SBCCUtility {

    public Player parsePlayerDetails(String playerDetails) {

        String[] data = playerDetails.split(":");

        String playerId = data[0];
        String playerName = data[1];
        int matchesPlayed = Integer.parseInt(data[2]);

        // Runs are from index 3 to 3+matchesPlayed-1
        String[] runs = new String[matchesPlayed];
        for (int i = 0; i < matchesPlayed; i++) {
            runs[i] = data[i + 3];
        }

        Player temp = new Batsman();
        int totalRuns = temp.calculateTotalRuns(runs);

        // playingZone after run scores
        String playingZone = data[3 + matchesPlayed];

        // playerType after playingZone
        String playerType = data[4 + matchesPlayed];

        try {
            if (validatePlayerId(playerId)) {

                if (playerType.equalsIgnoreCase("Batsman")) {

                    int noOfHundreds =
                            Integer.parseInt(data[5 + matchesPlayed]);
                    int noOfFifties =
                            Integer.parseInt(data[6 + matchesPlayed]);

                    return new Batsman(playerId, playerName,
                            matchesPlayed, totalRuns,
                            playingZone,
                            noOfHundreds, noOfFifties);

                } else if (playerType.equalsIgnoreCase("Bowler")) {

                    int noOfMaiden =
                            Integer.parseInt(data[5 + matchesPlayed]);
                    int noOfHattrick =
                            Integer.parseInt(data[6 + matchesPlayed]);

                    return new Bowler(playerId, playerName,
                            matchesPlayed, totalRuns,
                            playingZone,
                            noOfMaiden, noOfHattrick);
                }
            }

        } catch (InvalidPlayerIdException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    public static boolean validatePlayerId(String playerId)
            throws InvalidPlayerIdException {

        if (playerId.matches("^[A-Z]{4}[0-9]{4}[A-Z]$")) {
            return true;
        } else {
            throw new InvalidPlayerIdException(
                    "Player with Id " + playerId + " is not valid");
        }
    }
}