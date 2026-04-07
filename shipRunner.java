import java.util.Scanner;

public class shipRunner { public static void main(String[]args){
        String adrian = "hello";
        String board = "xddcc";
      String[][] source = {{"_","1","2","3","4","5","6","7","8","9","10"},
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
   for(int Row = 0; Row < source.length;Row++){
    for(int Column = 0; Column < source[Row].length;Column++){
      
      
      if( source[Row][Column] == "0"){
         adrian = "C";
      }
      else{
         adrian = source[Row][Column];
      }
       
      board += adrian + " ";
   }
   board += "\n";
   }
   System.out.println(board);


   Aim versOne = new Aim();
Scanner aimShot = new Scanner(System.in);
versOne.shotCreator(aimShot);

int aimXNew = aimDelta[0];
int aimYNew = aimDelta[1];

aimShot.close();
}

}