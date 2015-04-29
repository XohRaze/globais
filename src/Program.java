import java.io.ObjectInputStream.GetField;
import java.util.HashMap;
import java.util.Map;

import javax.swing.RowFilter.Entry;


public class Program {

	
	public static void main(String[] args) {
		Global.lista.put(1, "segunda feira");
		Global.lista.put(2, "terça feira");
		Global.lista.put(3, "quarta feira");
		Global.lista.put(4, "quinta feira");
		Global.lista.put(5, "sexta feira");
		Global.lista.put(6, "sabado");
		Global.lista.put(7, "domingo");
		
		for(java.util.Map.Entry<Integer, String> s : Global.lista.entrySet())
		{
			System.out.println(s.getKey() + ", " + s.getValue());
		}
	}

}
