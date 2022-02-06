public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int mass = 75;    // масса тела
        int height = 180; // рост
        int result = service.calculate(mass, height);
        System.out.println("Ваш индекс массы тела = " + result);
    }
}