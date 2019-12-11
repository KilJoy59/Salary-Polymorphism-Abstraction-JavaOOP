import java.util.Random;

public class TopManager extends Company implements Employee{

    @Override
    public int getMonthSalary() {
        Random random = new Random();
        int fixSalary = 30_000 + random.nextInt(40_000 - 20_000);
        if (getCompanyIncome() > 10_000_000) {
            return fixSalary + 30_000;
        }
        return fixSalary;
    }

    @Override
    public int getEmployerIncome() {
        Random random = new Random();
        return 100_000 + random.nextInt(200_000 - 100_000);
    }
}
