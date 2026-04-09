public class shipRunner { public static void main(String[]args){
        String icon = "hello";
        String board = "xddcc";
        boolean boat = false;
        boolean hit = false;
        boolean boyKisser = false;
        
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
          board = "";
   for(int row = 0; row < source.length;row++){
    for(int colm = 0; colm < source[row].length;colm++){
      
      
      if( source[row][colm] == "~" || source[row][colm] == "0"){
         boat = false;
         hit = false;
         boyKisser = false;
      }
      else if( source[row][colm] == "$"){
         boat = false;
         hit = true;
         boyKisser = false;
      }
      else if( source[row][colm] == "*"){
         boat = true;
         hit = true;
         boyKisser = false;
      }
      else if( source[row][colm] == "#"){
         boat = true;
         hit = false;
         boyKisser = false;
      }
      else{
         boyKisser = true;
      }
      if (boyKisser == true){
         icon = source[row][colm];
       }
        else if(boat == true && hit == true){
         icon = "*";
       }
       else if(boat == true && hit == false){
         icon = "#";
       }
       else if(boat == false && hit == true){
         icon = "$";
       }
       else if(boat == false && hit == false){
         icon = "~";
       }
       
      board += icon + " ";
   }
   board += "\n";
   }
   System.out.println(board);
   
}
}