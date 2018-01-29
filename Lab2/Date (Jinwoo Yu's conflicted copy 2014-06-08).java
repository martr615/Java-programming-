// ===================================================================
// skapad: 2006-01-24 / martr615, jinyu385
// ändrad: 2012-01-19 /
// Klass: MT1B
// ===================================================================

public class Date implements Comparable<Date>
{
    // instansvariabler

    private int y, m, d;
    private static boolean formatval = true; //klassvariabel
    public int nextYear, nextMonth, nextDay, prevYear, prevMonth, prevDay, mon;

    // konstruktorer

    public Date()
    {
        this(0, 0, 0);
    }

    public Date(int theYear, int theMonth, int theDay)
    {
        setDate(theYear, theMonth, theDay);
    }

    // instansmetoder

    public void setDate(int theYear, int theMonth, int theDay)
    {
        y = (theYear > 0) ? theYear : 0;
        m  = (theMonth > 0 && theMonth <= 12) ? theMonth : 0;
        d  = (theDay > 0 && theDay <= 31) ? theDay : 0;
    }

    public int getYear()
    {
        return y;
    }

    public int getMonth()
    {
        return m;
    }

    public int getDay()
    {
        return d;
    }


    public void nextDate()
    {
        if (d < mon)
        {
            nextDay = d + 1;
            nextMonth = m;
            nextYear = y;
        }
        else if (m < 12)
        {
            nextDay = 1;
            nextMonth = m + 1;
            nextYear = y;

        }
        else
        {
        	nextMonth = 1;
            nextYear = y + 1;
            nextDay = 1;
        }
    }

   public void prevDate()
    {
        if (d <= mon && d > 1)
        {
           prevDay = d -1;
           prevYear = y;
           prevMonth = m;
        }
        else if (d <= 1 && m > 1)
        {
            prevMonth = m - 1;

            switch(prevMonth) 	//vi hade monthDays(prevMonth); men det funkade inte inte så vi var tvungna
			{					//att kopiera in hela "monthDays" switch-satsen. Nu får vi korrekt svar
			case 2:				//dock så är koden inte den allra vackraste att beskåda.
				mon = 28;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				mon = 30;
				break;
			default:
				mon = 31;
				break;
			}

            prevDay = mon;     //amount of days in the previous month
            prevYear = y;
        }
        else
        {
      		prevDay = 31;
            prevMonth = 12;
            prevYear = y - 1;
        }
    }


	//klassmetod för den har static i sitt namn.
	public static void setFormat(int theFormat) //den ska bestämma om US eller SE och skicka till toString
	{
			if (theFormat == 1)
			{
				formatval = true;
			}
			else
			{
				formatval = false;
			}
	}

	public String toString()
	{
		if (formatval)
		{
				return y + "-" +
			    (m < 10 ? "0" : "") + m + "-" +
			    (d < 10 ? "0" : "") + d;
		}
		else
		{
				return (m < 10 ? "0" : "") + m + "/" +
		   		(d < 10 ? "0" : "") + d + "/" + y;
		}
	}

	//om det är 30 eller 31 dagar.
	public void monthDays(int month)
	{
		switch(month) //hade getMonth() inne i switch
		{
			case 2:
				mon = 28;
				break;          //måste ha breaks annars blir det helt knasigt
			case 4:
			case 6:
			case 9:
			case 11:
				mon = 30;
				break;
			default:
				mon = 31;
				break;
		}
	}


    public int compareTo(Date t)
    {
        if (y <  t.y ||
            y == t.y && m <  t.m ||
            y == t.y && m == t.m && d < t.d)
        {
            return -1;
        }

	if (y >  t.y ||
            y == t.y && m >  t.m ||
            y == t.y && m == t.m && d > t.d)
        {
            return +1;
        }

	return 0;
    }
}
