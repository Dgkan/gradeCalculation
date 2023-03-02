import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner inp = new Scanner(System.in);
        System.out.print("Matematik notunuz: ");
        mat = inp.nextInt();

        System.out.print("fizik notunuz: ");
        fizik = inp.nextInt();

        System.out.print("kimya notunuz: ");
        kimya = inp.nextInt();

        System.out.print("turkce notunuz: ");
        turkce = inp.nextInt();

        System.out.print("tarih notunuz: ");
        tarih = inp.nextInt();

        System.out.print("muzik notunuz: ");
        muzik  = inp.nextInt();

        int toplam = mat + fizik + kimya + turkce + tarih + muzik;
        double ortalama = toplam / 6;

        String sonuc = ortalama >= 60 ? "Geçti" : "Kaldı";
        System.out.println("Ortalamanız: " + ortalama);
        System.out.println(sonuc);

    }
}
