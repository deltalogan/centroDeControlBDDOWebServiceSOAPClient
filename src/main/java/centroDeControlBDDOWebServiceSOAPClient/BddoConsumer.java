package centroDeControlBDDOWebServiceSOAPClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

import org.json.JSONObject;
import org.tempuri.BddoService;

public class BddoConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BddoService bddoService = new BddoService();

		String usuario = null;

		String clave = null;

		System.out.println("Usuario:");
		try {
			usuario = (new BufferedReader(new InputStreamReader(System.in)).readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage().toString());
		}

		System.out.println("Clave:");
		try {
			clave = (new BufferedReader(new InputStreamReader(System.in)).readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage().toString());
		}

		// Convertimos el string en un objeto json
		JSONObject jSONObject = new JSONObject(
				bddoService.getBddoServiceSoap().login(usuario, clave, "", "").toString());

		if (!jSONObject.has("error")) {

			Iterator<String> items = jSONObject.keys();

			while (items.hasNext()) {

				String item = items.next().toString();

				System.out.println(item);

				if (item.equals("sesion")) {

					Iterator<String> subItems = jSONObject.getJSONObject(item).keys();

					while (subItems.hasNext())

						System.out.println(jSONObject.getJSONObject(item).get(subItems.next().toString()).toString());
				}

				else if (item.equals("Empresas")) {

					Iterator<Object> subItems = jSONObject.getJSONArray(item).iterator();

					while (subItems.hasNext())

						System.out.println(subItems.next());
				}

				else

					System.out.println(jSONObject.get(item).toString());
			}
		}

		else {

			Iterator<String> items = jSONObject.keys();

			while (items.hasNext())

				System.out.println(jSONObject.get(items.next().toString()).toString());
		}
	}
}