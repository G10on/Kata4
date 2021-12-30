package kata4;
import java.util.List;
import view.MailHistogramReader;
import view.MailHistogramBuilder;
import view.HistogramDisplay;
import model.Histogram;
import model.Mail;

public class Kata4 {
    private static List<Mail> mailList;
    private static Histogram<String> histogram;

    public static void main(String[] args) {
        execute();
    }
    private static void execute() {
        input(); process(); output();
    }
    private static void input() {
        mailList = new MailListReader().read("email.txt");
    }
    private static void process() {
        histogram = new MailHistogramBuilder().build(mailList);
    }
    private static void output() {
        HistogramDisplay histogramDisplay = new HistogramDisplay("HISTOGRAMA", histogram);
        histogramDisplay.execute();
    }
}
