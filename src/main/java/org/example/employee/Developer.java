package org.example.employee;

import org.example.employee.Employee;

public class Developer extends Employee {
    String programmingLanguage;

    public Developer(String name, String programmingLanguage){
        super(name);
        this.programmingLanguage = programmingLanguage;
    }
    @Override
    public String getSound(){
        return "whoop whoop!";
    }


    public String getProgrammingLanguage() {
        return programmingLanguage;

    }
}
