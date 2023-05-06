public class FileClient {

    public static void main(String[] args) {

        FileFacade.createFile("meuarquivo.txt");

        FileFacade.writeFile("meuarquivo.txt", "Olá, mundo!");

        FileFacade.readFile("meuarquivo.txt");

        FileFacade.deleteFile("meuarquivo.txt");

    }


}