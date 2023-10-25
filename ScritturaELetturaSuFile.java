package scrittura.e.lettura.su.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author chris
 */
public class ScritturaELetturaSuFile {

    public static void main(String[] args) throws IOException  {
        ArrayList<String> parole = new ArrayList<>();
        leggiFile(parole);
        ordina(parole);
        salvaFile(parole);
    }
    
    public static ArrayList<String> leggiFile(ArrayList<String> parole) throws FileNotFoundException, IOException {
        String nomeFileInput = "input.txt";
                
        FileReader fr = new FileReader(nomeFileInput);
        BufferedReader br = new BufferedReader(fr);
        String linea;
        

        try {
            
            while((linea=br.readLine())!=null) {
                String[] paroleLinea = linea.split(" ");
                
                for(String parola : paroleLinea) {
                    parole.add(parola);
                    System.out.println(parola);
                }
                System.out.println("Lettura e scrittura completate con successo.");
            }
            br.close();
            
         }
        catch (IOException e) {
        }
        return parole;
}
    
    public static void ordina(ArrayList<String> parole) {
        Collections.sort(parole);
    }
    
    public static void salvaFile (ArrayList<String> parole) throws IOException {
        
        try {
            FileWriter fileWriter = new FileWriter("output.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter pw = new PrintWriter(bufferedWriter);
            
            for (String elemento : parole) {
                pw.println(elemento);
            }
            pw.flush();
            pw.close();

        } catch (IOException e) {
        }
    }
}


