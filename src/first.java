public class first {
    public static void main(String[] args) {
        int n = 120;
        int lowerBound = 50;
        int upperBound = 100;

        if (n > lowerBound && n < upperBound) {
            System.out.println("Число " + n + " міститься в проміжку (" + lowerBound + "; " + upperBound + ")");
        } else {
            System.out.println("Число " + n + " не міститься в проміжку (" + lowerBound + "; " + upperBound + ")");
        }
    }
}
