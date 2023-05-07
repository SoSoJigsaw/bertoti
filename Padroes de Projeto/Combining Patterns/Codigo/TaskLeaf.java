import java.util.ArrayList;
import java.util.List;

public class TaskLeaf implements TaskComponent {
    private String name;

    public TaskLeaf(String name) {
        this.name = name;
    }

    @Override
    public void add(TaskComponent component) {
        // Não faz nada, pois é uma folha e não pode ter filhos
    }

    @Override
    public void remove(TaskComponent component) {
        // Não faz nada, pois é uma folha e não pode ter filhos
    }

    @Override
    public List<TaskComponent> getChildren() {
        // Retorna uma lista vazia, pois é uma folha e não pode ter filhos
        return new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }
}