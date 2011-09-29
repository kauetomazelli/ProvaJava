public class EstatisticasSimples {

	public static double calculaValorMinimo(double[] valoresDeEntrada) {
		double valorMinimoCalculado = valoresDeEntrada[0];

		for (int i = 0; i < valoresDeEntrada.length; i++) {
			if (valoresDeEntrada[i] < valorMinimoCalculado) {
				valorMinimoCalculado = valoresDeEntrada[i];
			}
		}
		return valorMinimoCalculado;
	}

	public static double calculaValorMaximo(double[] valoresDeEntrada) {
		double valorMaximoCalculado = valoresDeEntrada[0];
		for (int i = 0; i < valoresDeEntrada.length; i++) {
			if (valoresDeEntrada[i] > valorMaximoCalculado) {
				valorMaximoCalculado = valoresDeEntrada[i];
			}
		}
		return valorMaximoCalculado;
	}

	public static int calculaQuantidade(double[] valoresDeEntrada) {
		int quantidadeDeValores = valoresDeEntrada.length;
		return quantidadeDeValores;
	}

	public static double calculaMedia(double[] valoresDeEntrada) {
		double somaDosValores = 0;
		double mediaDeValores = 0;
		for (int i = 0; i < valoresDeEntrada.length; i++) {
			somaDosValores = somaDosValores + valoresDeEntrada[i];
		}
		mediaDeValores = somaDosValores / valoresDeEntrada.length;
		return mediaDeValores;
	}

	public static double[] calcula(double[] valoresDeEntrada) {
		double valoresDeSaida[] = { 0, 0, 0, 0 };

		valoresDeSaida[0] = calculaValorMinimo(valoresDeEntrada);
		valoresDeSaida[1] = calculaValorMaximo(valoresDeEntrada);
		valoresDeSaida[2] = calculaQuantidade(valoresDeEntrada);
		valoresDeSaida[3] = calculaMedia(valoresDeEntrada);

		return valoresDeSaida;

	}
}