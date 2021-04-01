package interfaceTry;

import java.util.*;

/**
 * This program is used to try and understand interface
 * this program use Compareable interface
 * @version 2021.3.30
 * @author onemotre
 */
public class SchedualSortTest
{
    public static void main(String[] args){
        var timeTable = new schedual[3];

        timeTable[0] = new schedual(1, "do my homework");
        timeTable[1] = new schedual(3, "go to play with my friend");
        timeTable[2] = new schedual(2, "listen to music");

        Arrays.sort(timeTable);

        for(schedual s : timeTable){
            System.out.println(s.getLevel() + "." + s.getContest() + " in " + s.getTime());
        }
    }
}