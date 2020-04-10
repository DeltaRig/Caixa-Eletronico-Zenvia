# Desafio Caixa Eletrônico

Desenvolvedora: [Daniela Rigoli](https://www.linkedin.com/in/daniela-rigoli-304b9b190/)
Descrição do desafio: [DojoPuzzels.com](http://dojopuzzles.com/problemas/exibe/caixa-eletronico/)

## Solução

Foram feitas duas classes, _Main_ e _Caixa_, onde a classe _Main_ verifica se o valor enviado para ser sacado é viavel, ou seja, um número inteiro, positivo e divisível por 10 que é a menor nota que esse caixa eletrôico devolve. Além disso a classe _Main_ também retorna uma mensagem caso o valor digitado não seja viavel para efetuar o saque o porque não é possível ser realizado. E a classe _Caixa_ verifica quantas notas de cada tipo serão necessárias para o saque.

A solução para o cálculo foi baseada no fato de que quando for divido o valor do saque (ou o que ainda falta ser sacado) pelo valor o resultado é quantas notas cabem dentro desse valor. E o calculo do resto da divisão é equivalente ao valor do saque que ainda se tem para distribuir para as outras notas.

Exemplos de valores para serem sacados:

* Valor do saque: R$20,00 - Resultado esperado: Entregar 1 nota(s) de R$20,00.
* Valor do saque: R$35,00 - Não trabalhamos com notas menores do que a de R$10,00 e para esse saque seria necessário.
* Valor do saque: R$1840 - Resultado esperado: Entregar 18 nota(s) de R$100,00 2 nota(s) de R$20,00.
* Valor do saque: R$3280,00 - Resultado esperado: Entregar 32 nota(s) de R$100,00 1 nota(s) de R$50,00 1 nota(s) de R$20,00  e 1 nota(s) de R$10,00.

## Para Executar

Executar o comando abaixo no diretório _dist_
```
java -jar "Zenvia.jar"
```

## Testes Unitários
Foi utilizado JUnit, aplicando a comparação de arrays para verificar o resultado da classe _Caixa_.

