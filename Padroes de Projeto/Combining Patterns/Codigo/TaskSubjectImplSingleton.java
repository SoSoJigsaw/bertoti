import java.util.ArrayList;
import java.util.List;

public class TaskSubjectImplSingleton implements TaskSubject {

    private List<Task> tasks;
    private List<TaskObserver> observers;
    private static TaskSubjectImplSingleton instance;

    
    public TaskSubjectImplSingleton() {
        tasks = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public static synchronized TaskSubjectImplSingleton getInstance() {
        if (instance == null) {
            instance = new TaskSubjectImplSingleton();
        }
        return instance;
    }
    
    public void addTask(Task task) {
        tasks.add(task);
        notifyObservers(task);
    }

    
    public void removeTask(Task task) {
        tasks.remove(task);
    }

    
    public List<Task> getTasks() {
        return tasks;
    }

    @Override
    public void addObserver(TaskObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(TaskObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Task task) {
        for (TaskObserver observer : observers) {
            observer.onTaskAdded(task);
        }
    }

}