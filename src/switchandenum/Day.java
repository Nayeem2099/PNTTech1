package switchandenum;

public class Day {
    //change the variable to Week (enum)
    public void task (Week day){

        switch (day){
            case MONDAY:
                System.out.println("school");
                break;
            case TUESDAY:
                System.out.println("review java");
                break;
            case WEDNESDAY:
                System.out.println("do codelabs");
                break;
            case THURSDAY:
                System.out.println("do assignment");
                break;
            case FRIDAY:
                System.out.println("do gym");
                break;
            case SATURDAY:
                System.out.println("practice java");
                break;
            case SUNDAY:
                System.out.println("submit assignment");
                break;
          //  default:
            //    System.out.println("invalid day");
        }
    }
}
