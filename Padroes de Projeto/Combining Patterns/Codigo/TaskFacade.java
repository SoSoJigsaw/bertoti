import java.util.List;

public class TaskFacade {
    private TaskSubjectImplSingleton taskManager;
    private TaskSortingStrategy sortingStrategy;

    public TaskFacade() {
        taskManager = TaskSubjectImplSingleton.getInstance();
    }

    public void addTask(String name, int priority, String dueDate) {
        Task task = new Task(name, priority, dueDate);
        taskManager.addTask(task);
    }

    public void removeTask(Task task) {
        taskManager.removeTask(task);
    }

    public List<Task> getTasks() {
        return taskManager.getTasks();
    }

    public List<Task> getTasksSortedByPriority() {
        TaskSortingStrategy strategy = new PrioritySortingStrategy();
        return strategy.sort(taskManager.getTasks());
    }

    public List<Task> getTasksSortedByDueDate() {
        TaskSortingStrategy strategy = new DueDateSortingStrategy();
        return strategy.sort(taskManager.getTasks());
    }

    public void setTaskSortingStrategy(TaskSortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

}