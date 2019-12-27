/*
ID: alexand131
LANG: JAVA
TASK: milk2
 */
import java.io.*;
import java.util.*;
class Range implements Comparable {
	int start, end;
	public Range(String s) {
		start = Integer.parseInt(s.substring(0, s.indexOf(" ")));
		end = Integer.parseInt(s.substring(s.indexOf(" ") + 1));
	}
	public int compareTo(Object o) {
		Range r = (Range) o;
		return start - r.start;
	}
	public String toString() {
		return start + " " + end;
	}
}
public class milk2 {
	public static void main(String[] args) throws IOException {
		BufferedReader kb = new BufferedReader(new FileReader("milk2.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("milk2.out")));
		int farmers = Integer.parseInt(kb.readLine());
		ArrayList<Range> times = new ArrayList<Range>();
		for (int i = 0; i < farmers; i++)
			times.add(new Range(kb.readLine()));
		Collections.sort(times);
		int k = times.size();
		for (int i = 1; i < k; i++) {
			if (times.get(i).start <= times.get(i - 1).end) {
				if (times.get(i).end >= times.get(i - 1).end) {
					Range n = new Range(times.get(i - 1).start + " " + times.get(i).end);
					times.remove(i);
					times.remove(i - 1);
					times.add(i - 1, n);
				} else
					times.remove(i);
				i--;
			}
			k = times.size();
		}
		Collections.sort(times);
		int maxm = 0, maxn = 0;
		for (int i = 0; i < times.size(); i++) {
			if (i != 0)
				maxn = Math.max(maxn, times.get(i).start - times.get(i - 1).end);
			maxm = Math.max(maxm, times.get(i).end - times.get(i).start);
		}
		out.println(maxm + " " + maxn);
		out.close();
	}
}
