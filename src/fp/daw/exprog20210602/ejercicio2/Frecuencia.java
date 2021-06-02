package fp.daw.exprog20210602.ejercicio2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.TreeMap;

public class Frecuencia {
	private Map<String, Integer> mapa = new TreeMap<>();

	public Frecuencia(File fichero) {
		InputStream is;
		try {
			is = new FileInputStream(fichero);
			InputStreamReader isr = new InputStreamReader(is, Charset.forName("ISO-8859-1"));
			BufferedReader br = new BufferedReader(isr);
			String línea;
			while ((línea = br.readLine()) != null) {
				for (String palabra : línea.split("//P{L}")) {
					if (mapa.containsKey(palabra))
						mapa.put(palabra, mapa.get(palabra) + 1);
					else
						mapa.put(palabra, 1);
				}
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Integer getFrec(String palabra) {
		if (!mapa.containsKey(palabra))
			return 0;
		else
			return mapa.get(palabra);
	}
}