/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guidbactivity;

/**
 *
 * @author L12X08W08
 */
public class Students {
    private String id;
    private String lname;
    private String fname;
    private String age;

    public Students(String id, String lname, String fname, String age) {
        this.id = id;
        this.lname = lname;
        this.fname = fname;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getLname() {
        return lname;
    }

    public String getFname() {
        return fname;
    }

    public String getAge() {
        return age;
    }
}
