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

// public void placingPrompt(int thisBoatsUnits){
//     thisBoatsUnits = this.thisBoatsUnits;
//     String thisBoatsUnit = null;
//     System.out.println("The current boat is" + thisBoatsUnit + "units wide. On what coordinates would you like the bow (it will extend" + thisBoatsUnits + "spaces after that)?");
// // // this is the prompt that tells the user what's going on

//   }

int[] allBoatsUnits = {5,4,3,3,2};
String[] allBoatsNames = {"Carrier", "Battleship", "Cruiser", "Submarine", "Destroyer"};

//these are the lists of all the boast and information about them. 
// they're in the same order so the carrier is 5 units and so on. 





public void userPlaces(){
    for(int i = 0; i < allBoatsUnits.length; i++){

    // this for loop will go through each boat because it is the length of the list of the units. 
    
    thisBoatsUnits = allBoatsUnits[i];

    System.out.println("The current boat is " + allBoatsNames[i] + " and is " + thisBoatsUnits + " units wide. On what coordinates would you like the bow (it will extend " + thisBoatsUnits + " spaces after that)?");

    Scanner input = new Scanner(System.in);
    System.out.println("Tell me the the x value you want the bow of your boat to be on");
    int bowX = input.nextInt();
    input.nextLine();
    System.out.println("Tell me the the y value you want the bow of your boat to be on");
    int bowY = input.nextInt();
    input.nextLine();
   
   

    System.out.println("Now tell me the direction you want your boat to extend in (down, left, right)");
    String direction = input.nextLine();

    if(direction.equals("down")){
       if(thisBoatsUnits == 2){
        if(allSpots[bowX][bowY] == 1 || allSpots[bowX+1][bowY] == 1){
          System.out.println("This spot is already filled; womp womp restart the entire program");
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
    }
      else if(direction.equals("right")){
        if(thisBoatsUnits == 2){
            if(allSpots[bowX][bowY] == 1 || allSpots[bowX+1][bowY] == 1){
              System.out.println("This spot is already filled; womp womp restart the entire program");
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
   


    System.out.println(java.util.Arrays.toString(placeBoats.allSpots[0]) + "\n" + java.util.Arrays.toString(placeBoats.allSpots[1]) + "\n" + java.util.Arrays.toString(placeBoats.allSpots[2]) + "\n" + java.util.Arrays.toString(placeBoats.allSpots[3]) + "\n" + java.util.Arrays.toString(placeBoats.allSpots[4]) + "\n" + java.util.Arrays.toString(placeBoats.allSpots[5]) + "\n" + java.util.Arrays.toString(placeBoats.allSpots[6]) + "\n" + java.util.Arrays.toString(placeBoats.allSpots[7]) + "\n" + java.util.Arrays.toString(placeBoats.allSpots[8]) + "\n" + java.util.Arrays.toString(placeBoats.allSpots[9]));


    
  }


    }
}

}





