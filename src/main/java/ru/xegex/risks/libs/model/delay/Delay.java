package ru.xegex.risks.libs.model.delay;

import org.joda.time.LocalDateTime;

/**
 * Created by rb052775 on 26.09.2017.
 */
public interface Delay {
    LocalDateTime getStartDelayDate();
    LocalDateTime getFinishDelayDate();
    DelayType getDelayType();
}
