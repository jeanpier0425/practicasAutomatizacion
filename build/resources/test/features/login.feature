#language: es

Característica:  Realizar login en la pagina
  Yo como usuario
  Quiero realizar un login
  Para realizar una compra

  Esquema del escenario: : Realizar un login
    Dado El usuario abre la pagina
    Cuando El usuario se loguea con los datos <EmailAddress> y <Password>
    Entonces El login debe ser exitoso

    Ejemplos:
      | EmailAddress           | Password  |
      | leider2021@yopmail.com | 987654321 |