public class SyntaxDrills {
    public static void main(String[] args) {
        System.setOut(new java.io.PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));

        // ==========================================
        // 1. Identifier Validation
        // ==========================================
        // Правильні ідентифікатори:
        int userAge = 20;
        String _variableName = "valid";
        double $accountBalance = 99.9;

        // Неправильні ідентифікатори (закоментовані):
        // int 1stNumber = 10;     // Помилка: ідентифікатор не може починатися з цифри
        // int class = 5;          // Помилка: 'class' є зарезервованим ключовим словом
        // int user-score = 100;   // Помилка: дефіс '-' інтерпретується як оператор віднімання


        // ==========================================
        // 2. Case Sensitivity
        // ==========================================
        int score = 10;
        int Score = 20;
        int SCORE = 30;

        System.out.println("2. Case Sensitivity:");
        System.out.println("score: " + score + ", Score: " + Score + ", SCORE: " + SCORE);


        // ==========================================
        // 3. The Constant
        // ==========================================
        final int MAX_LIMIT = 100;
        // MAX_LIMIT = 200; // Помилка компілятора: не можна повторно присвоїти значення змінній з модифікатором 'final'


        // ==========================================
        // 4. Floating Point Suffixes
        // ==========================================
        // float f = 10.5; // Помилка: літерал із плаваючою крапкою за замовчуванням має тип double (8 байт), 
                           // який не можна неявно зберегти у float (4 байти) без втрати точності.
        float f = 10.5f;   // Виправлення: додано суфікс 'f'
        System.out.println("\n4. Float: " + f);


        // ==========================================
        // 5. String vs Char
        // ==========================================
        char c = 'A';    
        String s = "A";
        // c = s; // Помилка: невідповідність типів; String — це посилальний тип (об'єкт), а char — примітивний (2 байти)
        // s = c; // Помилка: char не можна напряму записати в змінну String


        // ==========================================
        // 6. Integer Truncation
        // ==========================================
        int a = 10;
        int b = 3;
        double divResult = a / b;
        // Пояснення: Операція 'a / b' виконує цілочисельне ділення (10 / 3 = 3), 
        // дробова частина відкидається ще до присвоєння. Лише після цього число 3 розширюється до 3.0.
        System.out.println("\n6. Integer Truncation: " + divResult);


        // ==========================================
        // 7. Implicit Widening (Неявне розширення)
        // ==========================================
        byte byteVal = 42;
        long longVal = byteVal; // Безпечне автоматичне приведення з меншого типу (1 байт) до більшого (8 байт)
        System.out.println("\n7. Widening (byte to long): " + longVal);


        // ==========================================
        // 8. Explicit Narrowing (Явне звуження)
        // ==========================================
        double d = 9.99;
        int narrowedInt = (int) d; // Дробова частина відсікається (truncation), округлення догори НЕ відбувається
        System.out.println("\n8. Narrowing (double 9.99 to int): " + narrowedInt);


        // ==========================================
        // 9. The Modulus Logic
        // ==========================================
        int number = 157;
        int remainder = number % 2;
        System.out.println("\n9. Modulus logic: 157 % 2 = " + remainder + " (Число " + (remainder == 0 ? "парне" : "непарне") + ")");


        // ==========================================
        // 10. Escape Formatting
        // ==========================================
        System.out.println("\n10. 3x3 Grid:\n" + "1\t2\t3\n4\t5\t6\n7\t8\t9");


        // ==========================================
        // 11. Array Bounds
        // ==========================================
        int[] numbers = new int[3]; // Допустимі індекси: 0, 1, 2
        // numbers[3] = 99; // Помилка під час виконання: ArrayIndexOutOfBoundsException (вихід за межі масиву)


        // ==========================================
        // 12. Array Shortcut
        // ==========================================
        int[] favoriteNumbers = {7, 13, 21, 42, 99};
        System.out.println("\n12. Array Shortcut:");
        System.out.println("First element: " + favoriteNumbers[0]);
        System.out.println("Last element: " + favoriteNumbers[favoriteNumbers.length - 1]);
    }
}