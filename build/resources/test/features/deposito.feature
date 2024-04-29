#language: es

Característica: Deposito exitoso

  @TEST1
  Esquema del escenario:
    Dado que el cliente Harry Potter se autentica en el banco
    Cuando seleccione la cuenta con numero <Valor>
    #Entonces realizara un deposito de "<Valor>" rupias exitosamente

    Ejemplos:
      | Valor |
      | 0     |
      | 1     |
      | 2     |




