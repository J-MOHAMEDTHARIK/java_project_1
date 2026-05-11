package com.sbcc.utility;

import java.util.*;
import com.sbcc.model.Player;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Player p = null;

        while (true) 
        {
            System.out.println("1. Parse the player details and create player");
            System.out.println("2. Exit");

            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) 
            {
                case 1:
                	
                	String id="";
                	String name="";
                	int matches = 0;
                	String zone="";
                	int total=0;
                	

                    System.out.println("Enter the player details");
                    String detail = sc.nextLine();
                    
                    String arr[] = detail.split(":");
                    
                    id+=arr[0];
                    name+=arr[1];
                    matches=Integer.parseInt(arr[2]);
                    for(int i=3;i<matches+3;i++) 
                    {
                    	total+=Integer.parseInt(arr[i]);
                    }
                    zone+=arr[matches+3];

                    

                    p = new Player(id, name, matches, zone);
                    
                    System.out.println("Player id: " + p.getPlayerId());
                    System.out.println("Player name: " + p.getPlayerName());
                    System.out.println("Matches played: " + p.getMatchesPlayed());
                    System.out.println("Total Score : " + total);

                    System.out.println("Playing zone: " + p.getPlayingZone());

                    break;

                

                case 2:

                    System.out.println("Thank you for using SBCC application");
                    System.exit(0);

                default:

                    System.out.println("Invalid choice");
            }
        }
    }
}