package loops;

public class ForLoop {

    public static void main(String[] args) {

        for (int x = 0; x < 50; x++){
            System.out.println(x);
        }

        String[] array = {"ch", "mi", "nyc", "ca", "jc"};
        for (int i = 0; i < 5; i++){
            System.out.println(array[i]);
            if(array[i] == "nyc"){
                break;
            }

        }

        for (int z = 0; z < 50; z++){
            if (z>20 && z<30){
                continue;
            }
            System.out.println(z);
        }

    }
}

//forloops use "i" for some reason as a variable
