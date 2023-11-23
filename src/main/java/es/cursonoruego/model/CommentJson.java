package es.cursonoruego.model;

import java.util.Calendar;

public class CommentJson {
    
	private TaskJson task;
	
	private UserProfileJson userProfile;
	
	private Calendar time;
	
	private String text;

    public TaskJson getTask() {
        return task;
    }

    public void setTask(TaskJson task) {
        this.task = task;
    }

    public UserProfileJson getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(UserProfileJson userProfile) {
        this.userProfile = userProfile;
    }

    public Calendar getTime() {
        return time;
    }

    public void setTime(Calendar time) {
        this.time = time;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
