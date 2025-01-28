package Enum;

import static Enum.DayOfWeek.Понедельник;

public class Job {

    public static void main(String[] args) {

    }

    public WorkingDayExample dayOfWeek;

    public boolean goToJob;

    public void wakeUp() {


        if (this.dayOfWeek.getDayOfWeek() == Понедельник) {
            goToJob = true;
            System.out.println("На любимую работу ! ");
        }
        if (this.dayOfWeek.getDayOfWeek() == DayOfWeek.Вторник) {
            goToJob = true;
            System.out.println("На любимую работу ! ");
        }
        if (this.dayOfWeek.getDayOfWeek() == DayOfWeek.Среда) {
            goToJob = true;
            System.out.println("На любимую работу ! ");
        }
        if (this.dayOfWeek.getDayOfWeek() == DayOfWeek.Четверг) {
            goToJob = true;
            System.out.println("На любимую работу ! ");
        }
        if (this.dayOfWeek.getDayOfWeek() == DayOfWeek.Пятница) {
            goToJob = true;
            System.out.println("На любимую работу ! ");
        }
        if (this.dayOfWeek.getDayOfWeek() == DayOfWeek.Суббота) {
            goToJob = false;
            System.out.println("Ура, выходной ! ");
        }
        if (this.dayOfWeek.getDayOfWeek() == DayOfWeek.Воскресенье) {
            goToJob = false;
            System.out.println("Ура, выходной  ");
        }


    }


}
