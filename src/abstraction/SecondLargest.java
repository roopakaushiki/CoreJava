package abstraction;

public class SecondLargest {

	public static void main(String[] args) {
		
		int[] array= {10,20,25,63,63,96,57};
		int lar = 0;
		int Slarge = 0;
		for(int i =0;i<array.length;i++) {
			
			if(array[i]> lar) {
				Slarge = lar;
				lar = array[i];
			}
			else if (array[i]> Slarge)
				Slarge = array[i];
		}
		System.out.println(Slarge);

	}

}
