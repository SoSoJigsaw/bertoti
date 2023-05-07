import java.util.List;

public class App {
    public static void main(String[] args) {

        // Cria uma instância da Facade da aplicação
        TaskFacade taskFacade = new TaskFacade();

        // Cria uma instância do Observer
        TaskObserver taskObserver = new TaskObserverImpl(new User("Joao"));

        // Adiciona o observador de tarefas ao gerenciador de tarefas
        TaskSubjectImplSingleton taskManager = TaskSubjectImplSingleton.getInstance();
        taskManager.addObserver(taskObserver);

        // Cria algumas tarefas e as adiciona ao gerenciador de tarefas
        Task task1 = new Task("Comprar leite", 5, "23 de Maio");
        Task task2 = new Task("Pagar conta de luz", 10, "10 de Maio");
        Task task3 = new Task("Fazer exercícios", 3, "30 de Maio");
        taskManager.addTask(task1);
        taskManager.addTask(task2);
        taskManager.addTask(task3);

        // Adiciona uma tarefa filha à primeira tarefa
        TaskComponent task4 = new Task("Comprar pão", 4, "5 de Maio");
        task1.add(task4);

        // Ordena as tarefas por prioridade usando a estratégia de ordenação por prioridade
        taskFacade.setTaskSortingStrategy(new PrioritySortingStrategy());
        List<Task> sortedTasks = taskFacade.getTasksSortedByPriority();

        // Imprime as tarefas ordenadas
        System.out.println("Tarefas ordenadas por prioridade:");
        for (Task task : sortedTasks) {
            System.out.println(task.getName());
        }

        // Ordena as tarefas por data de vencimento usando a estratégia de ordenação por data de vencimento
        taskFacade.setTaskSortingStrategy(new DueDateSortingStrategy());
        sortedTasks = taskFacade.getTasksSortedByDueDate();

        // Imprime as tarefas ordenadas
        System.out.println("Tarefas ordenadas por data de vencimento:");
        for (Task task : sortedTasks) {
            System.out.println(task.getName());
        }
    }
}