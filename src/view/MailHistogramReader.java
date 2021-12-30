package view;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.Mail;

public class MailHistogramReader {
    public static List<Mail> read(String fileName) {
        List<Mail> list = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
            String line = reader.readLine();
            while(line != null){
                if(Mail.isMail(line)){
                    list.add(new Mail(line));
                }
                line = reader.readLine();
            }
        } catch (FileNotFoundException exception){
            System.out.println("ERROR MailHistogramReader::read FileNotFound" + exception.getMessage());
        } catch (IOException exception) {
            System.out.println("ERROR MailHistogramReader::read FileNotFound" + exception.getMessage());
        }
        return list;
    }
    
}