package modifiersnonaccess;

public class UseDriveWay {

    public static void main(String[] args) {

        DriveWay myDrive = new DriveWay();

        myDrive.setLength(50); //reassigning value of length through setter
        System.out.println("My driveway is: " + myDrive.getLength());

        DriveWay neighborDriveway = new DriveWay();
        neighborDriveway.setLength(20);
        System.out.println("My neighbor's driveway is: " + neighborDriveway.getLength());

        System.out.println("My driveway is: " + myDrive.getLength());







    }
}
