/**
* Topics class - this class determines which topics Jodine will like
* 	it also determines ranks topics by level of interest 1-3 
*	and keeps track of how many times the 
*/

import java.io.*;
import java.util.*;

public class Topics{

	String[] keywords1 = new String[30];


	//check that it can read the input
	public static void main(String[] args){

	 	 String[] words1 = new String [30];
	 	 String[] words2 = new String [30];
	 	 File likefile = new File("likefile.txt");
		 File lovefile = new File("lovefile.txt");
		 File hatefile = new File("hatefile.txt");

		try{ 
			Scanner scan = new Scanner(likefile);
			scan.useDelimiter("\t");
			int i=0;

			while(scan.hasNext()){
				words1[i] = scan.next();
				System.out.println(words1[i] + " ");
				i++;
			}
		}catch(IOException e){
			System.out.println("File Not Found!");
		}
	}

	public boolean keywordmatch(){
		Scanner scan2 = new Scanner(System.in);

		//words2[i]
		return true;


		
	}

}

