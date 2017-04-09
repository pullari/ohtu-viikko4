package ohtu;

import com.google.gson.Gson;
import java.io.IOException;
import org.apache.http.client.fluent.Request;

public class Main {

    public static void main(String[] args) throws IOException {
        // vaihda oma opiskelijanumerosi seuraavaan
        String studentNr = "014448988";
        if ( args.length>0) {
            studentNr = args[0];
        }

        int hoursInTotal = 0;
        int excercisesInTotal = 0;
        
        String url = "http://ohtustats2017.herokuapp.com/students/"+studentNr+"/submissions";
        String bodyText = Request.Get(url).execute().returnContent().asString();
        
        String courseurl = "https://ohtustats2017.herokuapp.com/courses/1.json";
        String coursebodyText = Request.Get(courseurl).execute().returnContent().asString();

        System.out.println("json-muotoinen data:");
        System.out.println( bodyText );
        System.out.println( coursebodyText );

        Gson mapper = new Gson();
        Submission[] subs = mapper.fromJson(bodyText, Submission[].class);
        Course course = mapper.fromJson(coursebodyText, Course.class);
        
        System.out.println("Kurssi: " + course.getName() + ", " + course.getTerm() + "\n");
        
        System.out.println("Oliot:");
        for (Submission submission : subs) {
            submission.collectExcData();
            System.out.println(submission);
            hoursInTotal += submission.getHours();
            excercisesInTotal += submission.excDoneAmount();
        }

        System.out.println("\n " + excercisesInTotal + " tehtävää, " + hoursInTotal + " tuntia");
        
    }
}