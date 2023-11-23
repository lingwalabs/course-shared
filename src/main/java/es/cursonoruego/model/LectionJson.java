package es.cursonoruego.model;

import es.cursonoruego.model.enums.CourseLevel;
import java.util.List;

public class LectionJson {
    
    private Long id;
    
    private String title;
    
    private CourseLevel courseLevel;

	private Integer listOrder;
    
    private boolean unlocked;
	
	private boolean completed;
    
    private List<TaskJson> tasks;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CourseLevel getCourseLevel() {
        return courseLevel;
    }

    public void setCourseLevel(CourseLevel courseLevel) {
        this.courseLevel = courseLevel;
    }

    public Integer getListOrder() {
        return listOrder;
    }

    public void setListOrder(Integer listOrder) {
        this.listOrder = listOrder;
    }

    public boolean isUnlocked() {
        return unlocked;
    }

    public void setUnlocked(boolean unlocked) {
        this.unlocked = unlocked;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public List<TaskJson> getTasks() {
        return tasks;
    }

    public void setTasks(List<TaskJson> tasks) {
        this.tasks = tasks;
    }
}
