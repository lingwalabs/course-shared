package es.cursonoruego.model;

import java.util.Calendar;

public class LectionEventJson {
    
    private Long id;

    private LectionJson lection;

    private Calendar calendar;

    private Calendar calendarRepetition1Completed, calendarRepetition2Completed, calendarRepetition3Completed, calendarRepetition4Completed;

    private boolean timeForRevision1, timeForRevision2, timeForRevision3, timeForRevision4;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LectionJson getLection() {
        return lection;
    }

    public void setLection(LectionJson lection) {
        this.lection = lection;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public Calendar getCalendarRepetition1Completed() {
        return calendarRepetition1Completed;
    }

    public void setCalendarRepetition1Completed(Calendar calendarRepetition1Completed) {
        this.calendarRepetition1Completed = calendarRepetition1Completed;
    }

    public Calendar getCalendarRepetition2Completed() {
        return calendarRepetition2Completed;
    }

    public void setCalendarRepetition2Completed(Calendar calendarRepetition2Completed) {
        this.calendarRepetition2Completed = calendarRepetition2Completed;
    }

    public Calendar getCalendarRepetition3Completed() {
        return calendarRepetition3Completed;
    }

    public void setCalendarRepetition3Completed(Calendar calendarRepetition3Completed) {
        this.calendarRepetition3Completed = calendarRepetition3Completed;
    }

    public Calendar getCalendarRepetition4Completed() {
        return calendarRepetition4Completed;
    }

    public void setCalendarRepetition4Completed(Calendar calendarRepetition4Completed) {
        this.calendarRepetition4Completed = calendarRepetition4Completed;
    }

    public boolean isTimeForRevision1() {
        return timeForRevision1;
    }

    public void setTimeForRevision1(boolean timeForRevision1) {
        this.timeForRevision1 = timeForRevision1;
    }

    public boolean isTimeForRevision2() {
        return timeForRevision2;
    }

    public void setTimeForRevision2(boolean timeForRevision2) {
        this.timeForRevision2 = timeForRevision2;
    }

    public boolean isTimeForRevision3() {
        return timeForRevision3;
    }

    public void setTimeForRevision3(boolean timeForRevision3) {
        this.timeForRevision3 = timeForRevision3;
    }

    public boolean isTimeForRevision4() {
        return timeForRevision4;
    }

    public void setTimeForRevision4(boolean timeForRevision4) {
        this.timeForRevision4 = timeForRevision4;
    }
}
