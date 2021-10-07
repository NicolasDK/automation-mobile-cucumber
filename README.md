# Automação mobile com cucumber

## Requisitos
- Java 8
- Appium 1.21.0
- Maven
- Android Emulador ou Device

## Executar Testes

### Pré-requisitos

1- Adicionar password app no arquivo "src\main\resources\dados.properties"

    password=password_app

### Execução

1 - Iniciar Appium (Foi utilizado appium desktop)

2 - Acessar diretorio projeto "src\main\java\runner\Runner.java"

3 - Executar com Junit

## Relátorio

Foi utilizado o relátorio html padrão disponibilizado pelo cucumber no diretório: "\report\report.html"

------------------------------------------------------------------------------------
## Resumo criação projeto

Os projeto foi criado utilizando:
- **Java 1.8** - Como a linguagem de programação, utilizando a versão mais utilizada onde o risco de incompatibilidade em outras maquinas é baixo.
- **Appium 1.20** - Para comunidação do projeto com o device (virtual ou fisico)
- **Cucumber** - Para o processamento dos casos de testes escritos com a linguagem GERKIN onde os casos de testes podem ser escritos de maneira fluida e de facil entendimento, podendo ser escrito ou entendido por pessoal que não possuem muito conhecimento tecnico do codigo 

Para a criação dos AppActions e steps foi utilizado o padrão de desenvolvimento de programação fluente (Fluent Builder Pattern), deixando o codigo mais humanizado facilitando o entendimento. Onde dentro do projeto os metodos retornam a propria classe e no momento de chamar esses metodos, desde que nomeados de acordo com a funcionalidade de forma clara, acaba criando como se fosse uma frase explicativa da ação que esta sendo executada.

Ao acessar o app não passamos pelo processo de autenticação, então utilizamos o app como um usuario anonimo onde não temos permissões para interagir com elementos que reflitam informações no banco de dados. Os testes foram criados considerando essa não permissão onde validamos a alteração da moeda utilizada entre EUR, USD, BTC e BRL e confirmamos na nossa carteira que a moeda não foi alterada, no outro cenário validamos que o preenchimento do formulário de endereço não pode ser salvo.