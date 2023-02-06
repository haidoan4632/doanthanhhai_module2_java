package ss16_i_text_file.bai_tap.doc_file.csv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    private static final String READ_WRITE_FILE = "E:\\doanthanhhai_module2_java\\src\\ss16_i_text_file\\bai_tap\\doc_file\\csv\\countriesfile.csv";

    public static List<Country> readCSV() {
        List<Country> countryList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader buff = null;

        try {
            fileReader = new FileReader(READ_WRITE_FILE);
            buff = new BufferedReader(fileReader);

            String line;
            String temp[];
            Country country;
            while ((line = buff.readLine()) != null) {
                temp = line.split(",");
                int id = Integer.parseInt(temp[0]);
                String code = temp[1];
                String name = temp[2];

                country = new Country(id, code, name);
                countryList.add(country);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                buff.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return countryList;
    }

    public static void main(String[] args) throws IOException {
        List<Country> countryList = readCSV();
        for (Country country : countryList) {
            System.out.println(country);
        }
    }
}

