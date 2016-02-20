package work3;
import javax.swing.JOptionPane;
public class work3_2 {
	
	static int A=0;
	static int E=0;
	static int I=0;
	static int O=0;
	static int U=0;
	
	public String input(){
		String name = JOptionPane.showInputDialog(null,"Input Name and Surname: = ","INPUT",JOptionPane.QUESTION_MESSAGE);
		name = name.toUpperCase();
		return name;
	}
	
	public void calculate(String name){
		for (int i=0; i< name.length();i++){
			if (name.charAt(i) == 'A'){
				A = A+1;
			}
			else if (name.charAt(i) == 'E'){
				E = E+1;
			}
			else if (name.charAt(i) == 'I'){
				I = I+1;
			}
			else if (name.charAt(i) == 'O'){
				O = O+1;
			}
			else if (name.charAt(i) == 'U'){
				U = U+1;
			}
		}
	}
	public static void main(String[] args) {
		String name;
		work3_2 h = new work3_2();
		name = h.input();
		h.calculate(name);
		JOptionPane.showMessageDialog(null,"Show Full name and Surname = "+name+"\n A = "+A+"\n E = "+E+"\n I  = "+I+"\n O = "+O+"\n U = "+U,"Output",JOptionPane.INFORMATION_MESSAGE);
	}

}
	