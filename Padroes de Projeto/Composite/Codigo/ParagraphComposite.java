import java.util.ArrayList;
import java.util.List;

// Composite que representa um parágrafo
class ParagraphComposite implements DocumentComponent {

    private List<DocumentComponent> components = new ArrayList<>();

    public void print() {
        for (DocumentComponent component : components) {
            component.print();
        }
        System.out.println();
    }

    public void addComponent(DocumentComponent component) {
        components.add(component);
    }

    public void removeComponent(DocumentComponent component) {
        components.remove(component);
    }

    public List<DocumentComponent> getComponents() {
        return components;
    }

    public String getText() {
        throw new UnsupportedOperationException();
    }

}
