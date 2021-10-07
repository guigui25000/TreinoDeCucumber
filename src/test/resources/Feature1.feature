#language: pt
  @CalculadoraTeste
  Funcionalidade: Calcular

    Cenario: Somar dois numeros
      Dado Uma Calculadora
      Quando Somar 5 e 5
      Entao O resultado deve ser 10

    Cenario: Multiplicar dois numeros
      Quando Multiplicar 5 e 5
      Entao O resultado da mult deve ser 25