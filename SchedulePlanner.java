import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SchedulePlanner {
    private List<Task> tasks;
    private List<HealthSchedule> healthSchedules;

    public SchedulePlanner() {
        this.tasks = new ArrayList<>();
        this.healthSchedules = new ArrayList<>();
    }

    public void addTask(String taskName, Date deadline) {
        Task newTask = new Task(taskName, deadline);
        tasks.add(newTask);
    }

    public void markTaskAsCompleted(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markAsCompleted();
        }
    }

    public void addHealthSchedule(String activity, Date time) {
        HealthSchedule newHealthSchedule = new HealthSchedule(activity, time);
        healthSchedules.add(newHealthSchedule);
    }

    public void displayTasks() {
        System.out.println("Task List:");
        for (Task task : tasks) {
            System.out.println(task);
        }
        System.out.println();
    }

    public void displayHealthSchedules() {
        System.out.println("Health Schedule:");
        for (HealthSchedule healthSchedule : healthSchedules) {
            System.out.println(healthSchedule);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SchedulePlanner planner = new SchedulePlanner();

        // Adding tasks
        planner.addTask("Complete Java Assignment", new Date());
        planner.addTask("It's time to break", new Date());
        planner.addTask("Write Code", new Date());

        // Marking a task as completed
        planner.markTaskAsCompleted(0);

        // Adding health schedules
        planner.addHealthSchedule("Drink Water", new Date());
        planner.addHealthSchedule("Exercise", new Date());
        planner.addHealthSchedule("Take Medicine", new Date());

        // Displaying tasks and health schedules
        planner.displayTasks();
        planner.displayHealthSchedules();
    }
}
