import java.util.List;

// Elemento Leaf que representa uma palavra
class WordLeaf implements DocumentComponent {

    private String text;

    public WordLeaf(String text) {
        this.text = text;
    }

    public void print() {
        System.out.print(text + " ");
    }

    public void addComponent(DocumentComponent component) {
        throw new UnsupportedOperationException();
    }

    public void removeComponent(DocumentComponent component) {
        throw new UnsupportedOperationException();
    }

    public List<DocumentComponent> getComponents() {
        throw new UnsupportedOperationException();
    }

    public String getText() {
        return text;
    }
    
}

