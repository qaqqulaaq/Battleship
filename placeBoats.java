import java.util.Scanner;

public class placeBoats {



int thisBoatsUnits = 0;
String placingPrompt = "";

public void placingPrompt(int thisBoatsUnits){
   thisBoatsUnits = this.thisBoatsUnits;
   String thisBoatsUnit = null;
   System.out.println("The current boat is" + thisBoatsUnit + "units wide. On what coordinates would you like the bow (it will extend" + thisBoatsUnits + "spaces after that)?");
}

int[] allBoatsUnits = {5,4,3,3,2};
String[] allBoatsNames = {"Carrier", "Battleship", "Cruiser", "Submarine", "Destroyer"};




public void userPlaces(Scanner input, String[][] allSpots){
   for(int i = 0; i < allBoatsUnits.length; i++){
  
   thisBoatsUnits = allBoatsUnits[i];

   System.out.println("The current boat is " + allBoatsNames[i] + " and is " + thisBoatsUnits + " units wide. On what coordinates would you like the bow (it will extend " + thisBoatsUnits + " spaces after that)?");

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
       if(allSpots[bowX][bowY] == "$"){
         System.out.println("\n ERROR: This spot is already filled; try again");
       }
       else{
       allSpots[bowX][bowY] = "$";
       allSpots[bowX+1][bowY] = "$";
       }
      }
      else if(thisBoatsUnits == 3){
       if(allSpots[bowX][bowY] == "$"){
         System.out.println("\n ERROR: This spot is already filled; try again");
       }
       else {
       allSpots[bowX][bowY] = "$";
       allSpots[bowX+1][bowY] = "$";
       allSpots[bowX+2][bowY] = "$";
       }
      }
      else if(thisBoatsUnits == 4){
       if(allSpots[bowX][bowY] == "$"){
         System.out.println("\n ERROR: This spot is already filled; try again");
       }
       else {
       allSpots[bowX][bowY] = "$";
       allSpots[bowX+1][bowY] = "$";
       allSpots[bowX+2][bowY] = "$";
       allSpots[bowX+3][bowY] = "$";
       }
      }
      else if(thisBoatsUnits == 5){
       if(allSpots[bowX][bowY] == "$"){
         System.out.println("\n ERROR: This spot is already filled; try again");
      
       }
       else {
       allSpots[bowX][bowY] = "$";
       allSpots[bowX+1][bowY] = "$";
       allSpots[bowX+2][bowY] = "$";
       allSpots[bowX+3][bowY] = "$";
       allSpots[bowX+4][bowY] = "$";
       }
      }
   }

   // we are now doing the right direction



     else if(direction.equals("right")){
       if(thisBoatsUnits == 2){
         if(allSpots[bowX][bowY] == "$"){
         System.out.println("\n ERROR: This spot is already filled; try again");
       }
       else {
           allSpots[bowX][bowY] = "$";
           allSpots[bowX+0][bowY+1] = "$";
          }
         }
          else if(thisBoatsUnits == 3){
           if(allSpots[bowX][bowY] == "$"){
             System.out.println("\n ERROR: This spot is already filled; try again");
           }
           else {
           allSpots[bowX][bowY] = "$";
           allSpots[bowX+0][bowY+1] = "$";
           allSpots[bowX+0][bowY+2] = "$";
           }
          }
          else if(thisBoatsUnits == 4){
           if(allSpots[bowX][bowY] == "$"){
             System.out.println("\n ERROR: This spot is already filled; try again");
           }
           else {

           allSpots[bowX][bowY] = "$";
           allSpots[bowX+0][bowY+1] = "$";
           allSpots[bowX+0][bowY+2] = "$";
           allSpots[bowX+0][bowY+3] = "$";
           }
          }
          else if(thisBoatsUnits == 5){
           if(allSpots[bowX][bowY] == "$"){
             System.out.println("\n ERROR: This spot is already filled; try again");
           }
           else {

           allSpots[bowX][bowY] = "$";
           allSpots[bowX+0][bowY+1] = "$";
           allSpots[bowX+0][bowY+2] = "$";
           allSpots[bowX+0][bowY+3] = "$";
           allSpots[bowX+0][bowY+4] = "$";
           }
          }
      }
       else if(direction.equals("left")){
         if(thisBoatsUnits == 2){
           if(allSpots[bowX][bowY] == "$"){
             System.out.println("\n ERROR: This spot is already filled; try again");
           }
           else {
          
               allSpots[bowX][bowY] = "$";
               allSpots[bowX][bowY-1] = "$";
           }
             }
             else if(thisBoatsUnits == 3){
               if(allSpots[bowX][bowY] == "$"){
                 System.out.println("\n ERROR: This spot is already filled; try again");
               }
               else {
               allSpots[bowX][bowY] = "$";
               allSpots[bowX][bowY-1] = "$";
               allSpots[bowX][bowY-2] = "$";
               }
             }
             else if(thisBoatsUnits == 4){
               if(allSpots[bowX][bowY] == "$"){
                 System.out.println("\n ERROR: This spot is already filled; try again");
               }
               else {
               allSpots[bowX][bowY] = "$";
               allSpots[bowX][bowY-1] = "$";
               allSpots[bowX][bowY-2] = "$";
               allSpots[bowX][bowY-3] = "$";
               }
             }
             else if(thisBoatsUnits == 5){
               if(allSpots[bowX][bowY] == "$"){
                 System.out.println("\n ERROR: This spot is already filled; try again");
               }
               else {
               allSpots[bowX][bowY] = "$";
               allSpots[bowX][bowY-1] = "$";
               allSpots[bowX][bowY-2] = "$";
               allSpots[bowX][bowY-3] = "$";
               allSpots[bowX][bowY-4] = "$";
               }
             }
        }
      }

  
}
public int[] shotCreator(Scanner aimShot){
  System.out.print("Enter a number for x coordinate");
  int aimX = aimShot.nextInt();
  System.out.print("Enter a number for y coordinate");
  int aimY = aimShot.nextInt();
int[] aimDelta = {aimX, aimY};
return aimDelta;
}



}