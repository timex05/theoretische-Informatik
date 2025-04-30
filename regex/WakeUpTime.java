package regex;

import java.util.regex.Pattern;

public class WakeUpTime {
    

    public static void main(String[] args) {
        WakeUpTime wut = new WakeUpTime();
        System.out.println(wut.isWakeUpTime("MON:07.30h"));
        System.out.println(wut.isPatternAB("ababaaaab"));
        System.out.println(wut.isStudent("Timo,1123456,2023"));

    }

    public boolean isWakeUpTime(String time){
        return Pattern.compile("[A-Z]{3}:[0-2][0-9].[0-5][0-9]h", Pattern.CASE_INSENSITIVE).matcher(time).matches();
    }

    public boolean isPatternAB(String time){
        return Pattern.compile("a*ba+ba+ba*(ba*)*", Pattern.CASE_INSENSITIVE).matcher(time).matches();
    }

    public boolean isStudent(String time){
        return Pattern.compile("[A-Z][a-z]*,[1-9][0-9]{6},202[2-5]", Pattern.CASE_INSENSITIVE).matcher(time).matches();
    }

}
