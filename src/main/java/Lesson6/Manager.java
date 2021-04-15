package Lesson6;

import java.math.BigDecimal;

public class Manager extends Employee{
    private int quantity;

    public Manager(String name, BigDecimal salary, int quantity) {
        super(name, salary);
        this.quantity = quantity;
    }

    public int getQuantity() {return quantity;}

    @Override
    public void setBonus(BigDecimal bonus) {
        if (bonus == null || bonus.intValue() < 0) throw new IllegalArgumentException();
        if (this.quantity > 150) {
            this.bonus = bonus.add(BigDecimal.valueOf(1000));
        } else if (this.quantity > 100) {
            this.bonus = bonus.add(BigDecimal.valueOf(500));
        } else this.bonus = bonus;
    }
}
