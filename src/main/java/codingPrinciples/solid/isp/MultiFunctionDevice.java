package codingPrinciples.solid.isp;

/**
MultiFunctionDevice class implementing both Scannable and Faxable interfaces
*/
 class MultiFunctionDevice implements Scannable, Faxable {
    @Override
    public void scan() {
        System.out.println("Scanning document...");
    }

    @Override
    public void fax() {
        System.out.println("Faxing document...");
    }
}

