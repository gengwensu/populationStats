package com.practice.populationstats;

/**
 *
 */
public class Person {
    String name;
    int birthYear, deathYear;

    public Person(String pname, int pbirthyear, int pdeathyear) {
        name=pname;
        birthYear=pbirthyear;
        deathYear=pdeathyear;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getDeathYear() {
        return deathYear;
    }
}
