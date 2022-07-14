package com.yash.assignment2_tdd;

public class Assignment2Q12 {
	
    String name;
    String lastname;
    public Assignment2Q12(String name, String lastname) {

        this.name = name;
        this.lastname = lastname;
    }


    @Override
    public  boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Assignment2Q12 that = (Assignment2Q12) o;
        return name.equals(that.name) &&
          lastname.equals(that.lastname);
    }

}
