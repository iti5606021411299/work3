package work3;
import javax.swing.JOptionPane;
public class work3_1 {
	int sec=0,
			today=0,
			hour=0,
			minute=0;
		
		public void input(){
			String ss;
			ss = JOptionPane.showInputDialog(null,"Input Second : = ","Input",JOptionPane.QUESTION_MESSAGE);
			sec = Integer.parseInt(ss);
			}
		public void calculate(){
			
			minute = sec / 60;
			sec    = sec % 60;
			
			hour   = minute / 60;
			minute = minute % 60;
			
			today = hour / 24;
			hour  = hour % 24;
		}
		public static void main(String[] args) {
			work3_1 h = new work3_1();
		h.input();
		h.calculate();
		JOptionPane.showMessageDialog(null,"Show All: = \n"+"Day = "+h.today+" \nHour = "+h.hour+"\nMinute = "+h.minute+"\nSec = "+h.sec,"Input",JOptionPane.QUESTION_MESSAGE);
		}

	}


