import static org.junit.Assert.*;

import org.junit.Test;

public class EstatisticasSimplesTest {

	@Test
	public void deveCalcularValorMinimoEntreDoisValores() {
		double valoresDeEntrada[] = { 9, 5 };
		double valorMinimoCalculado = EstatisticasSimples
				.calculaValorMinimo(valoresDeEntrada);
		assertEquals(5, valorMinimoCalculado, 0);
	}

	@Test
	public void deveCalcularValorMinimoEntreTresValores() {
		double valoresDeEntrada[] = { 9, 5, 2 };
		double valorMinimoCalculado = EstatisticasSimples
				.calculaValorMinimo(valoresDeEntrada);
		assertEquals(2, valorMinimoCalculado, 0);
	}

	@Test
	public void deveCalcularValorMinimoEntreQuatroValores() {
		double valoresDeEntrada[] = { 9, 5, 2, 15 };
		double valorMinimoCalculado = EstatisticasSimples
				.calculaValorMinimo(valoresDeEntrada);
		assertEquals(2, valorMinimoCalculado, 0);
	}

	@Test
	public void deveCalcularValorMinimoEntreCincoValores() {
		double valoresDeEntrada[] = { 9, 5, 2, 15, 1.98 };
		double valorMinimoCalculado = EstatisticasSimples
				.calculaValorMinimo(valoresDeEntrada);
		assertEquals(1.98, valorMinimoCalculado, 0);
	}

	@Test
	public void deveCalcularValorMaximoEntreDoisValores() {
		double valoresDeEntrada[] = { 9, 5 };
		double valorMaximoCalculado = EstatisticasSimples
				.calculaValorMaximo(valoresDeEntrada);
		assertEquals(9, valorMaximoCalculado, 0);
	}

	@Test
	public void deveCalcularValorMaximoEntreTresValores() {
		double valoresDeEntrada[] = { 9, 50, 2 };
		double valorMaximoCalculado = EstatisticasSimples
				.calculaValorMaximo(valoresDeEntrada);
		assertEquals(50, valorMaximoCalculado, 0);
	}

	@Test
	public void deveCalcularValorMaximoEntreQuatroValores() {
		double valoresDeEntrada[] = { 9, 5, 22, 15 };
		double valorMaximoCalculado = EstatisticasSimples
				.calculaValorMaximo(valoresDeEntrada);
		assertEquals(22, valorMaximoCalculado, 0);
	}

	@Test
	public void deveCalcularValorMaximoEntreCincoValores() {
		double valoresDeEntrada[] = { 9, 5, 2, 15, 15.01 };
		double valorMaximoCalculado = EstatisticasSimples
				.calculaValorMaximo(valoresDeEntrada);
		assertEquals(15.01, valorMaximoCalculado, 0);
	}

	@Test
	public void deveCalcularQuantidadeDeValores() {
		double valoresDeEntrada[] = { 9, 5 };
		int quantidadeDeValores = EstatisticasSimples
				.calculaQuantidade(valoresDeEntrada);
		assertEquals(2, quantidadeDeValores);
	}

	@Test
	public void deveCalcularQuantidadeDeValoresTest2() {
		double valoresDeEntrada[] = { 9, 5, 8 };
		int quantidadeDeValores = EstatisticasSimples
				.calculaQuantidade(valoresDeEntrada);
		assertEquals(3, quantidadeDeValores);
	}

	@Test
	public void deveCalcularQuantidadeDeValoresTest3() {
		double valoresDeEntrada[] = { 9, 5, 8, 9 };
		int quantidadeDeValores = EstatisticasSimples
				.calculaQuantidade(valoresDeEntrada);
		assertEquals(4, quantidadeDeValores);
	}

	@Test
	public void deveCalcularQuantidadeDeValoresTest4() {
		double valoresDeEntrada[] = { 9, 5, 8, 9, 7 };
		int quantidadeDeValores = EstatisticasSimples
				.calculaQuantidade(valoresDeEntrada);
		assertEquals(5, quantidadeDeValores);
	}

	@Test
	public void deveCalcularMediaDeDoisValores() {
		double valoresDeEntrada[] = { 9, 5 };
		double mediaDeValores = EstatisticasSimples
				.calculaMedia(valoresDeEntrada);
		assertEquals(7, mediaDeValores, 0);
	}

	@Test
	public void deveCalcularMediaDeTresValores() {
		double valoresDeEntrada[] = { 9, 5, 4 };
		double mediaDeValores = EstatisticasSimples
				.calculaMedia(valoresDeEntrada);
		assertEquals(6, mediaDeValores, 0);
	}

	@Test
	public void deveCalcularMediaDeQuatroValores() {
		double valoresDeEntrada[] = { 8, 4, 6, 6 };
		double mediaDeValores = EstatisticasSimples
				.calculaMedia(valoresDeEntrada);
		assertEquals(6, mediaDeValores, 0);
	}

	@Test
	public void deveCalcularMediaDeCincoValores() {
		double valoresDeEntrada[] = { 10, 5, 5, 10, 0 };
		double mediaDeValores = EstatisticasSimples
				.calculaMedia(valoresDeEntrada);
		assertEquals(6, mediaDeValores, 0);
	}

	@Test
	public void deveEfetuarTodosCalculosParaDoisValores() {
		double valoresDeEntrada[] = { 9, 5 };
		double valoresDeSaida[] = EstatisticasSimples.calcula(valoresDeEntrada);
		assertArrayEquals(new double[] { 5, 9, 2, 7 }, valoresDeSaida, 0);
	}

	@Test
	public void deveEfetuarTodosCalculosParaTresValores() {
		double valoresDeEntrada[] = { 9, 5, 4 };
		double valoresDeSaida[] = EstatisticasSimples.calcula(valoresDeEntrada);
		assertArrayEquals(new double[] { 4, 9, 3, 6 }, valoresDeSaida, 0);
	}

	@Test
	public void deveEfetuarTodosCalculosParaQuatroValores() {
		double valoresDeEntrada[] = { 9, 5, 4, 2 };
		double valoresDeSaida[] = EstatisticasSimples.calcula(valoresDeEntrada);
		assertArrayEquals(new double[] { 2, 9, 4, 5 }, valoresDeSaida, 0);
	}

	@Test
	public void deveEfetuarTodosCalculosParaCincoValores() {
		double valoresDeEntrada[] = { 9, 5, 4, 2, 10 };
		double valoresDeSaida[] = EstatisticasSimples.calcula(valoresDeEntrada);
		assertArrayEquals(new double[] { 2, 10, 5, 6 }, valoresDeSaida, 0);
	}
}