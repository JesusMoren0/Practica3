import java.util.Random;
import java.util.Scanner;

public class CyR {
static String app, apm, n, y, m, d, sx, id;
	
	public static Mexicano papeles(int i,Mexicano [] array) {
		System.out.println();
		n = CapturasEntrada.capturarCadena("Introduce el nombre").toUpperCase();
		app = CapturasEntrada.capturarCadena("Introduce el apellido paterno").toUpperCase();
		apm = CapturasEntrada.capturarCadena("Introduce el apellido materno").toUpperCase();
		d = CapturasEntrada.capturarCadena("Introduce el DIA de nacimiento");
		m = CapturasEntrada.capturarCadena("Introduce el MES de nacimiento");
		y = CapturasEntrada.capturarCadena("Introduce el AÑO de nacimiento");
		sx = CapturasEntrada.capturarCadena("Introduce el genero").toUpperCase();
		id = CapturasEntrada.capturarCadena("Introduce el estado de nacimiento").toUpperCase();
		
		
		array[i].nombre = app+" "+apm+" "+n;
		array[i].curp = String.valueOf(app.charAt(0))+CyR.VCL(app)+String.valueOf(apm.charAt(0))+String.valueOf(n.charAt(0))+String.valueOf(y.charAt(2))
				+String.valueOf(y.charAt(3))+String.valueOf(m.charAt(0))+String.valueOf(m.charAt(1))+String.valueOf(d.charAt(0))+String.valueOf(d.charAt(1))
				+String.valueOf(sx.charAt(0))+String.valueOf(id.charAt(0))+String.valueOf(id.charAt(1))+(CyR.CS(app))+(CyR.CS(apm))+(CyR.CS(n))
				+(CyR.HCL())+(CyR.HC()); 
		array[i].rfc = String.valueOf(app.charAt(0))+CyR.VCL(app)+String.valueOf(apm.charAt(0))+String.valueOf(n.charAt(0))+String.valueOf(y.charAt(2))
			+String.valueOf(y.charAt(3))+String.valueOf(m.charAt(0))+String.valueOf(m.charAt(1))+String.valueOf(d.charAt(0))+String.valueOf(d.charAt(1))+(CyR.HCL())
			+(CyR.HC())+(CyR.HC());
		return null;
	}
	public static String VCL(String letra) {
		for(int i=0;i<letra.length();i++) {
			char VC[] = new char [] {'A','E','I','O','U'};
			for(int r=0;r<VC.length;r++) {
				if(letra.charAt(i)==VC[r]) {
					String VCS = String.valueOf(VC[r]);
					return VCS;
				}
			}
		}
	return null;
}
	
	public static String HCL() {
		Random al = new Random(System.currentTimeMillis());
		int nm = al.nextInt(10);al.setSeed(System.currentTimeMillis());
		return String.valueOf(nm);
	}
	public static String CS(String letrs) {
		for(int i=1;i<letrs.length();i++) {
			char CT[] = new char[] {'B','C','D','F','G','H','I','J','K','L','M','P','Q','R','S','T','V','X','Z','W','Y'};
			for(int s=0;s<CT.length;s++) {
				if(letrs.charAt(i)==CT[s]) {
					String CTS = String.valueOf(CT[s]);
					return CTS;
				}
			}
		}
		return null;
	}
	public static String HC() {
		Random al = new Random(System.currentTimeMillis());
		int nm = al.nextInt(21);char Consnantes [] = new char [] {'B','C','D','F','G','H','I','J','K','L','M','P','Q','R','S','T','V','X','Z','W','Y'};
		al.setSeed(System.currentTimeMillis());return String.valueOf(Consnantes[nm]);
	}
	
	static class CapturasEntrada{
		
	    public static int capturarEntero(String msg){
	        Scanner sc = new Scanner(System.in);System.out.print(""+msg+": ");return (sc.nextInt());
	    }

	    public static float capturarFlotante(String msg){
	        Scanner sc = new Scanner(System.in);System.out.print(""+msg+": ");return (sc.nextFloat());
	    }

	    public static double capturarDoble(String msg){
	        Scanner sc = new Scanner(System.in);System.out.print(""+msg+": ");return (sc.nextDouble());
	    }

		public static String capturarCadena(String msg){
	        Scanner sc = new Scanner(System.in); System.out.print(""+msg+": ");return (sc.nextLine());
	    }
		}
}


