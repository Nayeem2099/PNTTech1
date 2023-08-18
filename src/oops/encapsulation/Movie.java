package oops.encapsulation;

public class Movie {


    //set the rating for a movie (P,PG,PG13,R)
    private String rating;
    private int duration;

    public int getDuration() {
        return duration;
    }


    //this keyword makes reference to the global variable
    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getRating() {
        if (rating != "P" && rating != "PG" && rating != "PG-13" && rating != "R") {
            rating = "NR";
            return rating;
        } else {
            return rating;
        }
    }
        public void setRating (String rating){
            this.rating = rating;
        }



}
