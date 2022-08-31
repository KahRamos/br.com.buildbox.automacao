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

  @fullSmoke
  @validarcadastro
  @validarsemnome
  Cenario: Efetuar cadastro com campo nome vazio
    Dado que o campo de nome não foi preenchido
    Quando clica no botao de confirmacao
    Entao uma mensagem vermelha aparece em cada campo para ser preenchido

  @fullSmoke
  @validarcadastro
  @validarsemcpf
  Cenario: Preenchimento Campo Cpf
    Dado preenche o campo com Cpf inexistente
    Quando clica no botao de confirmacao
    Entao mensagem de erro aparece

  @fullSmoke
  @validarcadastro
  @validarcpferrado
  Cenario: Preenchimento de Cpf invalido
    Dado preenche o CPF fora do padrao
    Quando clica no botao de confirmacao
    Entao mensagem de erro aparece

  @fullSmoke
  @validarcadastro
  @validarsememail
  Cenario: Preenchimento Campo email
    Dado preenche o campo com email invalido
    Quando clica no botao de confirmacao
    Entao mensagem de erro aparece

  @fullSmoke
  @validarcadastro
  @validarsemtelefone
  Cenario: Preenchimento Numero de telefone
    Dado preenche o campo com numero de telefone inexistente
    Quando clica no botao de confirmacao
    Entao mensagem de erro aparece

  @fullSmoke
  @validarcadastro
  @validartelefoneerrado
  Cenario: Preenchimento de Telefone invalido
    Dado preenche o numero de telefone invalido
    Quando clica no botao de confirmacao
    Entao mensagem de erro aparece

  @fullSmoke
  @validarcadastro
  @validarcampoentrega
  Cenario: Campo de metodo de entrega
    Dado selecionado todas as opcoes de entrega
    Quando clica no botao de cadastro
    Entao uma mensagem de erro para selecionar somente uma opcao
