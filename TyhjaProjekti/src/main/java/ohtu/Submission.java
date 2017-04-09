package ohtu;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

public class Submission {
    
    @SerializedName("id")
    private int id;
    private String student_number;
    private String last_name;
    private String first_name;
    private int week;
    private int points;
    private String identifier;
    private int hours;
    private String comments;
    private String email;
    private Boolean a1;
    private Boolean a2;
    private Boolean a3;
    private Boolean a4;
    private Boolean a5;
    private Boolean a6;
    private Boolean a7;
    private Boolean a8;
    private Boolean a9;
    private Boolean a10;
    private Boolean a11;
    private Boolean a12;
    private Boolean a13;
    private Boolean a14;
    private Boolean a15;
    private Boolean a16;
    private Boolean a17;
    private Boolean a18;
    private Boolean a19;
    private Boolean a20;
    private Boolean a21;
    private String created_at;
    private String updated_at;
    private int course_id;
    private String github;
    private int student_id;
    private int challenging;
    
    private ArrayList<Boolean> exc;
    
    public Submission() {}
    
    public String getStudent_number() {
        return student_number;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }
    
    public void collectExcData() {
        exc = new ArrayList<>();
        exc.add(a1);
        exc.add(a2);
        exc.add(a3);
        exc.add(a4);
        exc.add(a5);
        exc.add(a6);
        exc.add(a7);
        exc.add(a8);
        exc.add(a9);
        exc.add(a10);
        exc.add(a11);
        exc.add(a12);
        exc.add(a13);
        exc.add(a14);
        exc.add(a15);
        exc.add(a16);
        exc.add(a17);
        exc.add(a18);
        exc.add(a19);
        exc.add(a20);
        exc.add(a21);
        
        ArrayList<Boolean> removeThese = new ArrayList<>();
        
        for (Boolean a : exc ) {
            if(a == null) removeThese.add(a);
        }
        exc.removeAll(removeThese);
    }

    public int getId() {
        return id;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setA1(boolean a1) {
        this.a1 = a1;
    }

    public void setA2(boolean a2) {
        this.a2 = a2;
    }

    public void setA3(boolean a3) {
        this.a3 = a3;
    }

    public void setA4(boolean a4) {
        this.a4 = a4;
    }

    public void setA5(boolean a5) {
        this.a5 = a5;
    }

    public void setA6(boolean a6) {
        this.a6 = a6;
    }

    public void setA7(boolean a7) {
        this.a7 = a7;
    }

    public void setA8(boolean a8) {
        this.a8 = a8;
    }

    public void setA9(boolean a9) {
        this.a9 = a9;
    }

    public void setA10(boolean a10) {
        this.a10 = a10;
    }

    public void setA11(boolean a11) {
        this.a11 = a11;
    }

    public void setA12(boolean a12) {
        this.a12 = a12;
    }

    public void setA13(boolean a13) {
        this.a13 = a13;
    }

    public void setA14(boolean a14) {
        this.a14 = a14;
    }

    public void setA15(boolean a15) {
        this.a15 = a15;
    }

    public void setA16(boolean a16) {
        this.a16 = a16;
    }

    public void setA17(boolean a17) {
        this.a17 = a17;
    }

    public void setA18(boolean a18) {
        this.a18 = a18;
    }

    public void setA19(boolean a19) {
        this.a19 = a19;
    }

    public void setA20(boolean a20) {
        this.a20 = a20;
    }

    public void setA21(boolean a21) {
        this.a21 = a21;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public void setChallenging(int challenging) {
        this.challenging = challenging;
    }

    public void setExc(ArrayList<Boolean> exc) {
        this.exc = exc;
    }

    public String getFirst_name() {
        return first_name;
    }

    public int getWeek() {
        return week;
    }

    public int getPoints() {
        return points;
    }

    public String getIdentifier() {
        return identifier;
    }

    public int getHours() {
        return hours;
    }

    public String getComments() {
        return comments;
    }

    public String getEmail() {
        return email;
    }

    public boolean isA1() {
        return a1;
    }

    public boolean isA2() {
        return a2;
    }

    public boolean isA3() {
        return a3;
    }

    public boolean isA4() {
        return a4;
    }

    public boolean isA5() {
        return a5;
    }

    public boolean isA6() {
        return a6;
    }

    public boolean isA7() {
        return a7;
    }

    public boolean isA8() {
        return a8;
    }

    public boolean isA9() {
        return a9;
    }

    public boolean isA10() {
        return a10;
    }

    public boolean isA11() {
        return a11;
    }

    public boolean isA12() {
        return a12;
    }

    public boolean isA13() {
        return a13;
    }

    public boolean isA14() {
        return a14;
    }

    public boolean isA15() {
        return a15;
    }

    public boolean isA16() {
        return a16;
    }

    public boolean isA17() {
        return a17;
    }

    public boolean isA18() {
        return a18;
    }

    public boolean isA19() {
        return a19;
    }

    public boolean isA20() {
        return a20;
    }

    public boolean isA21() {
        return a21;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public int getCourse_id() {
        return course_id;
    }

    public String getGithub() {
        return github;
    }

    public int getStudent_id() {
        return student_id;
    }

    public int getChallenging() {
        return challenging;
    }

    public ArrayList<Boolean> getExc() {
        return exc;
    }
    
    public int excAmount() {
        return exc.size();
    }
    
    public int excDoneAmount() {
        int ret = 0;
        for(int i = 1; i < exc.size(); i++) {
            if(exc.get(i - 1)) ret++;
        }
        
        return ret;
    }

    @Override
    public String toString() {
        String print = "Viikko " +
                       this.week +
                       ": tehtyjä tehtäviä yhteensä: " + 
                       this.exc.size() + " (maksimi " + 
                       exc.size() + "), aikaa kului " + this.hours + 
                       " tuntia, tehdyt tehtävät: ";
        
        for(int i = 1; i < exc.size(); i++) {
            if(exc.get(i - 1)) print += i + " ";
        }
        
        return print;
    }
    
}