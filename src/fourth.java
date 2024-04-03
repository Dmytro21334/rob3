public class fourth {
    public static void main(String[] args) {
        String choice = "Так";
        switch (choice) {
            case "Так":
            case "ОК":
            case "Yes":
            case "Y":
            case "+":
            case "Ok":
                System.out.println("Я погоджуюсь!");
                break;
            case "Ні":
            case "NO":
            case "N":
            case "-":
            case "No":
                System.out.println("Я відмовляюсь!");
                break;
            default:
                System.out.println("Невідома опція.");
        }

    }
}
}
