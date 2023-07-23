import java.math.BigDecimal;
import java.math.RoundingMode;

public class Employee {
    private String name;
    private BigDecimal salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, BigDecimal salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public BigDecimal tax() {
        if (salary.compareTo(new BigDecimal(1000)) < 0) {
            return BigDecimal.ZERO;
        } else {
            return salary.multiply(new BigDecimal(0.03)).setScale(0, RoundingMode.HALF_UP);
        }
    }

    public int bonus() {
        if (workHours > 40) {
            return (30 * (workHours - 40));
        } else {
            return 0;
        }
    }

    public BigDecimal raiseSalary() {
        int totalYears = 2021 - hireYear;
        if (totalYears < 10) {
            this.salary = salary.add(salary.multiply(new BigDecimal(0.05))).setScale(0, RoundingMode.HALF_UP);
        } else if (totalYears < 20){
            this.salary = salary.add(salary.multiply(new BigDecimal(0.1))).setScale(0, RoundingMode.HALF_UP);
        } else {
            this.salary = salary.add(salary.multiply(new BigDecimal(0.15))).setScale(0, RoundingMode.HALF_UP);
        }
        return salary;
    }

    @Override
    public String toString() {
        return  "Name = " + name +
                "\nSalary = " + salary +
                "\nWork Hours = " + workHours +
                "\nHire Year = " + hireYear +
                "\nTax = " this.tax()
                +"\nBonus = " this.bonus()
                + "\nTotal Salary = " this.raiseSalary();
    }
}
