import java.text.SimpleDateFormat;
import java.util.Date;

public class Task {
    private String taskName;
    private Date deadline;
    private boolean isCompleted;

    public Task(String taskName, Date deadline) {
        this.taskName = taskName;
        this.deadline = deadline;
        this.isCompleted = false;
    }

    public String getTaskName() {
        return taskName;
    }

    public Date getDeadline() {
        return deadline;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void markAsCompleted() {
        isCompleted = true;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        return "Task: " + taskName + " | Deadline: " + dateFormat.format(deadline) +
                " | Completed: " + (isCompleted ? "Yes" : "No");
    }
}
