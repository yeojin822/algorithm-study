package 이공일육;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class TwoThousandSixteen {
    public String solution(int a, int b) {
        String[] answer = {"MON","TUE","WED","THU","FRI","SAT","SUN"};
        // LocalDate 는 날짜를 나타내는 클래스
        LocalDate date = LocalDate.of(2016, a, b);

        //요일을 표현하는 DayOfWeek Enum
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        int dayOfWeekNumber = dayOfWeek.getValue();
        return answer[dayOfWeekNumber-1];
    }
}
