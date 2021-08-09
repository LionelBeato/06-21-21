public class EnumTest {

    Day day;

    public EnumTest(Day day) {
        this.day = day;
    }

    public void weekendOrWeekday() {
        switch (day) {
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's a weekend");
                break;
            default:
                System.out.println("It's a weekday!");
                break;
        }
    }


}
