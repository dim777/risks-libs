package ru.xegex.risks.libs.model.customer;

import ru.xegex.risks.libs.ex.quality.QualityConvertionEx;

/**
 * Created by rb052775 on 30.09.2017.
 */
public interface Customer {
    FinState getFinState() throws QualityConvertionEx;
}
