import java.util.Arrays;

public class Hangares {
    public static void main(String[] args) {
	int numHangares = 2;
	int[] hangares = {12, 20};
	int numNaves = 3;
	int[] naves = {10, 11, 10};
	
	for(int i = 0; i < numNaves; i++) {
	    sortHangares(hangares);
	    int nave = naves[i];
	    aparcaNave(nave, hangares);
	}

	System.out.println(checkHangares(hangares));
    }

    public static void sortHangares(int[] hangares) {
	Arrays.sort(hangares);
    }

    public static void aparcaNave(int nave, int[] hangares) {
	hangares[hangares.length - 1] -= nave;
    }

    public static String checkHangares(int[] hangares) {
	for(int i = 0; i < hangares.length; i++) {
	    if(hangares[i] < 0) {
		return "NO";
	    } 
	}
	return "SI";
    }
}
    
