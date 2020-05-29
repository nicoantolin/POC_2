package cl.abcdin.sst.utils;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import cl.abcdin.sst.exceptions.SSTException;

public class AuxAnularGuia {

	public static int consume(String protocol, String wsURL, String host, String soapAction, String xmlInput) throws SSTException {

		// Inicializa variables
		int codigoResponse = 0;
		URL url = null;
		URLConnection connection = null;
		HttpURLConnection httpConn = null;
		String responseString = null;
		String outputString = "";
		ByteArrayOutputStream bout = null;
		OutputStream out = null;
		InputStreamReader isr = null;
		BufferedReader in = null;
		try {
			String xmlInputUnespace = xmlInput;
			// Se crea un objeto URL, que recibe el parametro wsURL ingresado en el metodo
			url = new URL(protocol, host, wsURL);

			// Se abre la conection
			connection = url.openConnection();
			httpConn = (HttpURLConnection) connection;
			bout = new ByteArrayOutputStream();
			byte[] buffer = new byte[xmlInputUnespace.length()];
			buffer = xmlInputUnespace.getBytes();
			bout.write(buffer);
			byte[] b = bout.toByteArray();

			String SOAPAction = soapAction;

			httpConn.setRequestProperty("Content-Length", String.valueOf(b.length));
			httpConn.setRequestProperty("Content-Type", "text/xml; charset=UTF-8");
			httpConn.setRequestProperty("Host", host);
			httpConn.setRequestProperty("Connection", "Keep-Alive");
			httpConn.setRequestProperty("SOAPAction", SOAPAction);
			httpConn.setConnectTimeout(3000);

			httpConn.setRequestMethod("POST");

			httpConn.setDoOutput(true);
			httpConn.setDoInput(true);

			out = httpConn.getOutputStream();
			out.write(b);
			out.close();

			// if1
			System.out.println(httpConn.getResponseCode());
			if (httpConn.getResponseCode() != 200) {

				if (httpConn.getResponseCode() == 500) {
					isr = new InputStreamReader(httpConn.getErrorStream());
				} else {

				}
			} // Fin if1
			else {
				isr = new InputStreamReader(httpConn.getInputStream());
			}
			in = new BufferedReader(isr);
			while ((responseString = in.readLine()) != null) {
				outputString = outputString + responseString;
			}
			
			System.out.println("---------- Response anular guíaws ----------");
			System.out.println(outputString);

			byte[] xml = outputString.getBytes();

			Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder()
					.parse(new ByteArrayInputStream(xml));
			NodeList e = doc.getElementsByTagName("codigo");
			if (e != null) {
				String respuestaCod = e.item(0).getTextContent();
				if (respuestaCod != null && !respuestaCod.isEmpty()) {
					codigoResponse = Integer.parseInt(respuestaCod);
                                        if(codigoResponse == 0 || codigoResponse == 101){
                                        	return codigoResponse;
                                        }else {
                                        	throw new Exception("No se ha logrado anular la guia");
                                        }
				}
			}
		} // Fin try
		catch (Exception e) {
			System.out.println(e);
			throw new SSTException("En proceso, favor espere un momento.",e);
			// Capturo cualquier anormalidad y la guardo como error en el nivel del log

		} // Fin catch
		return codigoResponse;
	}// Fin consume
}
