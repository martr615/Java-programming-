// ===================================================================
// skapad: 2006-01-24 / martr615, jinyu385
// ändrad: 2012-01-19 /
// Klass: MT1B
// ===================================================================

public class DateTest
{
    public static void main(String[] args)
    {
        Date d1 = new Date();   //
        Date d2 = new Date();   //

        int SE_FORMAT = 1;
        int US_FORMAT = 0; //svenskt eller amerikanskt format.

        d1.setDate(2011, 5, 1);
        d2.setDate(2011, 3, 1);

        //få antal dagar på månaden
        d1.monthDays(d1.getMonth());
        d2.monthDays(d2.getMonth());

        System.out.println("Time objects t1 and t2 constructed");
        System.out.println("Time set for both objects");
        System.out.println();

        System.out.println("d1.getYear() = " + d1.getYear());
        System.out.println("d1.getMonth()  = " + d1.getMonth());
        System.out.println("d1.getDay()  = " + d1.getDay());
        System.out.println();

        System.out.println("d1.toString() = " + d1);
        System.out.println("d2.toString() = " + d2);
        System.out.println();

        d1.nextDate(); //måste skicka en gång innan så att den har utförts en gång.
        d2.nextDate();
        d1.prevDate();
        d2.prevDate();

		//next day och previous day
		System.out.println("d1.nextDate() = " + d1.nextYear + "-" + d1.nextMonth + "-" + d1.nextDay);
		System.out.println("d2.nextDate() = " + d2.nextYear + "-" + d2.nextMonth + "-" + d2.nextDay);
		System.out.println("d1.prevDate() = " + d1.prevYear + "-" + d1.prevMonth + "-" + d1.prevDay);
		System.out.println("d2.prevDate() = " + d2.prevYear + "-" + d2.prevMonth + "-" + d2.prevDay);
		System.out.println();

        System.out.println("d1.compareTo(d2) = " + d1.compareTo(d2));
        System.out.println("d2.compareTo(d1) = " + d2.compareTo(d1));
        System.out.println("d1.compareTo(d1) = " + d1.compareTo(d1));
        System.out.println();

        //byter format, SE, US
        System.out.println("Date format set to US_FORMAT");
        System.out.println();

		//skickar till vår klassmetod(static)´
		d1.setFormat(US_FORMAT);
		d2.setFormat(US_FORMAT);

        System.out.println("d1.toString() = " + d1);
        System.out.println("d2.toString() = " + d2);
        System.out.println();

    }
}
