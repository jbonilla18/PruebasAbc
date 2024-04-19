#language: es

Característica: Deposito exitoso

@TEST1

  Escenario: Deposito en cuenta exitoso

    Dado que el cliente "Harry Potter" se autentica en el banco

    Cuando seleccione la cuenta con numero "1006"

    Entonces realizara un depósito de 100 rupias exitosamente



