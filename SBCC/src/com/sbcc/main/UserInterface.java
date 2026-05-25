package com.sbcc.main;

import java.util.*;

import com.sbcc.model.*;
import com.sbcc.service.SBCCService;
import com.sbcc.utility.SBCCUtility;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SBCCUtility utility = new SBCCUtility();
        SBCCService service = new SBCCService();

        while (true) {
            System.out.println("1.Validate player details");
            System.out.println("2.Create Batsman or Bowler");
            System.out.println("3.Validation with InvalidPlayerIdException");
            System.out.println("4.Add Player Details");
            System.out.println("5.Top three players");
            System.out.println("6.Exit");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                case 2:
                case 3:
                    System.out.println("Enter player details");
                    String input = sc.nextLine();

                    Player player = utility.parsePlayerDetails(input);

                    if (player != null) {
                        System.out.println(player.getPlayerId());
                        System.out.println(player.getPlayerName());
                        System.out.println(player.getMatchesPlayed());
                        System.out.println(player.getRunScored());
                        System.out.println(player.getPlayingZone());

                        if (player instanceof Batsman) {
                            Batsman b = (Batsman) player;
                            System.out.println(b.getNoOfHundreds());
                            System.out.println(b.getNoOfFifties());
                            System.out.println(b.getStarRating());
                        } else if (player instanceof Bowler) {
                            Bowler b = (Bowler) player;
                            System.out.println(b.getNoOfMaiden());
                            System.out.println(b.getNoOfHattrick());
                            System.out.println(b.getStarRating());
                        }
                    } else {
                        System.out.println("Please provide a valid record");
                    }
                    break;

                case 4:
                    System.out.println("Enter number of players");
                    int n = Integer.parseInt(sc.nextLine());

                    String[] players = new String[n];

                    for (int i = 0; i < n; i++) {
                        players[i] = sc.nextLine();
                    }

                    int count = service.addPlayerObject(players);

                    System.out.println(count + " valid records found");
                    break;

                case 5:
                    System.out.println("Enter player type");
                    String type = sc.nextLine();

                    Map<String, Double> map =
                            service.findTopPlayerDetails(type);

                    for (Map.Entry<String, Double> entry : map.entrySet()) {
                        System.out.println(entry.getKey() + " " +
                                entry.getValue());
                    }
                    break;

                case 6:
                    System.out.println("Thank you for using SBCC application");
                    System.exit(0);
            }
        }
    }
}