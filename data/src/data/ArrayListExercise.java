package data;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExercise {
	
	public static void main(String[] args) {
		problemarraylist();
	}
	static Scanner in = new Scanner(System.in);
	public static void problemarraylist() {
		System.out.println("Enter the number of cases:");
		int k = in.nextInt();
		
		ArrayList<Integer> Ar = new ArrayList<>();
		for(int i=0; i<k; i++) {
			System.out.println("Enter number 1 to add element, 2 to delete or other to see size: ");
			int opt = in.nextInt();
			
			if(opt == 1) {
				System.out.println("Enter element to be added: ");
				int numadd = in.nextInt();
				Ar.add(numadd);
			}
			else if(opt == 2) {
				System.out.println("Enter element to be deleted: ");
				int numdel = in.nextInt();
				removeElement(Ar,numdel);
			}
			else {
				System.out.println(Ar.size());
			}
		}
	}
	
	public static ArrayList<Integer> removeElement (ArrayList<Integer> ARR, int x){
		ArrayList<Integer> temporal = new ArrayList<>();
		temporal.addAll(ARR);
		ARR.clear();
		for(int e : temporal) {
			if(e!=x) {
				ARR.add(e);
			}
		}
		return ARR;
	}

}

