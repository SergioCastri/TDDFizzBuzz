	package FizzBuzz;

	public class Multiplos {

		public static void main(String[] args) {
			int i;
			for(i=1; i<=100; i++) {
				multiplos(i);
			}
		}
		
		public static String multiplos(int numero) {
			if (numero % 5 == 0 & numero % 3 == 0) {
				System.out.println("FizzBuzz");
				return "FizzBuzz";
			}
			if (numero % 3 == 0 ) {
				System.out.println("Fizz");
				return "Fizz";
			}
			if (numero % 5 == 0 ) {
				System.out.println("Buzz");
				return "Buzz";
			}
			System.out.println(numero);
			return String.valueOf(numero);
		}

	}
