package app.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CsvUtil {


    public static List<String[]> read(String filePath) {
        List<String[]> rows = new ArrayList<>();

        File file = new File(filePath);
        if (!file.exists()) {
            return rows;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean isFirstLine = true;

            while ((line = br.readLine()) != null) {

                if (isFirstLine) {
                    isFirstLine = false;
                    continue;
                }

                String[] values = line.split(",");
                rows.add(values);
            }
        } catch (IOException e) {
            throw new RuntimeException("Error reading CSV file: " + filePath, e);
        }

        return rows;
    }


    public static void write(String filePath, String header, List<String> lines) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {

            // header
            bw.write(header);
            bw.newLine();


            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }

        } catch (IOException e) {
            throw new RuntimeException("Error writing CSV file: " + filePath, e);
        }
    }
}
