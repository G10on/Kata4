package kata4;
import java.util.List;
import view.MailHistogramReader;
import view.MailHistogramBuilder;
import view.HistogramDisplay;
import model.Histogram;
import model.Mail;

public class Kata4 {
    public static void main(String[] args) {
        String fileName = new String("email.txt");
        List<Mail> mailList = MailHistogramReader.read(fileName);
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        HistogramDisplay histogramDisplay = new HistogramDisplay("Histogram", histogram);
        histogramDisplay.execute();
    }
    
}
