package interfaceTry;

import java.time.LocalDate;

/**
 * A {@code schedual} object reprsent timetable
 * include 
 * "level" value of the importance of a event
 * "contest" value of the specific plan
 * "time" value of the time when the user need to finish it 
 */
public class schedual implements Comparable<schedual> {

    /**@parm 'level' used to show the importance,range '1' to '4', the less the more important;
     * contest is a plan
     * time is a time of a plan
     */
    private int level;
    private String contest;
    private LocalDate time;

    public schedual(){
        level = 0;
        contest = " ";
        time = LocalDate.now();
    }
    public schedual(String contest){
        this.contest = contest;
        level = 0;
        time = LocalDate.now();
    }
    public schedual(int level, String contest){
        this.level = level;
        this.contest = contest;
        time = LocalDate.now();
    }
    
    public void setTime(LocalDate time){
        this.time = time;
    }
    public void setLevel(int level){
        this.level = level;
    }
    public void reviseContest(String contest){
        this.contest = contest;
    }

    /**@return level of a contest*/
    public String getLevel(){
        return String.valueOf(level);
    }
    /**@return time of a contest */
    public String getTime(){
        return (String.valueOf(time.getMonth()) + " " + String.valueOf(time.getDayOfMonth()));
    }
    /**@return contest */
    public String getContest(){
        return contest;
    }
    /**
     * Compare schedual by level
     * @param object another scheldual object
     * @return 0 if the level is the same, negative is this scheedual has a lower
     */
    public int compareTo(schedual object) {
        return Double.compare(this.level, object.level);
    }
    
}
