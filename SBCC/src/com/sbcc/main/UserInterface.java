package com.sbcc.main;

import java.util.Scanner;

import com.sbcc.model.Player;
import com.sbcc.utility.SBCCUtility;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        String id = "";
        String name = "";
        int numOfMatches = 0;
        int run = 0;
        String zone = "";
        Player player = null;
        SBCCUtility sbccUtility = new SBCCUtility();
        while (true) {

            System.out.println("1.Parse the Player details and create player");
            System.out.println("System.out.println(\"1.Parse the Player details and create player");
            System.out.println("2.Exit");

            System.out.println("Enter your Choice :");
            n = Integer.parseInt(sc.nextLine());
            switch (n) {
                case 1 -> {
                    System.out.println("Enter the Player Details");
                    String playerDetails = sc.nextLine();
                    player = sbccUtility.parsePlayerDetails(playerDetails);
                    System.out.println("Player Id :" + player.getPlayerId());
                    System.out.println("Player Name :" + player.getPlayerName());
                    System.out.println("Matches Played :" + player.getMatchesPlayed());
                    System.out.println("Total runs Scored :" + player.getRunScored());
                    System.out.println("Playing Zonem :" + player.getPlayingZone());

                }
                case 2 -> {
                    System.out.print("Thank you for using SBCC application");

                }
                default -> {
                    System.out.println("Invalid entery");
                }
            }
        }
    }
}