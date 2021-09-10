package edu.uaslp.library.reporters;

import edu.uaslp.library.util.Fecha;

public class StudentReporter {

    public void imprimirReporte(){
        Fecha fechaNacimiento = new Fecha();
        Fecha fechaIngreso = new Fecha();

        fechaNacimiento.ponerFecha(2010, Fecha.JULIO, 25);
        fechaIngreso.ponerFecha(2018, Fecha.AGOSTO, 10);

        System.out.println("Ingreso: " + fechaIngreso.format("dd/mm/yyyy"));

        System.out.println("Nacimiento: " + fechaNacimiento.format("dd/mm/yyyy"));
    }
}
