# Introdução aos Testes Unitários com JUnit

Este guia fornece uma introdução simples aos testes unitários com o framework JUnit, usando exemplos de código em Java.

## O que são Testes Unitários?

Testes unitários são uma prática de desenvolvimento de software que envolve a verificação de unidades de código individuais (como métodos ou funções) para garantir que eles funcionem conforme o esperado. Os testes unitários ajudam a identificar erros e garantem que o código seja robusto e confiável.

## JUnit

JUnit é um dos frameworks mais populares para escrever testes unitários em Java. Ele fornece uma estrutura para escrever, organizar e executar testes de forma simples e eficiente.

## Estrutura de Diretórios

- Calculadora:
  - Arquivo da classe: `src/main/java/com/calculadora/Calculadora.java`
  - Arquivo de teste: `src/test/java/com/calculadora/CalculadoraTest.java`

- Sorteio:
  - Arquivo da classe: `src/main/java/com/Sorteio/Sorteio.java`
  - Arquivo de teste: `src/test/java/com/Sorteio/SorteioTest.java`


### Exemplo 1: Testes da Classe Calculadora

A classe de teste `CalculadoraTest` possui três métodos de teste: `testSomarPositivo`, `testSomarNegativo` e `testSomarPositivoNegativo`. Cada método de teste verifica um cenário diferente da soma usando a classe Calculadora. O método assertEquals é usado para comparar o resultado com o valor esperado. Se os resultados não corresponderem ao esperado, os testes falharão.

### Exemplo 2: Testes da Classe Sorteio

Na classe `SorteioTest`, foram criados testes unitários para verificar o comportamento da classe Sorteio, que é responsável por verificar se um bilhete é premiado com base em números sorteados.

**Configurações:**

- **setUp():** O método `setUp()` é anotado com `@BeforeAll`, o que significa que ele é executado antes de todos os testes. Neste método, são configurados os valores iniciais para os testes. Foi criada uma instância da classe Sorteio com números sorteados e um bilhete idêntico. Isso serve como um cenário em que o bilhete é premiado.

**Finalização:**

- **tearDown():** O método `tearDown()` é anotado com `@AfterAll`, indicando que ele é executado após todos os testes. Aqui, a instância da classe Sorteio é definida como null, limpando qualquer estado após a execução de todos os testes.

**Teste de Bilhete Premiado:**

- **testBilhetePremiado():** Este método é um teste unitário que verifica se um bilhete com números idênticos aos números sorteados é considerado premiado. Isso é feito chamando o método `verificarBilhete()` da instância sorteio e usando o método `assertEquals()` para comparar o resultado com a string `"Bilhete premiado!"`. Se os resultados forem iguais, o teste passa.

**Teste de Bilhete com Números Divergentes:**

- **testBilheteComNumerosDivergentes():** Este teste verifica se um bilhete com números diferentes dos números sorteados é considerado não premiado. Ele cria um novo bilhete com números diferentes, chama `getNumerosSorteados()` e usa `assertEquals()` para comparar o resultado com a string `"Não foi dessa vez!"`.

**Teste de Bilhete com Quantidade Menor:**

- **testBilheteComQuantidadeMenor():** Este teste verifica se um bilhete com uma quantidade menor de números do que a quantidade sorteada é considerado não premiado. Ele cria um novo bilhete com menos números, chama `getNumerosSorteados()` e usa `assertEquals()` para comparar o resultado com a string `"Não foi dessa vez!"`.
