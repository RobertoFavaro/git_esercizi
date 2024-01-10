package date1;

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

//Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
//Formatta la data ottenuta in FULL, MEDIUM e SHORT
//Stampa le varie versioni
public class Main {
    public static void main(String[] args) {

//        String stringData = "2002-03-01T13:00:00Z";
//        OffsetDateTime offsetDateTime = OffsetDateTime.parse(stringData, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
//        String stampaLog = String.format(stringData, )

        //metodo 1
        ZonedDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z").toZonedDateTime();

        String dataFull = data.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL));
        System.out.println("data intera: "+dataFull);
        String dataMedium = data.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        System.out.println("data media: "+dataMedium);
        String dataShort = data.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));
        System.out.println("data corta: "+dataShort);

    }
}
