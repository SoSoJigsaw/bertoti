import java.util.List;

// Interface Componente que representa um elemento do documento
interface DocumentComponent {

    public void print();

    public void addComponent(DocumentComponent component);

    public void removeComponent(DocumentComponent component);

    public List<DocumentComponent> getComponents();

    public String getText();

}