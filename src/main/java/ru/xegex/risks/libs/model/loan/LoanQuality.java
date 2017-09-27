package ru.xegex.risks.libs.model.loan;

/**
 * Created by rb052775 on 27.09.2017.
 */
public enum LoanQuality {
    BAD(180, 5),
    MID(180, 30),
    GOOD(180, 180);

    private int lastDays;
    private int moreThanDays;

    private LoanQuality(int lastDays, int moreThanDays) {
        this.lastDays = lastDays;
        this.moreThanDays = moreThanDays;
    }

    public int getLastDays(){
        return lastDays;
    }
    public int getMoreThanDays(){
        return moreThanDays;
    }
}
