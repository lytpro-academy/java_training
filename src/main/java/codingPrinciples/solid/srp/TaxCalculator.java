package codingPrinciples.solid.srp;
/**
TaxCalculator class responsible for calculating tax, adhering to SRP by having a single responsibility
*/
 class TaxCalculator {
    // Method to calculate tax, adhering to SRP by only handling tax calculation logic
    public double calculateTax(double salary) {
        // Tax calculation logic
        return salary * 0.2; // Assuming a fixed tax rate of 20%
    }
}
