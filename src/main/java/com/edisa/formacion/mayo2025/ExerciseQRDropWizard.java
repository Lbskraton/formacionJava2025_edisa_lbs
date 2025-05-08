package com.edisa.formacion.mayo2025;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class ExerciseQRDropWizard extends Application<ConfigurationWizard> {


    public static void main(String[] args) throws Exception {
        new ExerciseQRDropWizard().run();
    }

    //Metodo run similar al de la clase thread, lo que ejecurara dropwizard
    @Override
    public void run(ConfigurationWizard configurationWizard, Environment environment) throws Exception {

    }
}
