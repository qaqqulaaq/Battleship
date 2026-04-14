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

// this sets up a list of the entire grid
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

// isaia in the futare, the creation of the scanner needs to be outside of the method so that it can be closed at the end of the game.
//talk to voilet to see if it breaks stuff, i think we can move a lot of things  for the order to not change,but im not sure if having all of that out of the method will will ruin it.


public void userPlaces(Scanner input){
    for(int i = 0; i < allBoatsUnits.length; i++){
//these are the lists of all the boast and information about them. 
// they're in the same order so the carrier is 5 units and so on. 
public void userPlaces(){
    for(int i = 0; i < allBoatsUnits.length; i++){

    // this for loop will go through each boat because it is the length of the list of the units. 
    
    thisBoatsUnits = allBoatsUnits[i];

    System.out.println("The current boat is " + allBoatsNames[i] + " and is " + thisBoatsUnits + " units wide. On what coordinates would you like the bow (it will extend " + thisBoatsUnits + " spaces after that)?");

    
    System.out.println("Tell me the the x value you want the bow of your boat to be on");
    int bowX = input.nextInt();
    input.nextLine();
    System.out.println("Tell me the the y value you want the bow of your boat to be on");
    int bowY = input.nextInt();
    input.nextLine();
    //these are the user prompts again
   
   

    System.out.println("Now tell me the direction you want your boat to extend in (down, left, right)");
    String direction = input.nextLine();

    if(direction.equals("down")){
       if(thisBoatsUnits == 2){
        if(allSpots[bowX][bowY] == 1){
          System.out.println("This spot is already filled; try again");
      //if the next line was down, then the boats goes downwards
      //only if the other spots aren't already filled, but that part isnt working yet
       if(thisBoatsUnits == 2){
        if(allSpots[bowX][bowY] == 1 || allSpots[bowX+1][bowY] == 1){
          System.out.println("This spot is already filled; womp womp restart the entire program");
          i = 0;
          //if the spots are already filled, the you have to restart
        }
        else{
        allSpots[bowX][bowY] = 1;
        allSpots[bowX+1][bowY] = 1;
        }
       }
       else if(thisBoatsUnits == 3){
        if(allSpots[bowX][bowY] == 1){
          System.out.println("This spot is already filled; try again");
        if(allSpots[bowX][bowY] == 1 || allSpots[bowX+1][bowY] == 1 || allSpots[bowX+2][bowY] == 1){
          System.out.println("This spot is already filled; womp womp restart the entire program");
        }
        else {
        allSpots[bowX][bowY] = 1;
        allSpots[bowX+1][bowY] = 1;
        allSpots[bowX+2][bowY] = 1;
        }
       }
       else if(thisBoatsUnits == 4){
        if(allSpots[bowX][bowY] == 1){
          System.out.println("This spot is already filled; try again");
        if(allSpots[bowX][bowY] == 1 || allSpots[bowX+1][bowY] == 1 || allSpots[bowX+2][bowY] == 1 || allSpots[bowX+3][bowY] == 1){
          System.out.println("This spot is already filled; womp womp restart the entire program");
        }
        else {
        allSpots[bowX][bowY] = 1;
        allSpots[bowX+1][bowY] = 1;
        allSpots[bowX+2][bowY] = 1;
        allSpots[bowX+3][bowY] = 1;
        }
       }
       else if(thisBoatsUnits == 5){
        if(allSpots[bowX][bowY] == 1){
          System.out.println("This spot is already filled; try again");
        if(allSpots[bowX][bowY] == 1 || allSpots[bowX+1][bowY] == 1 || allSpots[bowX+2][bowY] == 1 || allSpots[bowX+3][bowY] == 1 || allSpots[bowX+4][bowY] == 1){
          System.out.println("This spot is already filled; womp womp restart the entire program");
        
        }
        else {
        allSpots[bowX][bowY] = 1;
        allSpots[bowX+1][bowY] = 1;
        allSpots[bowX+2][bowY] = 1;
        allSpots[bowX+3][bowY] = 1;
        allSpots[bowX+4][bowY] = 1;
        }
       }
    }
      else if(direction.equals("right")){
        if(thisBoatsUnits == 2){
            allSpots[bowX][bowY] = 1;
            allSpots[bowX+1][bowY] = 1;
           }
           else if(thisBoatsUnits == 3){
            if(allSpots[bowX][bowY] == 1 || allSpots[bowX+1][bowY] == 1){
              System.out.println("This spot is already filled; womp womp restart the entire program");
              //this is the same thing but the x changed because you're going to the right now
            }
            else{
            allSpots[bowX][bowY] = 1;
            allSpots[bowX+1][bowY] = 1;
           }
          }
           else if(thisBoatsUnits == 3){
              if(allSpots[bowX][bowY] == 1 || allSpots[bowX+1][bowY] == 1 || allSpots[bowX+2][bowY] == 1){
                System.out.println("This spot is already filled; womp womp restart the entire program");
              }
              else {
            allSpots[bowX][bowY] = 1;
            allSpots[bowX+1][bowY] = 1;
            allSpots[bowX+2][bowY] = 1;
           }
           else if(thisBoatsUnits == 4){
          }
           else if(thisBoatsUnits == 4){
            if(allSpots[bowX][bowY] == 1 || allSpots[bowX+1][bowY] == 1 || allSpots[bowX+2][bowY] == 1 || allSpots[bowX+3][bowY] == 1){
              System.out.println("This spot is already filled; womp womp restart the entire program");
            }
            else {
            allSpots[bowX][bowY] = 1;
            allSpots[bowX+1][bowY] = 1;
            allSpots[bowX+2][bowY] = 1;
            allSpots[bowX+3][bowY] = 1;
           }
           else if(thisBoatsUnits == 5){
          }
           else if(thisBoatsUnits == 5){
            if(allSpots[bowX][bowY] == 1 || allSpots[bowX+1][bowY] == 1 || allSpots[bowX+2][bowY] == 1 || allSpots[bowX+3][bowY] == 1 || allSpots[bowX+4][bowY] == 1){
              System.out.println("This spot is already filled; womp womp restart the entire program");
            }
            else {
            allSpots[bowX][bowY] = 1;
            allSpots[bowX+1][bowY] = 1;
            allSpots[bowX+2][bowY] = 1;
            allSpots[bowX+3][bowY] = 1;
            allSpots[bowX+4][bowY] = 1;
           }
       }
        else if(direction.equals("left")){
          if(thisBoatsUnits == 2){
                allSpots[bowX][bowY] = 1;
                allSpots[bowX-1][bowY] = 1;
              }
              else if(thisBoatsUnits == 3){
          
          if(thisBoatsUnits == 2){
            if(allSpots[bowX][bowY] == 1 || allSpots[bowX-1][bowY] == 1){
              System.out.println("This spot is already filled; womp womp restart the entire program");
            }
            else{
                allSpots[bowX][bowY] = 1;
                allSpots[bowX-1][bowY] = 1;
              }
            }
              else if(thisBoatsUnits == 3){
                if(allSpots[bowX][bowY] == 1 || allSpots[bowX-1][bowY] == 1 || allSpots[bowX-2][bowY] == 1){
                  System.out.println("This spot is already filled; womp womp restart the entire program");
                }
                else {
                allSpots[bowX][bowY] = 1;
                allSpots[bowX-1][bowY] = 1;
                allSpots[bowX-2][bowY] = 1;
              }
              else if(thisBoatsUnits == 4){
            }
              else if(thisBoatsUnits == 4){
                if(allSpots[bowX][bowY] == 1 || allSpots[bowX-1][bowY] == 1 || allSpots[bowX-2][bowY] == 1 || allSpots[bowX-3][bowY] == 1){
                  System.out.println("This spot is already filled; womp womp restart the entire program");
                }
                else {
                allSpots[bowX][bowY] = 1;
                allSpots[bowX-1][bowY] = 1;
                allSpots[bowX-2][bowY] = 1;
                allSpots[bowX-3][bowY] = 1;
              }
              else if(thisBoatsUnits == 5){
            }
              else if(thisBoatsUnits == 5){
                if(allSpots[bowX][bowY] == 1 || allSpots[bowX-1][bowY] == 1 || allSpots[bowX-2][bowY] == 1 || allSpots[bowX-3][bowY] == 1 || allSpots[bowX-4][bowY] == 1){
                  System.out.println("This spot is already filled; womp womp restart the entire program");
                }
                else {
                allSpots[bowX][bowY] = 1;
                allSpots[bowX-1][bowY] = 1;
                allSpots[bowX-2][bowY] = 1;
                allSpots[bowX-3][bowY] = 1;
                allSpots[bowX-4][bowY] = 1;
              }
         }
    }
   
// input.close();

    System.out.println(java.util.Arrays.toString(placeBoats.allSpots[0]) + "\n" + java.util.Arrays.toString(placeBoats.allSpots[1]) + "\n" + java.util.Arrays.toString(placeBoats.allSpots[2]) + "\n" + java.util.Arrays.toString(placeBoats.allSpots[3]) + "\n" + java.util.Arrays.toString(placeBoats.allSpots[4]) + "\n" + java.util.Arrays.toString(placeBoats.allSpots[5]) + "\n" + java.util.Arrays.toString(placeBoats.allSpots[6]) + "\n" + java.util.Arrays.toString(placeBoats.allSpots[7]) + "\n" + java.util.Arrays.toString(placeBoats.allSpots[8]) + "\n" + java.util.Arrays.toString(placeBoats.allSpots[9]));


  
  }

public void closer(Scanner input){
  input.close();
}

public int[] shotCreator(Scanner aimShot){
   System.out.print("Enter a number for x coordinate");
   int aimX = aimShot.nextInt();
   System.out.print("Enter a number for y coordinate");
   int aimY = aimShot.nextInt();
int[] aimDelta = {aimX, aimY};
return aimDelta;


   
//this print statement prints the grid row by row with the line breaks so that it actually looks like a grid. 

    
  }


    }
     System.out.println(java.util.Arrays.toString(placeBoats.allSpots[0]) + "\n" + java.util.Arrays.toString(placeBoats.allSpots[1]) + "\n" + java.util.Arrays.toString(placeBoats.allSpots[2]) + "\n" + java.util.Arrays.toString(placeBoats.allSpots[3]) + "\n" + java.util.Arrays.toString(placeBoats.allSpots[4]) + "\n" + java.util.Arrays.toString(placeBoats.allSpots[5]) + "\n" + java.util.Arrays.toString(placeBoats.allSpots[6]) + "\n" + java.util.Arrays.toString(placeBoats.allSpots[7]) + "\n" + java.util.Arrays.toString(placeBoats.allSpots[8]) + "\n" + java.util.Arrays.toString(placeBoats.allSpots[9]));
>>>>>>> ca5e3692dc1536ac5656aaff0e50b0b3b0100de8
}

}





