package modifiersnonaccess;

public class DriveWay {

    int width;
    static int length; //=50 bc of the setter

    //getter
    public int getLength() {
        return length;
    }
    //setter
    public void setLength(int myLength) {
        length = myLength;
    }

    public void widthOfDriveway(){
        System.out.println("width of the driveway is: " + width);
        System.out.println("length of the driveway is: " + length);

        //static methods can only use static attributes (methods,variables etc)
        //nonstatic methods can use BOTH static and nonstatic attributes.
    }
}

// Static means that the attribute belongs to the class.
// Nonstatic attribute belongs to the object.