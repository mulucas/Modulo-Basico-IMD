package calcula_notas;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class fazer {
	double num1,num2,resultado=0;

	public void mudaCor(double x, JTextField v) {
		if (x>=5) {
			v.setBackground(new Color(0, 255, 0));
		}else {
			v.setBackground(new Color(255, 0, 0));
		}
	}
	public  double realizaCalculo(JTextField x, JTextField y) {	
		num1 = Double.parseDouble(x.getText());  											
		num2 = Double.parseDouble(y.getText()); 			
		resultado = (num1 + num2)/2;
		return resultado;
	}
	public void addAcao(JTextField principal, JTextField x , JTextField y) {
		y.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) {					
				// coloca o foco no componente
		        y.requestFocus();
		        // seleciona todo o conteúdo
		        y.selectAll();
			}
		});
		x.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) {					
				// coloca o foco no componente
		        x.requestFocus();
		        // seleciona todo o conteúdo
		        x.selectAll();
			}
		}); 
		principal.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) {					
				mudaCor(realizaCalculo(x, y), principal);
				String r =String.valueOf(realizaCalculo(x, y));
				principal.setText(r);
			}
		});		
	}
	public void limparCampos(JPanel container)	{
	    Component components[] = container.getComponents();
	    for (Component component : components){
	        if (component instanceof JTextField){
	            ((JTextField)component).setText(null);
	            ((JTextField)component).setBackground(new Color(255, 255, 255));
	        }
	    }
	}
}
