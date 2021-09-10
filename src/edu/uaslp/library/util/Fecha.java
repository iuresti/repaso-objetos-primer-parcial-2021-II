package edu.uaslp.library.util;

public class Fecha {

    public static final int JULIO = 7;
    public static final int AGOSTO = 8;

    private int anio;
    private int mes;
    private int dia;

    // Todos los tipos primitivos numéricos se inicializan a cero
    // boolean se inicializa a false
    // Las referencias se inicializan a null

    public void ponerFecha(int anio, int mes, int dia){

        this.anio = anio;

        if(mes >= 1 && mes <= 12){
            this.mes = mes;
        }

        if((mes == 1 || mes == 3 || mes == 5 || mes == 7|| mes == 8 || mes == 10 || mes == 12) && dia <= 31) {
            this.dia = dia;
        }

        else if((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia <= 30) {
            this.dia = dia;
        }

        else if(mes == 2) {
            if(anio % 4 == 0 && dia <= 29) {
                this.dia = dia;
            }else if (dia <= 28){
                this.dia = dia;
            }
        }
    }

    public String format(String formatString) {

        if(isValid()){
            return this.dia + "/" + this.mes + "/" + this.anio;
        }

        return "FECHA INVALIDA";
    }

    public boolean isValid(){

        if(anio == 0 || mes == 0 || dia == 0){
            return false;
        }

        return  true;
    }
}
