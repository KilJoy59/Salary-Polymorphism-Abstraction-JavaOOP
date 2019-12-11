
public class Test {
    public static void main(String[] args) {

        Company company = new Company();
        for (int i = 0; i <270 ; i++) {
            double random = Math.random();
            if (random > 0.3) {
                company.hireEmployer(new SalesManager());
            } else if (random >= 0.3 && random <= 0.6) {
                company.hireEmployer(new TopManager());
            }else {
                company.hireEmployer(new OperationsManager());
            }
        }


        System.out.println("Количество сотрудников = " + company.employers.size());

        System.out.println("Доход компании " + company.getCompanyIncome());

        company.layOfEmployer(170);

        System.out.println("Количество сотрудников = " + company.employers.size());
        System.out.println("Доход компании " + company.getCompanyIncome());

        company.getTopSalaryStaff(10);
        System.out.println();
        company.getLowestSalaryStaff(10);
    }

}
