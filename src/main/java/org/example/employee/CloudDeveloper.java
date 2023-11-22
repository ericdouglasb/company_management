package org.example.employee;

import org.example.Website;

public class CloudDeveloper extends Developer {

    public CloudDeveloper(String name, String programminglanguage){
        super(name,programminglanguage);

    }

    public void fixWebsite(Website website) {
        website.fix();
    }

}
