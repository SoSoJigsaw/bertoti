public class TaskObserverImpl implements TaskObserver {

    private User user;

    public TaskObserverImpl(User user) {
        this.user = user;
    }

    @Override
    public void onTaskAdded(Task task) {

        System.out.println(String.format("Olá, %s! Uma nova tarefa foi adicionada: %s.", user.getName(), task.getName()));

        

    }


}