void main() {
    //zadanie 1
    System.out.println("Ania");
    System.out.println("Bartek");
    System.out.println("Kasia");

    //zadanie 2
    String imie = "Eryk";
    int rokUrodzenia = 2007;
    double liczba = 0.66;

    //zadanie 3
    System.out.println("Mam na imię " + imie + ", mam " + (2026 - rokUrodzenia) + " lat i będę pisać maturę za " + liczba + " roku.");

    //zadanie 4
    Scanner sc = new Scanner(System.in);
    System.out.println("Podaj ile jest stopni celsjusza: ");
    int stopnie = sc.nextInt();
    System.out.println("Jest " + stopnie + " stopni celsjusza, czyli " + (1.8 * stopnie + 32.0) + " stopni fahrenheita.");

    //zadanie 5
    Scanner sc1 = new Scanner(System.in);
    System.out.println("Podaj pierwszy bok trójkąta: ");
    int bok1 = sc1.nextInt();
    Scanner sc2 = new Scanner(System.in);
    System.out.println("Podaj drugi bok trójkąta: ");
    int bok2 = sc2.nextInt();
    Scanner sc3 = new Scanner(System.in);
    System.out.println("Podaj trzeci bok trójkąta: ");
    int bok3 = sc3.nextInt();

    System.out.println("Obwód trójkąta wynosi: " + (bok1 + bok2 + bok3) + "cm");


    //zadanie 6
    Scanner sc4 = new Scanner(System.in);
    System.out.println("Podaj pierwsze słowo: ");
    String slowo1 = sc4.next();
    Scanner sc5 = new Scanner(System.in);
    System.out.println("Podaj drugie słowo: ");
    String slowo2 = sc5.next();
    Scanner sc6 = new Scanner(System.in);
    System.out.println("Podaj trzecie słowo: ");
    String slowo3 = sc6.next();

    System.out.println(slowo3 + ", " + slowo2 + ", " + slowo1);


    //zadanie 7
    Scanner sc7 = new Scanner(System.in);
    System.out.println("Podaj słowo: ");
    String slowo4 = sc7.next();
    System.out.println(slowo4.length());


    //zadanie 8
    double x = 5;
    double y = 2;
    double wynik = x / y;
    System.out.println(wynik);


    //zadanie 9
    Scanner sc8 = new Scanner(System.in);
    System.out.println("Podaj słowo: ");
    String slowo5 = sc8.next();
    System.out.println(slowo5.toUpperCase());


    //zadanie 10
    Scanner sc9 = new Scanner(System.in);
    System.out.println("Podaj promień koła (liczba całkowita): ");
    int r = sc9.nextInt();
    double pole = r * r * Math.PI;
    System.out.println("Pole koła wynosi: " + pole);




}
