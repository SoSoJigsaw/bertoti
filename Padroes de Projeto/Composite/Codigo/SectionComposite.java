import java.util.ArrayList;
import java.util.List;

// Composite que representa uma seção
class SectionComposite implements DocumentComponent {

    private String text;
    private List<DocumentComponent> components = new ArrayList<>();

    public SectionComposite(String text) {
        this.text = text;
    }

    public void print() {
        System.out.println(text);
        for (DocumentComponent component : components) {
            component.print();
        }
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
        return text;
    }
    
}
