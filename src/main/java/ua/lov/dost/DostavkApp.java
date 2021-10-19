package ua.lov.dost;

import java.io.*;

public class DostavkApp {
    public static void main(String[] args) {
        File file = new File(".\\dostSource.txt");

        try (BufferedReader br1 = new BufferedReader(new FileReader(file));) {

            StringBuilder stringBuilder1 = new StringBuilder();

            filetoString(br1, stringBuilder1);
            System.out.println(stringBuilder1);

            try (FileWriter fileWriter = new FileWriter(".\\parsing.txt")){
                fileWriter.write(stringBuilder1.toString());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void filetoString(BufferedReader br, StringBuilder stringBuilder) throws IOException {
        String str = "";
        try {
            while ((str = br.readLine()) != null) {
            //    String lowcase = "("+str.toLowerCase()+")\n";
                String lowcase = "'"+str.toLowerCase()+"'\n";

                stringBuilder.append(",").append(lowcase);
            }
        } catch (IOException e) {
            throw e;
        }
    }
}
