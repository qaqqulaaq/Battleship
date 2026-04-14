import java.util.Scanner;

public class Aim {
public int[] shotCreator(Scanner aimShot){
   System.out.print("Enter a number for x coordinate");
   int aimX = aimShot.nextInt();
   System.out.print("Enter a number for y coordinate");
   int aimY = aimShot.nextInt();
int[] aimDelta = {aimX, aimY};
return aimDelta;
}

/*public void attack(int aimXNew,int aimYNew){
   if(player[aimXNew][aimYNew] == "$"){
    player[aimXNew][aimYNew] = "*";
   }
   else if(player[aimXNew][aimYNew] == "~"){
    player[aimXNew][aimYNew] = "#";
}
else{
   System.out.println("You can't shoot there; try again");
   attack();
   // gotta fix this to where i can make the code work, with it being aprt of this method still.
}
}
*/
}
