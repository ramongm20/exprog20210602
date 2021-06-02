package fp.daw.exprog20210602.ejercicio3;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Ejercicio3 {
	public static void main(String[] args) {

	}

	public Boolean invertir(Integer n, Queue<Integer> q) {
		if (n <= 0)
			return false;
		else if (q == null || q.size() < n)
			throw new IllegalArgumentException();
		else {
			Deque<Integer> qn = new ArrayDeque<>();

		}
		return true;
	}

}
