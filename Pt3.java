
public class Pt3 {

	public static void main(String[] args) {
		Mexicano prsn0 = new Mexicano(null, null, null);
		Mexicano prsn1 = new Mexicano(null, null, null);
		Mexicano prsn2 = new Mexicano(null, null, null);
		Mexicano array[] = new Mexicano[] {prsn0,prsn1,prsn2};
		
		for(int i=0;i<array.length;i++) {
			CyR.papeles(i,array);
		}
		
		System.out.println("El CURP generado de la primera persona: "+array[0].nombre+" | "+array[0].curp);
		System.out.println("El CURP generado de la segunda persona: "+array[1].nombre+" | "+array[1].rfc);
		System.out.println("El CURP generado de la tercera persona: "+array[2].nombre+" | "+array[2].curp+" | "+array[2].rfc);
	}

}

