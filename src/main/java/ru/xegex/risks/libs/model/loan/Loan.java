package ru.xegex.risks.libs.model.loan;

import org.joda.time.LocalDateTime;
import ru.xegex.risks.libs.ex.convertion.ConvertionEx;
import ru.xegex.risks.libs.model.account.Account;
import ru.xegex.risks.libs.model.customer.Customer;

import java.util.Optional;

/**
 * Created by rb052775 on 22.08.2017.
 */
public interface Loan {
    LocalDateTime getStartDate() throws ConvertionEx;
}
