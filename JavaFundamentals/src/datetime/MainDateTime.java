package datetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class MainDateTime {
    public static void main(String[] args) {
        // LocalDate, LocalTime, LocalDateTime, Instant.

        // LocalDate , LocalTime, LocalDateTime -> lucreaza cu timezone-ul curent (GMT+3 la noi)
        // Instant -> se lucreaza by default cu GMT

        LocalTime lt = LocalTime.now();
        LocalTime lt2 = LocalTime.now();
        System.out.println(lt);
        System.out.println(lt2);
        // H:M:SS.NS
        // HH:MM:SS.NS
        System.out.println(lt.getNano());
        System.out.println(lt.getHour());
        System.out.println(lt.getMinute());
        System.out.println(lt.getSecond());
        System.out.println(lt.compareTo(lt2));
        System.out.println(lt.isBefore(lt2));

        System.out.println(lt.minusNanos(5));
        System.out.println(lt.minus(5, ChronoUnit.HOURS));
        System.out.println(lt.plusNanos(5));
        System.out.println(LocalTime.of(18, 17));
        System.out.println(LocalTime.ofSecondOfDay(12));
        LocalTime x = LocalTime.now();
        x = x.withSecond(2).withMinute(2).withHour(2).withNano(2);
        System.out.println(x);

        //--------------
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.toEpochDay());
        System.out.println((19639 - 300)/53);
        System.out.println(LocalDate.now().getDayOfWeek());
        System.out.println(LocalDate.now().getMonthValue());
        System.out.println(LocalDate.now().withYear(2000));

        // YYYY-MM-DD
        // YYYY-MMM-DD 2000-OCT-09

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        System.out.println(LocalDateTime.of(2020, 12, 15, 19, 18, 12));

        Instant inst = Instant.now();
        System.out.println(inst);
        long epoch = inst.toEpochMilli();
        System.out.println(epoch);
        System.out.println(Instant.ofEpochMilli(epoch));
    }
}
