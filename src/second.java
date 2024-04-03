public class second {
    public static void main(String[] args) {
        int n = 763;

        int digit1 = n / 100;
        int digit2 = (n / 10) % 10;
        int digit3 = n % 10;

        int maxDigit = Math.max(Math.max(digit1, digit2), digit3);

        // Виведення результату
        System.out.println("Найбільша цифра заданого числа " + n + " : " + maxDigit);
    }
}
