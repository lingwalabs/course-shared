package es.cursonoruego.model;

import java.util.Calendar;

public class WordEventJson {

    private Long id;

    private WordJson word;

    private TaskJson task;

    private Calendar calendar;

    private Calendar calendarRevision1, calendarRevision2, calendarRevision3, calendarRevision4;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public WordJson getWord() {
        return word;
    }

    public void setWord(WordJson word) {
        this.word = word;
    }

    public TaskJson getTask() {
        return task;
    }

    public void setTask(TaskJson task) {
        this.task = task;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public Calendar getCalendarRevision1() {
        return calendarRevision1;
    }

    public void setCalendarRevision1(Calendar calendarRevision1) {
        this.calendarRevision1 = calendarRevision1;
    }

    public Calendar getCalendarRevision2() {
        return calendarRevision2;
    }

    public void setCalendarRevision2(Calendar calendarRevision2) {
        this.calendarRevision2 = calendarRevision2;
    }

    public Calendar getCalendarRevision3() {
        return calendarRevision3;
    }

    public void setCalendarRevision3(Calendar calendarRevision3) {
        this.calendarRevision3 = calendarRevision3;
    }

    public Calendar getCalendarRevision4() {
        return calendarRevision4;
    }

    public void setCalendarRevision4(Calendar calendarRevision4) {
        this.calendarRevision4 = calendarRevision4;
    }
}
