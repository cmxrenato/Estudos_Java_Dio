package equals_hash_code;

import java.util.Objects;

public class Carro implements Comparable<Carro>{

		private String marca;
		
			

		public Carro(String marca) {
			
			this.marca = marca;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		@Override
		public int hashCode() {
			return Objects.hash(marca);
		}
		
		public int compareTo(Carro obj) {
		/*	if(this.marca.length() < obj.marca.length()) {
				return -1;
			}else if(this.marca.length() > obj.marca.length()) {
				return 1;
			}
			return 1;*/
			
			
			//Em ordem alfabética:
			return this.getMarca().compareTo(obj.getMarca());			
			
			
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Carro other = (Carro) obj;
			return Objects.equals(marca, other.marca);
		}
		
		@Override
		public String toString() {
			return "Carro [marca=" + marca + "]";
		}
	
}
