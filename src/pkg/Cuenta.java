package pkg;

public class Cuenta {
		String mNumero;
		String nTitular; 
        //List <Movimiento> mMovimientos;
		double saldo;
		
		public Cuenta(String mNumero, String nTitular, double saldo) {
			super();
			this.mNumero = mNumero;
			this.nTitular = nTitular;
			this.saldo = saldo;
		}

		public double getSaldo() {
			return saldo;
		}

		public void ingreso(double i) {
			saldo += i;
		}

		public void reintegro(double i) {
			saldo -= i;
		}
		
		
}
