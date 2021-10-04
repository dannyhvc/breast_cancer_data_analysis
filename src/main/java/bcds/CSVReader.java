package bcds;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

// functor class
public class CSVReader {
    public ArrayList<String[]> Data = new ArrayList<>();
    public CSVReader(final String filename) {
        String line;
        try {
            BufferedReader buffer_io = new BufferedReader(new FileReader(filename));
            while ((line = buffer_io.readLine()) != null) {
                Data.add(line.split(","));
            }
            buffer_io.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
