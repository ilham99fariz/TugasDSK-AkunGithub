import java.util.Date;

public class Main {
    public static void main(String[] args) {
        SchedulePlanner planner = new SchedulePlanner();

        // Adding tasks
        planner.addTask("Complete Java Assignment", new Date());
        planner.addTask("Read a Book", new Date());
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
