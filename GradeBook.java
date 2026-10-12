public class GradeBook {
    // 1. Змінні класу (State)
    private String studentName;
    private int assignmentScore; // 0-100
    private int examScore;       // 0-100
    private double finalGrade;

    // 2. Конструктор (Initialization)
    public GradeBook(String name, int aScore, int eScore) {
        this.studentName = name;
        this.assignmentScore = aScore;
        this.examScore = eScore;
    }

    // 3. Методи (Behavior)
    
    // Розрахунок підсумкової оцінки (40% завдання, 60% іспит)
    public void calculateResult() {
        // Явне приведення типів (explicit casting) до double гарантує точність ділення
        this.finalGrade = ((double) this.assignmentScore * 0.40) + ((double) this.examScore * 0.60);
    }

    // Друк звіту з використанням Escape-символів (\n для нового рядка)
    public void displaySummary() {
        System.out.println("Name: " + this.studentName + "\n" +
                           "Raw Scores: " + this.assignmentScore + " | " + this.examScore + "\n" +
                           "Final Weighted Grade: " + this.finalGrade + "%");
    }

    // 4. Точка входу (Entry Point)
    public static void main(String[] args) {
        // Створення екземпляра для студента Alex
        GradeBook student = new GradeBook("Alex", 85, 92);

        // Виклик розрахунку та виводу
        student.calculateResult();
        student.displaySummary();
    }
}