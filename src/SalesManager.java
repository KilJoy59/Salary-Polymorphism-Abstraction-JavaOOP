import java.util.Random;

public class SalesManager extends Company  implements Employee {

    @Override
    public int getMonthSalary() {
        Random random = new Random();
        int fixSalary = 15000 + random.nextInt(30000 - 15000);
        return fixSalary + (getCompanyIncome()*5)/100;
    }

    @Override
    public int getEmployerIncome() {
        Random random = new Random();
        return 50_000 + random.nextInt(100_000 - 50_000);
    }

}
