package primerosPasosGenerics;

import java.util.Arrays;

public class EstanteDeCosas <P>{
	private P[] arrayDeCosas;

	public EstanteDeCosas(P[] arrayDeCosas) {
		this.arrayDeCosas = arrayDeCosas;
	}

	@Override
	public String toString() {
		return "EstanteDeCosas [arrayDeCosas=" + Arrays.toString(arrayDeCosas) + "]";
	}

	public P[] getArrayDeCosas() {
		return arrayDeCosas;
	}
	
	
	
}
