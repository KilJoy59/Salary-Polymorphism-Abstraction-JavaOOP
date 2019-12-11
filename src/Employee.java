public interface Employee
{
    int getMonthSalary();

    default int getEmployerIncome() {
        return 0;
    }
}
