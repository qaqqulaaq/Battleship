import java.util.Scanner;
public class shipRunner { public static void main(String[]args){
       String icon = "hello";
       String board = "xddcc";
       boolean hit = false;
       boolean ship = false;
       boolean boyKisser = false;
     
       boolean gameOver = false;
String[][] source =    {{"_","1","2","3","4","5","6","7","8","9","10"},
                       {"A","0","0","0","0","0","0","0","0","0","0"},
                       {"B","0","0","0","0","0","0","0","0","0","0"},
                       {"C","0","0","0","0","0","0","0","0","0","0"},
                       {"D","0","0","0","0","0","0","0","0","0","0"},
                       {"E","0","0","0","0","0","0","0","0","0","0"},
                       {"F","0","0","0","0","0","0","0","0","0","0"},
                       {"G","0","0","0","0","0","0","0","0","0","0"},
                       {"H","0","0","0","0","0","0","0","0","0","0"},
                       {"I","0","0","0","0","0","0","0","0","0","0"},
                       {"J","0","0","0","0","0","0","0","0","0","0"}};

    // the first grid that im trying to copy into other stuff ^    

 String [][] player =  {{"_","1","2","3","4","5","6","7","8","9","10"},
                       {"A","0","0","0","0","0","0","0","0","0","0"},
                       {"B","0","0","0","0","0","0","0","0","0","0"},
                       {"C","0","0","0","0","0","0","0","0","0","0"},
                       {"D","0","0","0","0","0","0","0","0","0","0"},
                       {"E","0","0","0","0","0","0","0","0","0","0"},
                       {"F","0","0","0","0","0","0","0","0","0","0"},
                       {"G","0","0","0","0","0","0","0","0","0","0"},
                       {"H","0","0","0","0","0","0","0","0","0","0"},
                       {"I","0","0","0","0","0","0","0","0","0","0"},
                       {"J","0","0","0","0","0","0","0","0","0","0"}};
   // the code board that can be edited ^
         Scanner violet = new Scanner(System.in);
         placeBoats v_v = new placeBoats();
         v_v.userPlaces(violet);
         
   while(gameOver == false){
      //makes everything run forever
    //  used = 
  for(int row = 0; row < source.length;row++){
   for(int colm = 0; colm < source[row].length;colm++){
    //creating the row major that i'm used to ^ 
    board = "";
    // resets the board back to being empty

     if( source[row][colm] == "~" || source[row][colm] == "0"){
        hit = false;
        ship = false;
        boyKisser = false;
     }
     else if( source[row][colm] == "$" || source[row][colm] == "1"){
        hit = false;
        ship = true;
        boyKisser = false;
     }
     else if( source[row][colm] == "*"){
        hit = true;
        ship = true;
        boyKisser = false;
     }
     else if( source[row][colm] == "#"){
        hit = true;
        ship = false;
        boyKisser = false;
     }
     else{
        boyKisser = true;
     }
     // makes all the icons have booleans tied to them so that (i think) they could be edited easier
     // if there isn't an icon there was before they get printed off anyway
     if (boyKisser == true){
        icon = source[row][colm];
      }
       else if(hit == true && ship == true){
        icon = "*";
      }
      else if(hit == true && ship == false){
        icon = "#";
      }
      else if(hit == false && ship == true){
        icon = "$";
      }
      else if(hit == false && ship == false){
        icon = "~";
     }
     // turns all my booleans back into icons so that they can be printed off good
    board += icon + " ";
    // the board being made with every passing of the code
    player[row][colm] = source[row][colm];
  }
  board += "\n";
  // line break after each row
  }
  System.out.println(board);
  //actual board

 

//Aim versOne = new Aim();
//Scanner aimShot = new Scanner(System.in);
int[] aimDelta = v_v.shotCreator(violet);
// aticus's aim class being used ^ 

int aimXNew = aimDelta[0];
int aimYNew = aimDelta[1];
// the X and Y cords to edit single cell ^
//versOne.attack(aimXNew, aimYNew);

   if(player[aimXNew][aimYNew] == "$"){
    player[aimXNew][aimYNew] = "*";
   }
   else if(player[aimXNew][aimYNew] == "~"){
    player[aimXNew][aimYNew] = "#";
}
else{
   System.out.println("You can't shoot there; try again");
   
   // gotta fix this to where i can make the code work, with it being aprt of this method still.
}





  
  for(int row = 0; row < player.length;row++){
   for(int colm = 0; colm < player[row].length;colm++){
        //creating the row major that i'm used to ^ 
    
     if( player[row][colm] == "~" || player[row][colm] == "0"){
        hit = false;
        ship = false;
        boyKisser = false;
     }
     else if( player[row][colm] == "$" || player[row][colm] == "1"){
        hit = false;
        ship = true;
        boyKisser = false;
     }
     else if( player[row][colm] == "*"){
        hit = true;
        ship = true;
        boyKisser = false;
     }
     else if( player[row][colm] == "#"){
        hit = true;
        ship = false;
        boyKisser = false;
     }
     else{
        boyKisser = true;
     }
     // makes all the icons have booleans tied to them so that (i think) they could be edited easier
     // if there isn't an icon there was before they get printed off anyway
     // does everything  again but for the other list that i want to be edited more
     if (boyKisser == true){
        icon = player[row][colm];
      }
       else if(hit == true && ship == true){
        icon = "*";
      }
      else if(hit == true && ship == false){
        icon = "#";
      }
      else if(hit == false && ship == true){
        icon = "$";
      }
      else if(hit == false && ship == false){
        icon = "~";
     }
     // turns all my booleans back into icons so that they can be printed off good
     board += icon + " ";
    // the board being made with every passing of the code
    source[row][colm] = player[row][colm];
    // makes the world go round, the biggest difference to the other line of code ^
  }
  board += "\n";
  // line break after each row
  }
  System.out.println(board);
  //actual board

   }
   violet.close();
}
}

