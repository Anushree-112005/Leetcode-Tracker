// Last updated: 7/9/2026, 9:14:19 AM
class Solution {
    public int dayOfYear(String date) {
        int[] dayOfMonth={31,28,31,30,31,30,31,31,30,31,30,31};
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));
        if(leapyear(year)){
            dayOfMonth[1]=29;
        }
        int dayOfYear = 0;
        for (int i = 0; i < month - 1; i++) {
            dayOfYear += dayOfMonth[i];
        }
        dayOfYear+=day;
        return dayOfYear;
    }
    private boolean leapyear(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}