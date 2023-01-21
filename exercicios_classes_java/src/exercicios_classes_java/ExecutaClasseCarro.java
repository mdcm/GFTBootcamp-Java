package exercicios_classes_java;

public class ExecutaClasseCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro carro = new Carro();
		
		carro.setCor("Black");
		carro.setModelo("Ferrari");
		carro.setCapacidadeTanque(50);
		
		System.out.println(carro.getModelo());
		System.out.println(carro.getCor());
		System.out.println(carro.getCapacidadeTanque());
		System.out.println(carro.totalValorTanque(6.9));
		
		Carro carro2 = new Carro("Cinza", "Mustang", 70);
		
		System.out.println(carro2.getModelo());
		System.out.println(carro2.getCor());
		System.out.println(carro2.getCapacidadeTanque());
		System.out.println(carro2.totalValorTanque(5.9));
	}

}
