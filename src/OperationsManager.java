import java.util.Random;

public class OperationsManager implements Employee {

    @Override
    public int getMonthSalary() {
        Random random = new Random();
        return 20000 + random.nextInt(25000 - 20000);
    }
}
