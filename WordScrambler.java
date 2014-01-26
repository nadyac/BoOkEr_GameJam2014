/**
* WordScrambler class - executes the word scrambler 
*
*/

import java.util.*;
import java.io.*;

public class WordScrambler{


	public static void main(String[] args){

	 String[] words1 = new String [30];
	 String[] words2 = new String [30];
	 int i,r;
	 File file1 = new File("words1.txt");

		try{ 
			Scanner scan = new Scanner(file1);
			scan.useDelimiter("\t");
			i=0;

			while(scan.hasNext()){
				words1[i] = scan.next();
				System.out.println(words1[i] + " ");
				i++;
			}
		}catch(IOException e){
			System.out.println("File Not Found!");
		}
	}
}