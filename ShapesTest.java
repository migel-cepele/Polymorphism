package chapter10;

public class ShapesTest {
    public static void main(String[] args) {
        Shapes[] shapes = new Shapes[4];

        Drejtkendeshi d = new Drejtkendeshi(4, 7);
        Katrori k = new Katrori(5);
        Kubi kubi = new Kubi(4);
        Kuboidi kuboidi = new Kuboidi(8, 10, 12);

        shapes[0] = d;
        shapes[1] = k;
        shapes[2] = kubi;
        shapes[3] = kuboidi;

        for(int i = 0; i < shapes.length; i++) {
            System.out.printf("Lloji i objektit %d: %s%n%n", i, shapes[i].lloji());
        }

        System.out.printf("Perimetri/Siperfaqja: %d%nSiperfaqja/Vellimi: %d%n", d.perimetri(), d.siperfaqa());
        System.out.printf("Perimetri/Siperfaqja: %d%nSiperfaqja/Vellimi: %d%n", k.perimetri(), k.siperfaqa());
        System.out.printf("Perimetri/Siperfaqja: %d%nSiperfaqja/Vellimi: %d%n", kubi.siperfaqa(), kubi.vellimi());
        System.out.printf("Perimetri/Siperfaqja: %d%nSiperfaqja/Vellimi: %d%n", kuboidi.siperfaqa(), kuboidi.vellimi());

        for(int i = 0; i < shapes.length; i++) {
            System.out.printf("Klasa e objektit %d: %s%n", i, shapes[i].getClass().getName());
        }
    }
}
