package javasessions;

public class MethodChainingConcept {

	public void m1(int i) {
      m2(i);
	}

	public void m2(int j) {
      m3(j);
	}

	public void m3(int k) {
      System.out.println("Bye"+k);
	}

	public static void main(String[] args) {
      MethodChainingConcept mcc =new MethodChainingConcept();
      mcc.m1(10);
	}

}
