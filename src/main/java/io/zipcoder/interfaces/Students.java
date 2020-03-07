package io.zipcoder.interfaces;

public final class Students extends People {
    private static Students INSTANCE;

    private Students() {
    }

    static {
        try {
            INSTANCE = new Students();
            INSTANCE.adder(new Student(0,"JermWerm"));
            INSTANCE.adder(new Student(1,"BilJoBajin"));
            INSTANCE.adder(new Student(2,"Samwell"));
            INSTANCE.adder(new Student(3,"TimTimmy"));
            INSTANCE.adder(new Student(4,"jimJimmy"));
            INSTANCE.adder(new Student(5,"RitDitDo"));
            INSTANCE.adder(new Student(6,"RatDatDat"));
            INSTANCE.adder(new Student(7,"Terry"));

        } catch (Exception e) {
            throw new RuntimeException("Whoopsie, there was an exception trying to make a student instance");
        }

    }

    public Students getINSTANCE(){

        return INSTANCE;
    }
}

