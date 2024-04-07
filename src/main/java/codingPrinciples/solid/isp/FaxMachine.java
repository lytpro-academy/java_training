package codingPrinciples.solid.isp;

/**
FaxMachine class implementing the Faxable interface
 */
 class FaxMachine implements Faxable {
    @Override
    public void fax() {
        System.out.println("Faxing document...");
    }
}

