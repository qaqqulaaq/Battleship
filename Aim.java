import java.util.Scanner;

public class Aim {
public int[] shotCreator(Scanner aimShot){
    System.out.print("Enter a number for x coordinate");
    int aimX = aimShot.nextInt();
    System.out.print("Enter a number for x coordinate");
    int aimY = aimShot.nextInt();
int[] aimDelta = {aimX, aimY};
return aimDelta;
}

}