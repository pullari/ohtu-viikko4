/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu;

/**
 *
 * @author pullis
 */
public class Course {
    
    private String name;
    private String term;

    public void setName(String name) {
        this.name = name;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getName() {
        return name;
    }

    public String getTerm() {
        return term;
    }
    
    public Course() {}
    
}
