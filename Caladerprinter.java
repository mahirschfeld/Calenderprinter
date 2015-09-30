public class Caladerprinter
{
    public static void main (String[] args) {
    int x = 1;
    String z = " - WEEKEND";
    while (x<=30)
    {
    if (x == 5 ||x == 6 ||x == 12 ||x == 13 ||x == 19 ||x == 20 ||x == 26 ||x == 27)
    {
    System.out.println ("September " + x + z);
    x++;
    }
    else if (x == 7)
    {
    System.out.println ("September " + x + " - NO SCHOOL (LABOR DAY)");
    x++;
    }
    else if (x == 25)
    {
    System.out.println("September " + x + "END OF MARKING PERIOD");
    x++;
    }
    else
    {
    System.out.println("September " + x);
    x++;
    }
    }
}
}