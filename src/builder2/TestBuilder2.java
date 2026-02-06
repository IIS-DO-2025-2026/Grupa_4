package builder2;

public class TestBuilder2 {

	public static void main(String[] args) {
		Sandwich.Builder builder = new Sandwich.Builder("Integralno");
		
		builder.spread("urnebes").spread("pavlaka").meat("šunka").salad("zelena").spread("kečap").dressing("cezar");
		
		Sandwich sandwich = builder.build();
		
		System.out.println(sandwich);

	}

}
