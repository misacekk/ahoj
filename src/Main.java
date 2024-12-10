import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Fein fein = new Fein();
        fein.nacitani();

        Drippy drippy = new Drippy();
        System.out.println("Napiš slovo.");
        String slovicko = sc.nextLine();
        drippy.slovo(slovicko);

        Cislo cislo = new Cislo();
        cislo.cisla(3);

        Nasobky nasobky = new Nasobky();
        nasobky.petka();

        Nejvetsi nejvetsi = new Nejvetsi();
        System.out.println("Napiš tři čísla");
        nejvetsi.tri();
    }
}