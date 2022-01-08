# Projeto Final

Esse é o Plano de Testes do projeto Bubblesort(https://github.com/KeplerLeo/bubblesort) modificado para servir de base para o projeto final da disciplina de Validação e Verificação de Sistemas. 

<br/>

## Ferramentas

As seguintes ferramentas foram empregadas para esse projeto:

|   |Ferramenta|
|---|---|
|Integração contínua|Circle CI|
|Teste estático|PMD|
|Testes unitários|Junit|

<br/>

## Testes
<br/>

**1. Teste de Método Vazio**

Nome: testEmptyVector

Linhas: 51-54.

Objetivo do Teste: Garantir que o método de ordenação tenha tratamento ao utilizar um vetor vazio.

Técnica: Invocar o método e executar com um vetor vazio.

Critério de Finalização: O método funciona como projetado e sem apresentar erros.

<br/>

**2. Teste de Método com Apenas um Elemento**

Nome: testVectorWithAnElement

Linhas: 61-65.

Objetivo do Teste: Garantir que o método de ordenação não apresente erros mesmo com um vetor de apenas um elemento.

Técnica: Invocar o método e executar utilizando o vetor com apenas um elemento.

Critério de Finalização: O método funciona como projetado e sem apresentar erros.

<br/>

**3. Teste de Método em situação normal.**

Nome: testOrdering

Linhas: 72-77.

Objetivo do Teste: Garantir o funcionamento do método de ordenação com um vetor em situação normal.

Técnica: Invocar o método e executar utilizando o vetor com elementos aleatórios.

Critério de Finalização: O método funciona como projetado e sem apresentar erros

<br/>

**4. Teste de Método com números duplicados.**

Nome: testOrderingWithDuplicates

Linhas: 84-89.

Objetivo do Teste: Garantir o funcionamento do método de ordenação com números duplicados.

Técnica: Invocar o método e executar utilizando o vetor com elementos duplicados.

Critério de Finalização: O método funciona como projetado e sem apresentar erros

<br/>

**5. Teste de Método com números negativos.**

Nome: testOrderingWithNegativeValues

Linhas: 96-101.

Objetivo do Teste: Garantir o funcionamento do método de ordenação com números negativos.

Técnica: Invocar o método e executar utilizando o vetor com elementos negativos.

Critério de Finalização: O método funciona como projetado e sem apresentar erros

<br/>