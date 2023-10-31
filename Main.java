import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InstrumentFactory factory = new InstrumentFactory();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Select the first tool (guitar или piano):");
        String instrumentType1 = scanner.nextLine().toLowerCase();
        Instrument instrument1 = factory.createInstrument(instrumentType1);

        if (instrument1 != null) {
            instrument1.play();
        } else {
            System.out.println("\n" + "Wrong choice of first tool.");
        }


        System.out.println("Select second tool (guitar или piano):");
        String instrumentType2 = scanner.nextLine().toLowerCase();
        Instrument instrument2 = factory.createInstrument(instrumentType2);

        if (instrument2 != null) {
            instrument2.play();
        } else {
            System.out.println("Wrong choice of second tool.");
        }

        scanner.close();
    }
}