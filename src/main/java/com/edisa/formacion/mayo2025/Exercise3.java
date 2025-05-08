package com.edisa.formacion.mayo2025;

public class Exercise3 {

    public static Boolean checkNumberArguments(String[] ar) {
        Boolean valid = false;
        if (ar.length == 0) {
            System.out.println("Ningun parámetro proporcionado");

        } else if (ar.length > 3) {
            System.out.printf("Demasiados parametros introducidos, introducidos "+ar.length+".");

        } else {
            valid = true;
        }

        return valid;
    }

    public static void main(String[] args) {

    }
}
