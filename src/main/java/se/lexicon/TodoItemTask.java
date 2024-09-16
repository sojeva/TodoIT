package se.lexicon;

public class TodoItemTask {

    int id;
    boolean assigned;
    TodoItem todoitem;
    Person assignee;

    public TodoItemTask(int id, boolean assigned, TodoItem todoitem, Person assignee) {
        this.id = id;
        this.assigned = assigned;
        this.todoitem = todoitem;
        this.assignee = assignee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    public TodoItem getTodoitem() {
        return todoitem;
    }

    public void setTodoitem(TodoItem todoitem) {
        this.todoitem = todoitem;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
    }

    public String getSummary() {
        return new TodoItemTask(getId(),isAssigned(),getTodoitem(),getAssignee()).toString();

    }

}
