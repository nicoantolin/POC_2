package cl.abcdin.sst.utils;


import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class AuxLoad 
{
	
	  public static ArrayList<String> consume(String protocol, String wsURL, String host, String soapAction, String xmlInput)
	  {
		ArrayList<String> respuesta = new ArrayList<String>();
		// Inicializa variables
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

						httpConn.setRequestMethod("POST");

						httpConn.setDoOutput(true);
						httpConn.setDoInput(true);

						out = httpConn.getOutputStream();
						out.write(b);
						out.close();

						
						
						// if1
						System.out.println(httpConn.getResponseCode());
						if (httpConn.getResponseCode() != 200) {
							// Se trae el codigo de respuesta

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
						
						System.out.println("---------- Response Generar Guia  ----------");
						System.out.println(outputString);
						byte[]xml = outputString.getBytes();
						
						
						Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new ByteArrayInputStream(xml));
						NodeList cod = doc.getElementsByTagName("Codigo");
						NodeList men = doc.getElementsByTagName("Mensajes");
						NodeList fol = doc.getElementsByTagName("Folio");
						NodeList fault = doc.getElementsByTagName("faultstring");
						
						
						
						//errores index 0
						// = 0 -> error 500
						// = 1 -> Error en datos
						// = 2 -> Se creó
						if(httpConn.getResponseCode()==200){
							
							if(cod.item(0).getTextContent().equals("OK")) {
								respuesta.add("2");//0
								respuesta.add(cod.item(0).getTextContent());//1
								respuesta.add(men.item(0).getTextContent());//2
								respuesta.add(fol.item(0).getTextContent());//3
							}else {
								respuesta.add("1");//0
								respuesta.add(cod.item(0).getTextContent());//1
								respuesta.add(men.item(0).getTextContent());//2
								respuesta.add(fol.item(0).getTextContent());//3
							}
							
						}else {
							respuesta.add("1");
							respuesta.add(fault.item(0).getTextContent());
							respuesta.add(null);
							respuesta.add(null);
						}
						
						System.out.println(responseString);
					} // Fin try
					catch (Exception e) {

						// Capturo cualquier anormalidad y la guardo como error en el nivel del log

					} // Fin catch
					return respuesta;
	  }//Fin consume

}
