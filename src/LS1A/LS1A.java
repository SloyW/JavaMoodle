package LS1A;

public class LS1A {
    public static void main(String[] args) {
        int zahl1 = 10;
        int zahl2 = 3;
        int ergebnis = 0;
        ergebnis = zahl1+zahl2;
        System.out.println(ergebnis);
        ergebnis = zahl1-zahl2;
        System.out.println(ergebnis);
        ergebnis = zahl1/zahl2;
        System.out.println(ergebnis);
        ergebnis = zahl1*zahl2;
        System.out.println(ergebnis);
        ergebnis = zahl1%zahl2;
        System.out.println(ergebnis);

        double ergebnisDouble = zahl1/zahl2;
        System.out.println(ergebnisDouble);

        ergebnisDouble = (double) zahl1/zahl2;
        System.out.println(ergebnisDouble);
    }
}
