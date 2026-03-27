public class shipRunner{
  public static void main(String[]args){
        String adrian = "hello";
        String aticus = "xddcc";
      int[][] atigun = {{0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0}};
          aticus = "";
   for(int I = 0; I < atigun.length;I++){
    for(int i = 0; i < atigun[I].length;i++){
      
      
      if( atigun[I][i] == 0){
         adrian = "X";
      }
      else{
         adrian = "Y";
      }
       
      aticus += adrian;
   }
   aticus += "\n";
   }
   System.out.println(aticus);
}
}