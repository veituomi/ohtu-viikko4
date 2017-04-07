package ohtu;

import com.google.gson.Gson;
import java.io.IOException;
import org.apache.http.client.fluent.Request;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("opiskelijanumero: ");
        String studentNr = scanner.nextLine();
        if ( args.length>0) {
            studentNr = args[0];
        }

        String url = "http://ohtustats2017.herokuapp.com/students/"+studentNr+"/submissions";

        String bodyText = Request.Get(url).execute().returnContent().asString();

        Gson mapper = new Gson();
        Submission[] subs = mapper.fromJson(bodyText, Submission[].class);
        
        int hoursTotal = 0, assignmentsTotal = 0;

        for (Submission submission : subs) {
            System.out.println(" " + submission);
            hoursTotal += submission.getHours();
            assignmentsTotal += submission.completedAssignments();
        }

        System.out.println("yhteensä: " + assignmentsTotal + " tehtävää " + hoursTotal + " tuntia");

    }
}