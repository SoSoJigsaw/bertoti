import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileFacade {
    
    private FileReader fileReader;

    public FileFacade() {
        this.fileReader = new FileReader();
    }

    public void readFromFile(String filename) {
        fileReader.read(filename);
    }
    
}
