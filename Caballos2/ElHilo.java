import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import java.awt.Color;
public class ElHilo extends Thread {
	JProgressBar caballo;
	JTextArea mensajes;
	JLabel nombre;
	JLabel muerto;
	String aux;
	long totalSum = 0;
	String contenido="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	char[] caracteres = contenido.toCharArray();
	boolean desicion=false;
	int a,b;
	JPanel panel;
	int FIN;
	double inf = Double.POSITIVE_INFINITY; 
	
	public ElHilo(String str, JProgressBar jpb, JTextArea jta, JLabel jl, int ini,  JPanel fini,JLabel muert,boolean dec) {
		super(str);
		this.caballo = jpb;
		this.mensajes = jta;
		this.nombre = jl;
		this.a=ini;
		this.muerto=muert;
		this.panel=fini;
		this.desicion= dec;
		this.caballo.setMinimum(0);
		this.FIN = ini;
		this.caballo.setMaximum(FIN);		
		this.nombre.setText(str);
		this.muerto.setText("0");
	}
	
	public void run(){
		if(desicion) {
			while(true) {
				int j=0;
				for (int i = caballo.getValue(); i < FIN; i++) {
					j=i%26;
					panel.setBackground(Color.GREEN);
					caballo.setValue(i+1);
					mensajes.append(getName()+ "  produjo :" + caracteres[j] + " "+ "\n");
					j=i%26;
				
				}
				try {
					long startTime = System.currentTimeMillis();
					mensajes.append(getName()+ "  descansa de producir\n");
					sleep((int) (Math.random() * 5000));
					totalSum += (System.currentTimeMillis()-startTime);
					aux = String.valueOf(totalSum);
					this.muerto.setText(aux);
					
				} catch (InterruptedException e) {
				
					mensajes.append(String.valueOf(e)+"\n");
				}
			

		}}
		
		else {
			int i=0;
			while(true) {
			
				caballo.setValue(0);
				mensajes.append(getName()+ " produjo "  + "\n");
			}
		}
		}
	
		
}
