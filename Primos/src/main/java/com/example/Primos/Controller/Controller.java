package com.example.Primos.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Models.Numeros;

@RestController
public class Controller {
		public int CalculoMMC(@RequestBody Numeros numeros) {
			 int nu1 = numeros.getNu1();
		        int nu2 = numeros.getNu2();
		        return CalculoMMC(nu1, nu2);
			
		}
		   private int CalculoMMC(int nu1, int nu2) {
		        return (nu1 * nu2) / calcularMDC(nu1, nu2);
		    }

		    private int calcularMDC(int nu1, int nu2) {
		        while (nu2 != 0) {
		            int temp = nu2;
		            nu2 = nu1 % nu2;
		            nu1 = temp;
		        }
		        return nu1;
		    }
		    public String verificarPrimo(@PathVariable int numero) {
		        if (numero <= 1) {
		            return "O número não é primo.";
		        }
		        for (int i = 2; i <= Math.sqrt(numero); i++) {
		            if (numero % i == 0) {
		                return "O número  não é primo.";
		            }
		        }
		        return "O número  é primo.";
		    }
}
