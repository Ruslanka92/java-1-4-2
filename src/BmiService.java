public class BmiService {
    public double calculate(int bodyWeightInKilograms, double heightInMeters) {
        double bodyMassIndex;
        bodyMassIndex = bodyWeightInKilograms / (heightInMeters * heightInMeters);
        return bodyMassIndex;
    }
}
