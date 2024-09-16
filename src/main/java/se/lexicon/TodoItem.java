package se.lexicon;

import java.time.LocalDate;

public class TodoItem {

    int id;
    String title;
    String taskDescription;
    LocalDate deadline;
    boolean done;
    Person creator;

    public TodoItem(int id, String title, String taskDescription,
                    LocalDate deadline, boolean done, Person creator) {
        this.id = id;
        this.title = title;
        this.taskDescription = taskDescription;
        this.deadline = deadline;
        this.done = done;
        this.creator = creator;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }

    public boolean isOverdue(LocalDate deadline){
        LocalDate currentDate = LocalDate.now();
        return currentDate.isAfter(deadline);

    }

    public String getSummary() {
        return new TodoItem(getId(),getTitle(),getTaskDescription(),getDeadline(),isDone(),getCreator()).toString();

    }
}
