import java.util.Comparator;
import java.util.List;

public class DueDateSortingStrategy implements TaskSortingStrategy {

    @Override
    public List<Task> sort(List<Task> tasks) {

        tasks.sort(Comparator.comparing(Task::getDueDate));

        return tasks;

    }


}