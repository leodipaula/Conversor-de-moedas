# Conversor de moedas

##

### Este conversor faz o uso do console para converter moedas em tempo real, utilizando a API https://www.exchangerate-api.com/.

##

### Existem 6 opções de conversões, na qual 5 são pré definidas para só receber o valor da conversão; a última opção de conversão é personalizada e aceita que o usuário digite o código ISO das moedas + o valor de conversão.
#### **É preciso configurar uma variável de ambiente para a variável "apiToken" a receber e poder fazer a requisição.**

##

### Assim, as 6 opções são:

    [1] Real => Dólar americano
    [2] Real => Peso Argentino
    [3] Real => Euro
    [4] Real => Renmimbi (Yuan)
    [5] Real => Yen
    [6] Pesquisa personalizada

##

- Exemplo de pesquisa pré definida:


    ***********************************************
    Selecione uma dentre essas opções de conversões,
    digitando seu respectivo valor numérico:

    [1] Real => Dólar americano
    [2] Real => Peso Argentino
    [3] Real => Euro
    [4] Real => Renmimbi (Yuan)
    [5] Real => Yen
    [6] Pesquisa personalizada
    [7] Sair
    ***********************************************

    1
    Insira o valor para conversão:
    1
    0.1839
    Pressione Enter para continuar...

##

- Exemplo de pesquisa personalizada:


    - Exemplo de pesquisa pré definida:
    ***********************************************
    Selecione uma dentre essas opções de conversões,
    digitando seu respectivo valor numérico:

    [1] Real => Dólar americano
    [2] Real => Peso Argentino
    [3] Real => Euro
    [4] Real => Renmimbi (Yuan)
    [5] Real => Yen
    [6] Pesquisa personalizada
    [7] Sair
    ***********************************************

    6
    Insira o código ISO da moeda que deseja converter:
    JPY
    Insira o código ISO da moeda para base do valor de conversão:
    AUD
    Insira o valor para conversão:
    230
    217.534
    Pressione Enter para continuar...
##