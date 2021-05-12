import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedException {

    public static void main(String[] args) {
        FileInputStream file_data = null;
        try {
            // if given file could not be found, "new FileInputStream()" would throw an "FileNotFoundException"
            file_data = new FileInputStream("src/resources/data.txt");

            //do some action

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (file_data != null) {
                    file_data.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
