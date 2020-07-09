import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.JPanel;

public class Consumidor extends Thread {
	JProgressBar caballo;
	JTextArea mensajes;
	JLabel nombre;
	JLabel muerto;
	String aux;
	JPanel panel;
	String contenido="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	char[] caracteres = contenido.toCharArray();
	long totalSum = 0;
	boolean desicion=false;
	int a,b;
	double inf = Double.POSITIVE_INFINITY; 
	static int FIN = 10;
	
	public Consumidor(String str, JProgressBar jpb, JTextArea jta, JLabel jl, int ini, JPanel i,JLabel muert,boolean dec) {
		super(str);
		this.caballo = jpb;
		this.mensajes = jta;
		this.nombre = jl;
		this.a=ini;
		this.muerto=muert;
		this.panel=i;
		this.desicion= dec;
		this.caballo.setMinimum(0);
		this.caballo.setMaximum(FIN);		
		this.nombre.setText(str);
		this.muerto.setText("0");
	}
	
	public void run(){
		if(desicion) {
		while(true) {
			panel.setBackground(Color.GREEN);
			int j=0;
		for (int i = caballo.getValue(); i > 0; i--) {
			int g=caballo.getValue();
			 j=(g-1)%26;

			//System.out.println("Posición " + i + ": " + getName());
			caballo.setValue(i);
			mensajes.append(getName()+ " Consume: " + caracteres[j] + "\n");
		}
		try {
			
			long startTime = System.currentTimeMillis();
			sleep((int) (Math.random() * 5000));
			mensajes.append(getName()+ " descansa de consumir\n");
			totalSum += (System.currentTimeMillis()-startTime);
			aux = String.valueOf(totalSum);
			this.muerto.setText(aux);
			//System.out.println("El caballo " + getName() + " descansa.");
		} catch (InterruptedException e) {
			//System.out.println(e);
			mensajes.append(String.valueOf(e)+"\n");
		}
		
		//System.out.println("Fin de la carrera para: " + getName());
		

	}}
		else {
			int i=0;
			while(true) {
				caballo.setValue(FIN);
				mensajes.append(getName()+ " CONSUME: "  + "\n");
			}
		}
		}
}
