import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileFacade {
    public static void createFile(String fileName) {
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("Arquivo criado com sucesso.");
            } else {
                System.out.println("Arquivo já existe.");
            }
        } catch (IOException e) {
            System.out.println("Erro ao criar arquivo: " + e.getMessage());
        }
    }

    public static void readFile(String fileName) {
        try {
            File file = new File(fileName);
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }
    }

    public static void writeFile(String fileName, String data) {
        try {
            File file = new File(fileName);
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write(data);
            bw.close();
            System.out.println("Arquivo gravado com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao gravar arquivo: " + e.getMessage());
        }
    }

    public static void deleteFile(String fileName) {
        try {
            File file = new File(fileName);
            if (file.delete()) {
                System.out.println("Arquivo excluído com sucesso.");
            } else {
                System.out.println("Arquivo não encontrado.");
            }
        } catch (Exception e) {
            System.out.println("Erro ao excluir arquivo: " + e.getMessage());
        }
    }


}