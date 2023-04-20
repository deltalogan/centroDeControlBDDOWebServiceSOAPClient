package centroDeControlBDDOWebServiceSOAPClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.tempuri.BddoService;

public class BddoConsumer {

	public static void main(String[] args) {
		BddoService bddoService = new BddoService();

		String usuario = null;

		String clave = null;

		System.out.println("Usuario:");
		try {
			usuario = (new BufferedReader(new InputStreamReader(System.in)).readLine());
		} catch (IOException e) {
			System.out.println(e.getMessage().toString());
		}

		System.out.println("Clave:");
		try {
			clave = (new BufferedReader(new InputStreamReader(System.in)).readLine());
		} catch (IOException e) {
			System.out.println(e.getMessage().toString());
		}

		// Convertimos el string en un objeto json

		JSONParser jSONParser = new JSONParser();
		Object object;
		try {
			object = jSONParser.parse(bddoService.getBddoServiceSoap().login(usuario, clave, "", "").toString());
			JSONObject jSONObject = (JSONObject) object;

			Iterator<?> itemsKeySet = jSONObject.keySet().iterator();

			Iterator<?> itemsValues = jSONObject.values().iterator();

			while (itemsValues.hasNext() && itemsKeySet.hasNext()) {

				System.out.println(itemsKeySet.next().toString());

				String item = itemsValues.next().toString();

				System.out.println(item);
			}

			// System.out.println(jSONObject.toString());

		} catch (ParseException e) {
			System.out.println(e.getMessage().toString());
		}
	}
}