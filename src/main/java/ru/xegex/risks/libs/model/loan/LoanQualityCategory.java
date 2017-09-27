package ru.xegex.risks.libs.model.loan;

/**
 * Created by rb052775 on 27.09.2017.
 */
public enum LoanQualityCategory {
    ONE(1,0,0,0),
    TWO(2,0.0100000,1.0000000,20.0000000),
    THREE(3,3.0100000,21.0000000,50.0000000),
    FOUR(4,20.0100000,51.0000000,100.0000000),
    FIVE(5,50.0100000,100.0000000,100.0000000);

    private int id;
    private double min;
    private double nom;
    private double max;

    LoanQualityCategory(int id, double min, double nom, double max) {
        this.id = id;
        this.min = min;
        this.nom = nom;
        this.max = max;
    }

    public int getId() {
        return id;
    }

    public double getMin() {
        return min;
    }

    public double getNom() {
        return nom;
    }

    public double getMax() {
        return max;
    }
}
