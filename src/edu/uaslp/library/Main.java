package edu.uaslp.library;

import edu.uaslp.library.reporters.StudentReporter;

public class Main {

    public static void main(String[] args) {
        StudentReporter studentReporter = new StudentReporter();

        studentReporter.imprimirReporte();
    }
}
