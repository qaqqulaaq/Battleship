import java.util.Scanner;

public class placeBoats {

static int[][] allSpots= {{0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0},

};

int thisBoatsUnits = 0;
String placingPrompt = "";

public void placingPrompt(int thisBoatsUnits){
    thisBoatsUnits = this.thisBoatsUnits;
    String thisBoatsUnit = null;
    System.out.println("The current boat is" + thisBoatsUnit + "units wide. On what coordinates would you like the bow (it will extend" + thisBoatsUnits + "spaces after that)?");
}

int[] allBoatsUnits = {5,4,3,3,2};
String[] allBoatsNames = {"Carrier", "Battleship", "Cruiser", "Submarine", "Destroyer"};


public void userPlaces(){
    for(int i = 0; i < allBoatsUnits.length; i++){
    
    thisBoatsUnits = allBoatsUnits[i];

    System.out.println("The current boat is " + allBoatsNames[i] + " and is " + thisBoatsUnits + " units wide. On what coordinates would you like the bow (it will extend " + thisBoatsUnits + " spaces after that)?");

    Scanner input = new Scanner(System.in);
    System.out.println("Tell me the the x value you want the bow of your boat to be on");
    int bowX = input.nextInt();
    input.nextLine();
    System.out.println("Tell me the the y value you want the bow of your boat to be on");
    int bowY = input.nextInt();
    input.nextLine();
    System.out.println("Tell me the x value you want the stern of your boat to be on (remember the boat has to extend " + thisBoatsUnits + " spaces after the bow)");
    int sternX = input.nextInt();
    input.nextLine();
    System.out.println("Tell me the y value you want the stern of your boat to be on (remember the boat has to extend " + thisBoatsUnits + " spaces after the bow)");
    int sternY = input.nextInt();
    input.nextLine();   
   
    int XunitsInBetween = sternX - bowX;
    // int YunitsInBetween = sternY - bowY;  
    allSpots[bowX][bowY] = 1; 

   for(int j = 0; j <= XunitsInBetween; j++){
    allSpots[bowX + 1][bowY] = 1;
   }
    System.out.println(java.util.Arrays.toString(placeBoats.allSpots[0]) + "\n" + java.util.Arrays.toString(placeBoats.allSpots[1]) + "\n" + java.util.Arrays.toString(placeBoats.allSpots[2]) + "\n" + java.util.Arrays.toString(placeBoats.allSpots[3]) + "\n" + java.util.Arrays.toString(placeBoats.allSpots[4]) + "\n" + java.util.Arrays.toString(placeBoats.allSpots[5]) + "\n" + java.util.Arrays.toString(placeBoats.allSpots[6]) + "\n" + java.util.Arrays.toString(placeBoats.allSpots[7]) + "\n" + java.util.Arrays.toString(placeBoats.allSpots[8]) + "\n" + java.util.Arrays.toString(placeBoats.allSpots[9]));


    input.close();
}
}




}
