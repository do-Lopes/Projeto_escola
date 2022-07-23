/* Leonardo Lopes Rodrigues Silva */
/* RA: 2266431 */

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Leitor{
		public String entDados(String entred){
		
		System.out.println(entred);

		InputStreamReader teclas = new InputStreamReader(System.in);
		BufferedReader buff = new BufferedReader(teclas);

		String ent = "";

		try{
			ent = buff.readLine();
		}
		catch(IOException ioe){
			System.out.println("\nERRO");
		}

		return ent;
	}
}