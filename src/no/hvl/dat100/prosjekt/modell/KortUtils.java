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
		
		Kort[] nysamling = samling.getAllekort();
		for (int i = 0; i < nysamling.length - 1; i++) {
			Kort v = nysamling[i];
			Kort b = nysamling[i + 1];
			int x = v.compareTo(b);
			if(x == 0) {
				nysamling[i] = v;
				nysamling[i +1] = b;
			}
			if(x < 0) {
				nysamling[i] =v;
				nysamling[i + 1] = v;
			}
			if(x > 0) {
				nysamling[i] = b;
				nysamling[i + 1] = v;
			}
		}
		if (samling.getAntalKort() == 0) {
			samling.setAntall(0);
		}if (samling.getAntalKort() != true) samling.setSamling(nysamling);
		
		//skal sortere samling med compareTo() fra Kort
		
//		for (int i = 0; i < samling.size() - 1; i++) {
//	        for (int k = i + 1; k > 0; k--) {
//	            final Kort kort1 = samling.getCards().get(k);
//	            final Kort kort2 = samling.getCards().get(k - 1);
//	            if(kort.compare(kort1, kort2) < 0) {
//	                swap(samling, k, k-1);
//	            } else {
//	                break;
//	            }
//	        }
//		
	}
	
	/**
	 * Stokkar en kortsamling. 
	 * 
	 * @param samling
	 * 			samling av kort som skal stokkes. 
	 */
	public static void stokk(KortSamling samling) {
		
		Random random = new Random();
		for(int i = samling.getSamling().length - 1; i > 0; i++) {
			int a = random.nextInt(i);
			Kort temp = samling.getSamling()[i];
			samling.getSamling()[i] = samling.getSamling()[a];
			samling.getSamling()[a] = temp;
		}
		
		
//		Random rand = new Random();
//		for (int i = 0; i < samling; i++) {
//			int r = i + rand.nextInt(samling - i);
//			int temp = KortSamling[r];
//			KortSamling[r] = KortSamling[i];
//			KortSamling[i] = temp;
//		}
		
		
		
		
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

	}
	
}
