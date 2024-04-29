#language: es

Característica: Deposito exitoso

  @TEST1
  Esquema del escenario:
    Dado que el cliente Harry Potter se autentica en el banco
    Cuando seleccione la cuenta con numero "<Cuenta>"

    Entonces realizara un deposito de "<Valor>" rupias exitosamente

    Ejemplos:
      | Cuenta | Valor |
      | 1006 | 100 |
      | 1005 | 200 |
      | 1004 | 300 |

#debe ser dinamico


