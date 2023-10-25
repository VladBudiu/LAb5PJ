package org.BudiuVlad;

import java.io.Serializable;

public class PerecheNumere {
    private int numar1;
    private int numar2;

    public PerecheNumere(int numar1, int numar2) {
        this.numar1 = numar1;
        this.numar2 = numar2;
    }
    public PerecheNumere(){}

    public int getNumar1() {
        return numar1;
    }

    public void setNumar1(int numar1) {
        this.numar1 = numar1;
    }

    public int getNumar2() {
        return numar2;
    }

    public void setNumar2(int numar2) {
        this.numar2 = numar2;
    }

    public boolean suntConsecutiveInFibonacci() {
        int a = Math.min(numar1, numar2);
        int b = Math.max(numar1, numar2);
        int fib1 = 0;
        int fib2 = 1;

        while (fib1 < b) {
            int temp = fib2;
            fib2 = fib1 + fib2;
            fib1 = temp;
        }

        return (fib1 == a && fib2 == b);
    }

    public int celMicMultipluComun() {
        return numar1 * numar2 / celMareComun();
    }

    private int celMareComun() {
        int a = numar1;
        int b = numar2;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public boolean sumaCifrelorEgala() {
        int suma1 = calculSumaCifre(numar1);
        int suma2 = calculSumaCifre(numar2);
        return suma1 == suma2;
    }

    private int calculSumaCifre(int numar) {
        int suma = 0;
        while (numar != 0) {
            suma += numar % 10;
            numar /= 10;
        }
        return suma;
    }

    public boolean numarCifrePareEgale() {
        int cifrePareNumar1 = numarCifrePare(numar1);
        int cifrePareNumar2 = numarCifrePare(numar2);
        return cifrePareNumar1 == cifrePareNumar2;
    }

    private int numarCifrePare(int numar) {
        int numarCifrePare = 0;
        while (numar != 0) {
            int cifra = numar % 10;
            if (cifra % 2 == 0) {
                numarCifrePare++;
            }
            numar /= 10;
        }
        return numarCifrePare;
    }

    public String toString()
    {
        return "("+numar1 + ","+numar2+")";
    }

}
