import java.util.Linklist;
public class Linklist {
	public static void main(String[] args) {
		Linklist <String> a = new Linklist();
		 a.add("A");
		 a.add("B");
		 a.add("c");
		 a.add("D");
		 
		 for(int i=0; i<a.length();i++) {
			 System.out.println(a.get(i));
		 }
		 
	}

}
