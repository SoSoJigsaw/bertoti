import java.util.Comparator;
import java.util.List;

public class PrioritySortingStrategy implements TaskSortingStrategy {

    @Override
    public List<Task> sort(List<Task> tasks) {

        tasks.sort(Comparator.comparing(Task::getPriority));

        return tasks;

    }


}