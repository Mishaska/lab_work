/**
 * Клас {@code InvestmentTracker} розраховує кінцеву вартість інвестицій
 * за формулою складних відсотків:
 * <p>
 * <b>Total = Principal * (1 + Rate)^Years</b>
 * </p>
 * де:
 * <ul>
 *   <li><b>Principal</b> — початкова сума вкладу;</li>
 *   <li><b>Rate</b> — річна відсоткова ставка у вигляді десяткового дробу (наприклад, 0.05 для 5%);</li>
 *   <li><b>Years</b> — період нарахування у роках.</li>
 * </ul>
 *
 * @author Скрипченко Михайло
 * @version 1.0
 */

public class InvestmentTracker {

    // 1. Поля класу
    private double principal;
    private double interestRate;
    private int years;

    public InvestmentTracker(double principal, double interestRate, int years) {
        this.principal = principal;
        this.interestRate = interestRate;
        this.years = years;
    }

    // 2. Метод обчислення кінцевої суми за формулою
    public double calculateTotal() {
        return this.principal * Math.pow(1.0 + this.interestRate, this.years);
    }

    // 4. Демонстрація роботи програми в main
    public static void main(String[] args) {
        System.setOut(new java.io.PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        double initialInvestment = 1000.0; // $1,000
        double rate = 0.05;                // 5%
        int periodYears = 10;              // 10 років

        InvestmentTracker tracker = new InvestmentTracker(initialInvestment, rate, periodYears);
        double total = tracker.calculateTotal();

        System.out.println("=== Investment Summary ===");
        System.out.printf("Початковий депозит: $%.2f%n", initialInvestment);
        System.out.printf("Відсоткова ставка: %.1f%%%n", rate * 100);
        System.out.printf("Термін інвестування: %d років%n", periodYears);
        System.out.printf("Підсумкова сума: $%.2f%n", total);
    }
}