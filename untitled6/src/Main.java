void main() {
// Zadanie 1
    public int pobierzWiek() {
        return 19;
    }

// Zadanie 2
    public String pobierzImie() {
        return "Eryk";
    }

// Zadanie 3
    public void dzialania(double a, double b) {
        System.out.println("Suma: " + (a + b));
        System.out.println("Różnica: " + (a - b));
        System.out.println("Iloczyn: " + (a * b));
    }

// Zadanie 4
    public boolean czyParzysta(int liczba) {
        return liczba % 2 == 0;
    }

// Zadanie 5
    public boolean czyPodzielnaPrzez3i5(int liczba) {
        return liczba % 3 == 0 && liczba % 5 == 0;
    }

// Zadanie 6
    public double doPotegiTrzeciej(double liczba) {
        return Math.pow(liczba, 3);
    }

// Zadanie 7
    public double pierwiastekKwadratowy(double liczba) {
        return Math.sqrt(liczba);
    }

// Zadanie 8
    public boolean czyTrojkatProstokatny(double a, double b, double c) {
        double a2 = a * a;
        double b2 = b * b;
        double c2 = c * c;

        return (a2 + b2 == c2) || (a2 + c2 == b2) || (b2 + c2 == a2);
    }

// Zadanie 9
    public char ostatniZnak(String teksty) {
        return teksty.charAt(teksty.length() - 1);
    }

// Zadanie 10
    public boolean czyPalindrom(String tekst) {
        String czysty = tekst.toLowerCase();
        String odwrocony = new StringBuilder(czysty).reverse().toString();
        return czysty.equals(odwrocony);
    }

// Zadanie 11
    public int sumaTablicy(int[] tablica) {
        int suma = 0;
        for (int liczba : tablica) {
            suma += liczba;
        }
        return suma;
    }

// Zadanie 12
    public int zliczWystapienia(String tekst, char znak) {
        int licznik = 0;
        for (int i = 0; i < tekst.length(); i++) {
            if (tekst.charAt(i) == znak) {
                licznik++;
            }
        }
        return licznik;
    }