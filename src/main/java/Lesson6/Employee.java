package Lesson6;

import java.math.BigDecimal;

abstract class Employee {
    private String name;
    private BigDecimal salary;
    protected BigDecimal bonus;

    public String getName() {return name;}
    public BigDecimal getSalary() {return salary;}
    public Employee(String name, BigDecimal salary) {
        this.name = name;
        this.salary = salary;
    }
    public BigDecimal getBonus(){return bonus;}
    abstract void setBonus(BigDecimal bonus);

    public BigDecimal toPay() {
        if (bonus == null || bonus.intValue() < 0) throw new IllegalArgumentException();
        return salary.add(bonus);
    }
}
