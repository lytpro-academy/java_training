package codingPrinciples.solid.isp;

/**
 * Main class to demonstrate Interface Segregation Principle (ISP)
 * Explanation:
 * •	In this example, we have separate interfaces Printable, Scannable, and Faxable, each representing a single responsibility related to printing, scanning, and faxing, respectively.
 * •	We have classes Printer, Scanner, and FaxMachine, each implementing one of the interfaces. These classes are segregated, and clients can depend only on the interfaces they need, adhering to the Interface Segregation Principle (ISP).
 * •	The MultiFunctionDevice class implements both Scannable and Faxable interfaces, but it's not forced to implement methods it doesn't need, thanks to the segregation of interfaces. Clients that use MultiFunctionDevice can only depend on the Scannable and Faxable methods they require.
 * •	The ISPExample class demonstrates how clients can use different devices without being forced to depend on unnecessary methods. This ensures a clean and flexible design, following the Interface Segregation Principle.
 */
public class ISPExample {
    public static void main(String[] args) {
        Printable printer = new Printer();
        printer.print();  // Printer only performs printing

        Scannable scanner = new Scanner();
        scanner.scan();   // Scanner only performs scanning

        Faxable faxMachine = new FaxMachine();
        faxMachine.fax(); // FaxMachine only performs faxing

        // MultiFunctionDevice can perform scanning and faxing
        MultiFunctionDevice multiFunctionDevice = new MultiFunctionDevice();
        multiFunctionDevice.scan();
        multiFunctionDevice.fax();
    }
}
