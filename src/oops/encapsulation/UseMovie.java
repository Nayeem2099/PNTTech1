package oops.encapsulation;

public class UseMovie {

    public static void main(String[] args) {

        Movie lordOfRings = new Movie();

        lordOfRings.setRating("R");
        System.out.println(lordOfRings.getRating());

        lordOfRings.setDuration(120);
        System.out.println(lordOfRings.getDuration());
    }
}
