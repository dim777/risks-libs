package ru.xegex.risks.libs.utils;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import ru.xegex.risks.libs.ex.convertion.ConvertionEx;

/**
 * Created by rb052775 on 22.08.2017.
 */
public abstract class DateTimeUtils {
    public static LocalDateTime convertFromAs400Format(double as400dt) throws ConvertionEx{
        String dateTimeStr = String.valueOf(as400dt).split("\\.")[0];
        int len = dateTimeStr.length();

        if (dateTimeStr.equals("9999999")) return LocalDateTime.parse("2999-12-30");
        else if (len == 7 && dateTimeStr.substring(0,1).equals("1")){
            return in6DFormat(dateTimeStr.substring(1,7));
        }
        else if (len == 7){
            throw new ConvertionEx("Doesn't plan to implement centuries other than 20 and 21");
        }
        else if (len == 6){
            return in6DFormat(dateTimeStr);
        }
        else throw new ConvertionEx("Couldn't match source format");
    }

    public static double convert2As400Format(LocalDateTime localDateTime) throws ConvertionEx{
        if(localDateTime.getYear() >= 2000 && localDateTime.getYear() < 2100){
            return Double.parseDouble(
                    new StringBuilder()
                            .append(1)
                            .append(to6DFormat(localDateTime))
                            .toString()
            );
        }
        else if(localDateTime.getYear() >= 1900 && localDateTime.getYear() < 2000){
            return Double.parseDouble(to6DFormat(localDateTime));
        }
        else throw new ConvertionEx("Doesn't plan to implement centuries other than 20 and 21");
    }

    public static int differenceInDays(LocalDateTime start, LocalDateTime end){
        return Days.daysBetween(start.toLocalDate(), end.toLocalDate()).getDays();
    }

    private static LocalDateTime in6DFormat(String dateTimeStr){
        return LocalDateTime.parse(dateTimeStr, DateTimeFormat.forPattern("yyMMdd"));
    }

    private static String to6DFormat(LocalDateTime localDateTime){
        return localDateTime.toString("yyMMdd");
    }
}
