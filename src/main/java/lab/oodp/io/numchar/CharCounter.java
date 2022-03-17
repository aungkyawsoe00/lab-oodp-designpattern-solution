package lab.oodp.io.numchar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CharCounter {
	
	int numE = 0;
    int total = 0;
    
    

    public int getNumE() {
		return numE;
	}

	public int getTotal() {
		return total;
	}

	public void start() {

        printNumEsWithFileReader();

    }

    private void printNumEsWithFileReader() {
    	
    	//TODO: read file and count Es and total number of character.
        try (FileReader reader = new FileReader(new File("input1.txt"))) {

            int input;
            while ((input = reader.read()) >= 0) {
                total++;
                char c = (char) input;
                if (c == 'e' || c == 'E') {
                    numE++;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Number of e/E's: " + numE + " out of " + total);
    }

    public static void main(String[] args) {
        new CharCounter().start();
    }

}
