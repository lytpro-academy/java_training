package codingPrinciples.solid.isp;

/**
 * Scanner class implementing the Scannable interface
*/
class Scanner implements Scannable {
    @Override
    public void scan() {
        System.out.println("Scanning document...");
    }
}
