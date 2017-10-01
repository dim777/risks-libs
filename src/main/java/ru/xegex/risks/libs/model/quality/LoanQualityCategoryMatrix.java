package ru.xegex.risks.libs.model.quality;

/**
 * Created by rb052775 on 30.09.2017.
 */
public abstract class LoanQualityCategoryMatrix {
    protected static final LoanQualityCategory[][] loanQualityCategoryMatrix = new LoanQualityCategory[][]{
            {LoanQualityCategory.ONE, LoanQualityCategory.TWO, LoanQualityCategory.THREE},
            {LoanQualityCategory.TWO, LoanQualityCategory.THREE, LoanQualityCategory.FOUR},
            {LoanQualityCategory.THREE, LoanQualityCategory.FOUR, LoanQualityCategory.FIVE}
    };
}
