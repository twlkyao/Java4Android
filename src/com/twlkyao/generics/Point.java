package com.twlkyao.generics;

/**
 * a generic class.
 * @author Jack
 *
 * @param <T>
 */
class Point<T>{
	
	// a generic type variable.
	private T var;
	
	// a generic type variable, may different with the var.
	// but it's better to use a different type parameter.
	private T Yar;

	public T getVar() {
		return var;
	}

	public void setVar(T var) {
		this.var = var;
	}

	public T getYar() {
		return Yar;
	}

	public void setYar(T yar) {
		Yar = yar;
	}
	
	
	/*class Point<T, S>{ // declare two type parameters.
		
		// a generic type variable.
		private T var;
		
		// a generic type variable, may same with the var.
		private S Yar;

		public T getVar() {
			return var;
		}

		public void setVar(T var) {
			this.var = var;
		}

		public S getYar() {
			return Yar;
		}

		public void setYar(S yar) {
			Yar = yar;
		}*/
}
