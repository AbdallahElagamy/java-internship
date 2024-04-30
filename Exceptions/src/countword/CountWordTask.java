package countword;

import java.io.*;


public class CountWordTask {
    public static void main(String[] args) {
        try {
            count(new BufferedReader(new FileReader("Lincoln.txt")));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void count(BufferedReader file) {
        int cnt = 0;
        try (file) {
            String line;

            //iterate over the file, line by line
            while ((line = file.readLine()) != null) {
                if (line.isEmpty())
                    continue;

                //split words which there is space in between
                cnt += line.split(" ").length;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.printf("Number of Words: %d", cnt);
    }

}
