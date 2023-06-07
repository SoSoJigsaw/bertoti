public class FileClient {

    public static void main(String[] args) {
        
        FileFacade fileFacade = new FileFacade();

        // Ler o arquivo
        fileFacade.readFromFile("arquivo.txt");
    }
    
}
