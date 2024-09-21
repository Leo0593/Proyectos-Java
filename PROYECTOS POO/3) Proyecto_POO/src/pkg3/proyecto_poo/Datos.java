
package pkg3.proyecto_poo;

import java.util.Scanner;


public class Datos {
    
    private int dia;
    private int mes;
    private int año;

    public Datos(int dia, int mes, int año) 
    {
       
       if (año >= 1000 && año <= 3000) {
            this.año = año;
            if (mes >= 1 && mes <= 12) {
                this.mes = mes;

                if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                    if (dia >= 1 && dia <= 30) {
                        this.dia = dia;
                    }
                } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                    if (dia >= 1 && dia <= 31) {
                        this.dia = dia;
                    }
                } else if (mes == 2) {
                    if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
                        if (dia >= 1 && dia <= 29) {
                            this.dia = dia;
                        } else {
                            this.dia = 0;
                        }
                    } else {
                        if (dia >= 1 && dia <= 28) {
                            this.dia = dia;
                        } else {
                            this.dia = 0;
                        }
                    }
                }
            }
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (dia >= 1 && dia <= 31) {
            this.dia = dia;
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        }
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        if (año >= 1000 && año <= 3000) {
            this.año = año;
        }
    }
}
    

