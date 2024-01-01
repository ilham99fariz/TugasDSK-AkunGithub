import java.text.SimpleDateFormat;
import java.util.Date;

public class HealthSchedule {
    private String activity;
    private Date time;

    public HealthSchedule(String activity, Date time) {
        this.activity = activity;
        this.time = time;
    }

    public String getActivity() {
        return activity;
    }

    public Date getTime() {
        return time;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        return "Activity: " + activity + " | Time: " + dateFormat.format(time);
    }
}
