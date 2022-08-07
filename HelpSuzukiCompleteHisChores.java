import java.util.Arrays;

public class HelpSuzukiCompleteHisChores
{
    public static int[] choreAssignments(int[] chores)
    {
      int[] chores1 = new int[ chores.length / 2 ];

        Arrays.sort(chores);

        for ( int i = 0; i < chores.length / 2 ; i++ ) 
            chores1[i] = chores[i] + chores[ chores.length - 1 - i ];

      Arrays.sort(chores1);

      return chores1;
    
    }

}