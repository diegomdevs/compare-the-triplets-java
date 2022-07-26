import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        byte[] a = new byte[3];
        a[0] = (byte) 5;
        a[1] = (byte) 6;
        a[2] = (byte) 7;
        byte[] b = new byte[3];
        b[0] = (byte) 3;
        b[1] = (byte) 6;
        b[2] = (byte) 10;
        System.out.println(compareTriplets(a, b));
    }
    public static String compareTriplets(byte[] a, byte[] b) {
        byte aPoints = 0, bPoints = 0;
        for (int i = 0; i < 3; i++) {
            if (a[i] == b[i]) {
                continue;
            } else {
                if(a[i] > b[i]) aPoints++;
                else bPoints++;
            }
        }
        return aPoints + " " + bPoints;
    }
}
