package no.hvl.dat100.prosjekt.modell;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

import no.hvl.dat100.prosjekt.TODO;

public class KortUtils {

	/**
	 * Sorterer en samling. Rekkefølgen er bestemt av compareTo() i Kort-klassen.
	 * 
	 * @see Kort
	 * 
	 * @param samling
	 * 			samling av kort som skal sorteres. 
	 */
	
	public static void sorter(KortSamling samling) {
		
		// TODO - START
		
		//skal sortere samling med compareTo() fra Kort
		KortSamling kort = samling;
		int[] nyetall = new int[kort.length];
		
		for (int kortNr = 0; kortNr < kort.length; kortNr++) {
			int minPos = 0; 
			for (int posNr = 1; posNr < kort.length; posNr++) {
				minPos = posNr;
			}
			nyeKort[kortNr] = kort[minPos];
			kort[minPos] = Integer.MAX_VALUE;
		}
		kort = nyeKort;
		
		//this.compareTo();
		
	
		// TODO - END
	}
	
	/**
	 * Stokkar en kortsamling. 
	 * 
	 * @param samling
	 * 			samling av kort som skal stokkes. 
	 */
	public static void stokk(KortSamling samling) {
		// TODO - START
		
		
		
		
		
//		for(int i = 0; i < .; i++) {
//			int j = (int)(Math.random() * .);
//			int temp = deck[i];
//			deck[i] = deck[j];
//			deck[j] = temp;
//		}
//		samling = a;
//		ArrayList<Integer> kort = new ArrayList<Integer>();
//		for (int i = 0; i < kort; ++i) {
//			kort.add(i);
//		}
//		ArrayList<Integer> stokkaKort = new ArrayList<Integer>();
//
//        while (kort.size() > 0) {
//            int index = (int) (Math.random() * kort.size());
//            stokkaKort.add(kort.remove(index));
//        }
		
//		int index, temp;
//		Stokking stokking = new Stokking();
//		for (int i = samling.length - 1; i > 0; i--) {
//			index = stokking.nextInt(i + 1);
//			temp = samling[index];
//			samling[index] = samling[i];
//			samling[i] = temp;
//		}

		
		
		
		
		
		// TODO - END
	}
	
}
