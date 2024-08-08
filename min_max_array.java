package practice_programs;

public class min_max_array {

	public static void main(String[] args) {
		int x[] = {0,4,6,2,7};
		int max = 0;
		int min = 1;
		for(int i=0;i<x.length;i++) {
			if(x[i]>max) {
				max = x[i];
			}
			if(x[i]<min) {
				min = x[i]; 
			}
		}
		System.out.println("max: "+max);
		System.out.println("min: "+min);
	}

}
