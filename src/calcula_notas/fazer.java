package calcula_notas;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class fazer {
	double num1,num2,resultado;
	DecimalFormat df = new DecimalFormat("#.#");

	public void mudaCor(String x, JTextField v) {
		double c = Double.parseDouble(x);
		v.setDisabledTextColor(Color.BLACK);
		if (c>=5&&c<=10) {
			v.setBackground(new Color(0, 255, 0));
		}else if (c==404) {
			v.setText("");
			v.setBackground(new Color(255, 255, 255));
		}
		else {
			v.setBackground(new Color(255, 0, 0));
		}
	}
	
	public String calculaNotasSemanais(JTextField x, JTextField y) {	
		if (x.getText().trim().equals("")||y.getText().trim().equals("")) {
			return "404";
		}else {
			num1 = Double.parseDouble(x.getText());  											
			num2 = Double.parseDouble(y.getText()); 			
			resultado = (num1 + num2)/2;
			String resultadoEmTexto = ""+resultado;
			return resultadoEmTexto;
		}
	}
	
	public String calculaNotaTotalIngles(JTextField a1,JTextField a2,JTextField a3,JTextField a4,JTextField a5,
			JTextField a6,JTextField a7,JTextField a8,JTextField a9,JTextField a10) {
		double calc= Double.parseDouble(a1.getText()) + Double.parseDouble(a2.getText())+
		Double.parseDouble(a3.getText())+Double.parseDouble(a4.getText())+Double.parseDouble(a5.getText())+
		Double.parseDouble(a6.getText())+Double.parseDouble(a7.getText())+Double.parseDouble(a8.getText())+
		Double.parseDouble(a9.getText())+Double.parseDouble(a10.getText());
		calc = calc/10;
		df.format(calc);
		String resultadoEmTexto = ""+calc;
		return resultadoEmTexto;
	}
	
	public String calculaNotaTotalMatematica(JTextField a1,JTextField a2,JTextField a3,JTextField a4,JTextField a5,
			JTextField a6,JTextField a7,JTextField a8,JTextField a9,JTextField a10) {
		double calc= Double.parseDouble(a1.getText()) + Double.parseDouble(a2.getText())+
		Double.parseDouble(a3.getText())+Double.parseDouble(a4.getText())+Double.parseDouble(a5.getText())+
		Double.parseDouble(a6.getText())+Double.parseDouble(a7.getText())+Double.parseDouble(a8.getText())+
		Double.parseDouble(a9.getText())+Double.parseDouble(a10.getText());
		calc = calc/10;
		df.format(calc);
		String resultadoEmTexto = ""+calc;
		return resultadoEmTexto;
	}
	
	public String calculaNotaTotalLogica(JTextField a1,JTextField a2,JTextField a3,JTextField a4,JTextField a5,
			JTextField a6,JTextField a7,JTextField a8,JTextField a9) {
		double calc= Double.parseDouble(a1.getText()) + Double.parseDouble(a2.getText())+
		Double.parseDouble(a3.getText())+Double.parseDouble(a4.getText())+Double.parseDouble(a5.getText())+
		Double.parseDouble(a6.getText())+Double.parseDouble(a7.getText())+Double.parseDouble(a8.getText()+Double.parseDouble(a9.getText()));
		calc = calc/9;
		df.format(calc);
		String resultadoEmTexto = ""+calc;
		return resultadoEmTexto;
	}
	
	public String calculaNotaTotalSO(JTextField a1,JTextField a2,JTextField a3,JTextField a4,JTextField a5,
			JTextField a6,JTextField a7,JTextField a8,JTextField a9) {
		double calc= Double.parseDouble(a1.getText()) + Double.parseDouble(a2.getText())+
		Double.parseDouble(a3.getText())+Double.parseDouble(a4.getText())+Double.parseDouble(a5.getText())+
		Double.parseDouble(a6.getText())+Double.parseDouble(a7.getText())+Double.parseDouble(a8.getText()+Double.parseDouble(a9.getText()));
		calc = calc/9;
		df.format(calc);
		String resultadoEmTexto = ""+calc;
		return resultadoEmTexto;
	}

	public String calculaNotaTotalARQUITETURA(JTextField a1,JTextField a2,JTextField a3,JTextField a4,JTextField a5) {
		double calc= Double.parseDouble(a1.getText()) + Double.parseDouble(a2.getText())+
		Double.parseDouble(a3.getText())+Double.parseDouble(a4.getText())+Double.parseDouble(a5.getText());
		calc = calc/5;
		df.format(calc);
		String resultadoEmTexto = ""+calc;
		return resultadoEmTexto;
	}
	
	public String calculaNotaTotalTI(JTextField a1,JTextField a2,JTextField a3,JTextField a4,JTextField a5,
			JTextField a6,JTextField a7,JTextField a8) {
		double calc= Double.parseDouble(a1.getText()) + Double.parseDouble(a2.getText())+
		Double.parseDouble(a3.getText())+Double.parseDouble(a4.getText())+Double.parseDouble(a5.getText())+
		Double.parseDouble(a6.getText())+Double.parseDouble(a7.getText())+Double.parseDouble(a8.getText());
		calc = calc/8;
		df.format(calc);
		String resultadoEmTexto = ""+calc;
		return resultadoEmTexto;
	}
	
	public void selecionaTodoConteudo(JTextField x , JTextField y) {
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
		/*principal.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) {	
				mudaCor(realizaCalculo(x, y), principal);
				String r =String.valueOf(realizaCalculo(x, y));
				principal.setEnabled(false);
				principal.setText(r);										
			}
		});		*/
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