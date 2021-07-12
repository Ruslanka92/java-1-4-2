public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bodyMassIndex = service.calculate(100, 1.85);
        System.out.println(bodyMassIndex);
    }
}