package pe.edu.idat.demo_apirest.service;

import java.util.List;

public interface IFundamentosService {

    String validarNumeroPrimo(int numero);

    String calcularFactorial(int numero);

    List<Integer> calcularFibonacci(int numero);
}
