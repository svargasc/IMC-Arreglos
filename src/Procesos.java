import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Procesos {
	
	
	double pesoPersonas[];
	double alturaPersonas[];
	double imcPersonas[];
	Double peso,altura;
	String nombre[];
	int cantidadPersonas;

	double imc;
	
	public void iniciar() {
		
		String menu="GESTION ESTUDIANTES\n";
		menu+="1. Llenar Datos\n";
		menu+="2. Imprimir Datos\n";
		menu+="3. Salir\n";
		menu+="Ingrese una opcion:\n";
		
		int opc=0;
		do {
			opc=Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			validarMenu(opc);
			
		} while (opc!=3);
		
		System.out.println("Adios!!");
		
		
	}
	
	private void validarMenu(int opc) {
		
		switch (opc) {
		case 1:
			llenarDatos();
			calcularImc();
			break;
		case  2:
			operarImc();
			break;
		default:
			break;
		}
		
	}

	private void operarImc() {

		for (int i = 0; i < nombre.length; i++) {
			if (imcPersonas[i] < 18) {
				System.out.println("El IMC de "+nombre[i]+ " es de: "+imcPersonas[i]+" y tiene anorexia!");
			}else if(imcPersonas[i] >= 18 && imcPersonas[i] < 20) {
				System.out.println("El IMC de "+nombre[i]+ " es de: "+imcPersonas[i]+" y tiene delgadez!");
			}else if(imcPersonas[i] >= 20 && imcPersonas[i] < 27) {
				System.out.println("El IMC de "+nombre[i]+ " es de: "+imcPersonas[i]+" y esta en normalidad!");
			}else if(imcPersonas[i] >= 27 && imcPersonas[i] < 30) {
				System.out.println("El IMC de "+nombre[i]+ " es de: "+imcPersonas[i]+" y tiene Obseidad grado 1!");
			}else if(imcPersonas[i] >= 30 && imcPersonas[i] < 35) {
				System.out.println("El IMC de "+nombre[i]+ " es de: "+imcPersonas[i]+" y tiene Obseidad grado 2!");
			}else if(imcPersonas[i] >= 35 && imcPersonas[i] < 40) {
				System.out.println("El IMC de "+nombre[i]+ " es de: "+imcPersonas[i]+" y tiene Obseidad grado 3!");
			}else if(imcPersonas[i] >= 40) {
				System.out.println("El IMC de "+nombre[i]+ " es de: "+imcPersonas[i]+" y tiene Obseidad morbida!");
			}
		}
		
	}

	private void calcularImc() {

		for (int i = 0; i < alturaPersonas.length; i++) {
			imcPersonas[i] = pesoPersonas[i]/(alturaPersonas[i]+alturaPersonas[i]);
		}
		
	}

	private void llenarDatos() {

		int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cuantas personas va a registrar:"));
		
		nombre = new String[cantidad];
		pesoPersonas = new double[cantidad];
		alturaPersonas = new double[cantidad];
		imcPersonas = new double[cantidad];
		
		for (int i = 0; i < nombre.length; i++) {
            nombre[i]=JOptionPane.showInputDialog("Ingrese el nombre "+(i+1));
            alturaPersonas[i] = Double.parseDouble(JOptionPane.showInputDialog("Dijite la altura:"));
            pesoPersonas[i] = Double.parseDouble(JOptionPane.showInputDialog("Dijite su peso:"));
        }
		
		
	}

	
	
}
