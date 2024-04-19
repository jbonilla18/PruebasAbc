#language: es

Característica: Creacion de cuenta exitoso

  @TEST3

  Escenario: Crear Cuenta

    Dado  que el administrador ingresa al banco

    Cuando Cuando ingrese a la opción de "Open Account"

    Entonces creara una cuenta al cliente "Ron Weasly" de tipo "Dollar"
