import java.util.Arrays;

public class Hangares {
    public static void main(String[] args) {
	int numHangares = 2;
	int[] hangares = {12, 20};
	int numNaves = 3;
	int[] naves = {10, 11, 10};

	sortHangares(hangares);
	aparcaNave(naves[0], hangares);

	System.out.println(Arrays.toString(hangares));

	sortHangares(hangares);
	aparcaNave(naves[1], hangares);

	System.out.println(Arrays.toString(hangares));


	sortHangares(hangares);
	aparcaNave(naves[2], hangares);

	System.out.println(Arrays.toString(hangares));


	for(int i = 0; i < hangares.length; i++) {
	    if(hangares[i] < 0) {
		System.out.println("NO");
		break;
	    } 
	}
	
    }

    public static void sortHangares(int[] hangares) {
	Arrays.sort(hangares);
    }

    public static void aparcaNave(int nave, int[] hangares) {
	hangares[hangares.length - 1] -= nave;
    }
}
    
