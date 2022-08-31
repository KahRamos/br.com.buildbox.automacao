#language: pt

Funcionalidade: Validar cadastro

  @fullSmoke
  @validarcadastro
  @validarefetuarcadastro
  Cenario: Efetuar cadastro
    Dado preenchido o cadastro corretamente
    Quando clica no botao de confirmacao
    Entao abre uma mensagem de confirmação

  @fullSmoke
  @validarcadastro
  @validarcamposvazios
  Cenario: Efetuar cadastro com os campos vazios
    Dado que nenhum campo foi preenchido
    Quando clica no botao de confirmacao
    Entao uma mensagem vermelha aparece em cada campo para ser preenchido

