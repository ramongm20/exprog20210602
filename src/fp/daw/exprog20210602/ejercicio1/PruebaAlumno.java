package fp.daw.exprog20210602.ejercicio1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.Set;
import java.util.TreeSet;

public class PruebaAlumno {

	public static void main(String[] args) {
		Set<Alumno> alums = new TreeSet<>();

		alums.add(new Alumno("Rosa", "García", LocalDate.of(1990, 12, 1), "DAW", 1));
		alums.add(new Alumno("Juana", "García", LocalDate.of(1991, 12, 1), "DAW", 1));
		alums.add(new Alumno("Andrés", "Suárez", LocalDate.of(1993, 12, 1), "DAM", 2));

		alums.forEach(a -> System.out.println(a));

		guardar(alums);
	}

	static void guardar(Set<Alumno> alums) {
		File fichero = new File("alumnos.bin");
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero))) {
			oos.writeObject(alums);
			System.out.println("Información guardada correctamente.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
