package org.example;

public class CloudDeveloper extends Developer {

    public CloudDeveloper(String name, String programminglanguage){
        super(name,programminglanguage);

    }

    public void fixWebsite(Website website) {
        website.fix();
    }

}
