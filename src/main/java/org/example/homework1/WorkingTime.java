package org.example.homework1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class WorkingTime {
   private LocalDateTime localDateTime;
   private boolean flag=false;


    public WorkingTime() {

    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public void checkWorkingTime(){
        LocalTime localtime=localDateTime.toLocalTime().now();
        LocalTime behind=LocalTime.parse("08:29:59");
        LocalTime after=LocalTime.parse("17:30:00");
        if (localDateTime.getDayOfWeek()== DayOfWeek.SATURDAY || localDateTime.getDayOfWeek()==DayOfWeek.SUNDAY){

            System.out.println(flag+" It's time of rest");
            return;
        }

        if ((localtime.isAfter(behind)) && localtime.isBefore(after)){
            flag=true;
            System.out.println(flag+" It's working time");
        }



        else {
            System.out.println(flag+" It's time of rest");
        }


    }

    public boolean checkWorkingTime1(){
        return localDateTime.getDayOfWeek()== DayOfWeek.SATURDAY;



    }


    public static void main(String[] args) {

        WorkingTime workingTime=new WorkingTime();
        workingTime.setLocalDateTime(LocalDateTime.now());;
        workingTime.checkWorkingTime();

    }
}
