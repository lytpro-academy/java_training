package codingPrinciples.solid.isp;

/**
Printer class implementing the Printable interface
*/
 class Printer implements Printable {
    @Override
    public void print() {
        System.out.println("Printing document...");
    }
}

