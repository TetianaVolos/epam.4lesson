package Lesson6;

import java.math.BigDecimal;

public class SalesPerson extends Employee{
    private int percent;
    public SalesPerson(String name, BigDecimal salary, int percent){
      super(name, salary);
      this.percent = percent;
    }

    public void setPercent(int percent) {this.percent = percent;}

    @Override
    public void setBonus(BigDecimal bonus) {
        if (bonus == null || bonus.intValue() < 0) throw new IllegalArgumentException();
        if (this.percent > 200) {
            this.bonus = bonus.multiply(BigDecimal.valueOf(3));
        } else if (this.percent > 100) {
            this.bonus = bonus.multiply(BigDecimal.valueOf(2));
        } else this.bonus = bonus;
    }
}
