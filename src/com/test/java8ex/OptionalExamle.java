package com.test.java8ex;

import java.util.Optional;

public class OptionalExamle {
    public static void main(String[] args) {
        String str[]=new String[10];
        str[5]="5 the ELEment";
        Optional<String> checkNull=Optional.ofNullable(str[5]);
        if(checkNull.isPresent())
        {
            String stringLowerCase=str[5].toUpperCase();
            System.out.println(stringLowerCase);
        }
        else
        {
            System.out.println("String values is not presetnt");
        }

    }
}
