public class BmiService {
    public int calculate(int mass, int height) {
        return mass * 10_000 / (height * height);
    }
}