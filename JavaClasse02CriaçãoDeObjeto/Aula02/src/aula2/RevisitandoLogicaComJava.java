package aula2;


public class RevisitandoLogicaComJava {

	public static void main(String[] args) {

		numerosPares();
		exibirSoma();
		metalMaisPesado(150.2, 80.4,150.2);
		numeroIntervalo();
			
		}
		public static void numerosPares(){
			for(int i = 100; i >= 0;i--){
				if(i % 2 == 0 ){
					System.out.print(i == 100 ? "Números Par:"+i : "," + i);
		  }
		 }
		}
		
		public static void exibirSoma(){
			int soma =0;
		for(int i = 0; i < 100;i++){
		 soma += i;
		}
		System.out.println("\nsoma de 0 a 100: "+soma);
		}
		
		public static void metalMaisPesado(double metalPeso1, double metalPeso2, double metalPeso3){
			
			
			
			if(metalPeso1 >= metalPeso2 && metalPeso1 >= metalPeso3){
				System.out.println("Metal mais Pesado é o 1: " + metalPeso1);
			}else if(metalPeso2 >= metalPeso1 && metalPeso2 >= metalPeso3){
				System.out.println("Metal mais Pesado é o: " + metalPeso2);
			}else{
				System.out.println("Metal mais Pesado é o 3: " + metalPeso3);
			}
		}
		public static void numeroIntervalo(){
			for(int i=0; i <= 100; i++){
				if(i > 50 && i < 75){
					continue;
				}
				System.out.print(i == 0 ? "Numero sem o intervalo:" : "");
				System.out.print(i == 100 ? i :i +",");
			}
			
			
		}
		
		}

	


