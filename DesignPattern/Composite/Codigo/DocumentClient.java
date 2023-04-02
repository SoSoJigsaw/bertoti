import java.util.ArrayList;
import java.util.List;

// Cliente do composite utilizando a interface DocumentComponent para trabalhar 
// com todos os elementos da árvore de forma uniforme
public class DocumentClient {

    public static void main(String[] args) {
        
        // cria um documento
        SectionComposite document = new SectionComposite("Meu Documento");

        // adiciona seções, parágrafos e frases
        SectionComposite section1 = new SectionComposite("Introdução");
        document.addComponent(section1);

        ParagraphComposite paragraph1 = new ParagraphComposite();
        section1.addComponent(paragraph1);

        PhraseComposite phrase1 = new PhraseComposite();
        paragraph1.addComponent(phrase1);

        WordLeaf word1 = new WordLeaf("Essa");
        phrase1.addComponent(word1);

        WordLeaf word2 = new WordLeaf("é");
        phrase1.addComponent(word2);

        WordLeaf word3 = new WordLeaf("uma");
        phrase1.addComponent(word3);

        WordLeaf word4 = new WordLeaf("história");
        phrase1.addComponent(word4);

        WordLeaf word5 = new WordLeaf("sobre");
        phrase1.addComponent(word5);

        WordLeaf word6 = new WordLeaf("programação");
        phrase1.addComponent(word6);

        SectionComposite section2 = new SectionComposite("Desenvolvimento");
        document.addComponent(section2);

        ParagraphComposite paragraph2 = new ParagraphComposite();
        section2.addComponent(paragraph2);

        PhraseComposite phrase2 = new PhraseComposite();
        paragraph2.addComponent(phrase2);

        WordLeaf word7 = new WordLeaf("Python");
        phrase2.addComponent(word7);

        WordLeaf word8 = new WordLeaf("é");
        phrase2.addComponent(word8);

        WordLeaf word9 = new WordLeaf("uma");
        phrase2.addComponent(word9);

        WordLeaf word10 = new WordLeaf("ótima");
        phrase2.addComponent(word10);

        WordLeaf word11 = new WordLeaf("linguagem");
        phrase2.addComponent(word11);

        WordLeaf word12 = new WordLeaf("para");
        phrase2.addComponent(word12);

        WordLeaf word13 = new WordLeaf("iniciantes");
        phrase2.addComponent(word13);

        // imprime o documento
        document.print();

        // obtém as palavras do documento
        List<DocumentComponent> words = getAllWords(document);
        System.out.println("Palavras do documento:");
        for (DocumentComponent word : words) {
            System.out.println(word.getText());
        }
    }

    // método auxiliar que retorna todas as palavras do documento
    public static List<DocumentComponent> getAllWords(DocumentComponent component) {
        List<DocumentComponent> words = new ArrayList<>();
        if (component instanceof WordLeaf) {
            words.add(component);
        } else {
            List<DocumentComponent> components = component.getComponents();
            for (DocumentComponent c : components) {
                words.addAll(getAllWords(c));
            }
        }
        return words;
    }
}
