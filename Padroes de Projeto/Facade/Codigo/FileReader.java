class FileReader {
  
    public void read(String filename) {
      
        try {
            FileReader fileReader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
          
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo '" + filename + "': " + e.getMessage());
        }
    }
}
