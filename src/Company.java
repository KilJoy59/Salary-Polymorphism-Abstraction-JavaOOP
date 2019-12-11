import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Company {

    private int companyIncome;

    private void setCompanyIncome(int companyIncome) {
        this.companyIncome = companyIncome;
    }

    public int getCompanyIncome() {
        for (Employee e : employers
             ) {
            companyIncome += e.getEmployerIncome();
        }
        return companyIncome;
    }

    List<Employee> employers = new ArrayList<>();

    public void hireEmployer( Employee employee) {
        employers.add(employee);
    }


    public void layOfEmployer ( int count) {
        for (int i = 0; i < count; i++) {
            int randomEmp = (int) (Math.random() * employers.size());
            employers.remove(randomEmp);
            setCompanyIncome(0);
        }
    }

    public void getTopSalaryStaff(int count) {
        List<Integer> list = new ArrayList<>();
        for (Employee e: employers
             ) {
            list.add(e.getMonthSalary());
        }
        Collections.sort(list,Collections.reverseOrder());
        for (int i = 0; i < count ; i++) {
            System.out.println("Сотрудник получает " + list.get(i));
        }
    }

    public void getLowestSalaryStaff(int count) {
        List<Integer> list = new ArrayList<>();
        for (Employee e: employers
        ) {
            list.add(e.getMonthSalary());
        }
        Collections.sort(list);
        for (int i = 0; i < count ; i++) {
            System.out.println("Сотрудник получает " + list.get(i));
        }
    }
}
