package es.cursonoruego.model;

import es.cursonoruego.model.enums.TaskType;
import java.util.List;

public class TaskJson {
    
    private Long id;
    
    private TaskType taskType;
    
    private String text;
    
    private String textEs;
    
    private String phonetics;
    
    private List<WordJson> words;

    private WordJson wordAlternative;

    private String mp3FileName;
    
    private ImageJson image;
    
    private String youTubeId;
    
    private List<CommentJson> comments;

    private List<String> correctAnswers;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TaskType getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskType taskType) {
        this.taskType = taskType;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTextEs() {
        return textEs;
    }

    public void setTextEs(String textEs) {
        this.textEs = textEs;
    }

    public String getPhonetics() {
        return phonetics;
    }

    public void setPhonetics(String phonetics) {
        this.phonetics = phonetics;
    }

    public List<WordJson> getWords() {
        return words;
    }

    public void setWords(List<WordJson> words) {
        this.words = words;
    }

    public WordJson getWordAlternative() {
        return wordAlternative;
    }

    public void setWordAlternative(WordJson wordAlternative) {
        this.wordAlternative = wordAlternative;
    }

    public String getMp3FileName() {
        return mp3FileName;
    }

    public void setMp3FileName(String mp3FileName) {
        this.mp3FileName = mp3FileName;
    }
    
    public ImageJson getImage() {
        return image;
    }

    public void setImage(ImageJson image) {
        this.image = image;
    }

    public String getYouTubeId() {
        return youTubeId;
    }

    public void setYouTubeId(String youTubeId) {
        this.youTubeId = youTubeId;
    }

    public List<CommentJson> getComments() {
        return comments;
    }

    public void setComments(List<CommentJson> comments) {
        this.comments = comments;
    }

    public List<String> getCorrectAnswers() {
        return correctAnswers;
    }

    public void setCorrectAnswers(List<String> correctAnswers) {
        this.correctAnswers = correctAnswers;
    }
}
