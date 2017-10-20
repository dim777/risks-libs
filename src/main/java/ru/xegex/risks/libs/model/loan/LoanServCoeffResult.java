package ru.xegex.risks.libs.model.loan;

/**
 * Created by rb052775 on 20.10.2017.
 */
public class LoanServCoeffResult{
    private LoanServCoeffType loanServCoeffType;
    private Integer totalDelayDays;
    private Integer calcDelayDays;

    public LoanServCoeffResult(LoanServCoeffType loanServCoeffType, Integer calcDelayDays, Integer totalDelayDays) {
        this.loanServCoeffType = loanServCoeffType;
        this.totalDelayDays = totalDelayDays;
        this.calcDelayDays = calcDelayDays;
    }

    public LoanServCoeffType getLoanServCoeffType() {

        return loanServCoeffType;
    }

    public void setLoanServCoeffType(LoanServCoeffType loanServCoeffType) {
        this.loanServCoeffType = loanServCoeffType;
    }

    public Integer getTotalDelayDays() {
        return totalDelayDays;
    }

    public void setTotalDelayDays(Integer totalDelayDays) {
        this.totalDelayDays = totalDelayDays;
    }

    public Integer getCalcDelayDays() {
        return calcDelayDays;
    }

    public void setCalcDelayDays(Integer calcDelayDays) {
        this.calcDelayDays = calcDelayDays;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LoanServCoeffResult that = (LoanServCoeffResult) o;

        if (loanServCoeffType != that.loanServCoeffType) return false;
        if (totalDelayDays != null ? !totalDelayDays.equals(that.totalDelayDays) : that.totalDelayDays != null)
            return false;
        return calcDelayDays != null ? calcDelayDays.equals(that.calcDelayDays) : that.calcDelayDays == null;
    }

    @Override
    public int hashCode() {
        int result = loanServCoeffType != null ? loanServCoeffType.hashCode() : 0;
        result = 31 * result + (totalDelayDays != null ? totalDelayDays.hashCode() : 0);
        result = 31 * result + (calcDelayDays != null ? calcDelayDays.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "LoanServCoeffResult{" +
                "loanServCoeffType=" + loanServCoeffType +
                ", totalDelayDays=" + totalDelayDays +
                ", calcDelayDays=" + calcDelayDays +
                '}';
    }
}
