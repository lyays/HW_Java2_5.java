package java2hw.hw5;

import java.io.*;

public class FileCsv {
    public static void main(String[] args) {
        String [] header = new String[]{"value", "value1", "value2"};
        int[][] data = new int[][]{{100,200,123},{300,400,500}};
        AppData app = new AppData(header,data);

        try (PrintWriter out = new PrintWriter("./src/java2hw/hw5/HW5.csv")) {
                out.println(app);

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader in = new BufferedReader(new FileReader("./src/java2hw/hw5/HW5.csv"))) {
            String result = null;
            while ((result = in.readLine()) != null) {
               System.out.println(result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
