package pe.edu.idat.demo_apirest.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.idat.demo_apirest.model.APIResponse;
import pe.edu.idat.demo_apirest.service.IFundamentosService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/fundamentos")
public class FundamentosController {

    private final IFundamentosService iFundamentosService;


    @GetMapping("/ejercicio1")
    public String ejercicio1() {
        return "Hola Mundo REST";
    }

    @GetMapping("/primo")
    public ResponseEntity<APIResponse<String>>
        validarPrimo(@RequestParam int numero){
        String respuesta = iFundamentosService
                .validarNumeroPrimo(numero);
        return ResponseEntity.ok(
                APIResponse.<String>builder()
                        .data(respuesta)
                        .mensaje("Ejercicio ejecutado correctamente")
                .build()
        );
    }

    @GetMapping("/factorial")
    public ResponseEntity<APIResponse<String>>
    factorial(@RequestParam int numero){
        String respuesta = iFundamentosService
                .calcularFactorial(numero);
        return ResponseEntity.ok(
                APIResponse.<String>builder()
                        .data(respuesta)
                        .mensaje("Ejercicio ejecutado correctamente")
                        .build()
        );
    }

    @GetMapping("/fibonacci")
    public ResponseEntity<APIResponse<List<Integer>>>
    fibonacci(@RequestParam int numero){
        List<Integer> respuesta = iFundamentosService
                .calcularFibonacci(numero);

        return ResponseEntity.ok(
                APIResponse.<List<Integer>>builder()
                        .data(respuesta)
                        .mensaje("Ejercicio ejecutado correctamente")
                        .build()
        );
    }

}
