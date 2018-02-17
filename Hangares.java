import java.util.Arrays;
import java.util.Scanner;

public class Hangares {
    public static void main(String[] args) {
	Scanner stdin = new Scanner(System.in);
	boolean shouldAsk = true; 
	int numHangares = 0;
	int[] hangares;
	int numNaves;
	int[] naves;

	while(shouldAsk){
	    int entrada = stdin.nextInt();
	    if(entrada == 0) {
		shouldAsk = false;
	    } else {
		numHangares = entrada;
		hangares = new int[numHangares];
		for(int i = 0; i < numHangares; i++) {
		    hangares[i] = stdin.nextInt();
		}
		numNaves = stdin.nextInt();
		naves = new int[numNaves];
		for(int i = 0; i < numNaves; i++) {
		    naves[i] = stdin.nextInt();
		}
		
		for(int i = 0; i < numNaves; i++) {
		    sortHangares(hangares);
		    int nave = naves[i];
		    aparcaNave(nave, hangares);
		}

		System.out.println(checkHangares(hangares));
	    }
	}
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
    
