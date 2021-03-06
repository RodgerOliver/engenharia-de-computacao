---
redirect_from: "/1-semestre/linguagem-de-programacao-1/"
---

# [Home](/engenharia-de-computacao/)

# Algoritmos e Linguagem de Programação ( C ) - Prof. Dr. Fernandes

[How Computer Works](https://homepage.cs.uri.edu/faculty/wolfe/book/Readings/Reading04.htm)

## Arquitetura Von Neumann

Máquina Sequencial Síncrona de Programa Armazenado na Memória

![Arquitetura Von Neumann](https://i.imgur.com/Z9BbmOd.jpg)

- **Memória**, para guardar instruções e dados.
- **CPU**, Control Unit + The Arithmetic/Logic Unit (ALU)
- **Input**, dispositivos de entrada de comandos como teclado e mouse.
- **Output**, para mostrar o resultado.

## [Hierarquia de Memórias](http://www.di.ufpb.br/raimundo/Hierarquia/Hierarquia.html)

![Memory Hierarchy](https://i.imgur.com/zGvuoqx.jpg)

## Bases Numéricas

O computador só trabalha com código binário.

Base 10 | Base 2
----- | -----
10 dígitos (0-9) | 2 dígitos (0-1)

10¹ | 10² | 10⁰
----- | ----- | -----
2 | 5 | 7

2² | 2¹ | 2⁰
----- | ----- | -----
0 | 1 | 1

## Como o computador...

**10110100** - cada número é um **bit** e 8 bits fazem um **byte**.

**KB = kilobyte = 2^10 = 1024**

### Representa Números

- **Inteiros**: 9 = 1001
- **Flutuantes**: 3.14 = 0.314 x 10^1
- **Negativos**: Sign-Magnitude, se o primeiro bit é 0 é positivo, caso contrário, o número é negativo.
+5 = 00101; -3 = 10011

### Representa Caracteres

A tabela ASCII é usada para converter números em caracteres, números quais são convertidos do binário para o decimal e comparados com a tabela ASCII para saber qual caracter ele representa.

### Diferencia Source Code e Compiled Code

Existem várias maneiras, porém a mais comum é separar um espaço na memória para colocar o código, e outro espaço para colocar o executável.

## Language Processors

Transformam Source Code (código escrito em uma determinada linguagem) em Machine Code (código entendido pela máquina, binário).

Existem dois tipos:

- **Compiladores**: convertem o código inteiro para então executá-lo de uma vez.
- **Interpretadores**: convertem e executam uma linha de código por vez.

Exemplos de **linguagens compiladas** são **Java, Scala e Perl**.

Exemplos de **linguagens interpretadas** são **Python, JavaScript e C++**.

## [Níveis de Linguagens de Programação](https://thebittheories.com/levels-of-programming-languages-b6a38a68c0f2)

A máquina entende somente sua língua (Machine Language), que é o binário, e nada mais, assim a única maneira para executar fazer com que ela execute comandos é programar em binário, porém outras maneiras mais próximas a língua humana surgiram para facilitar o processo.

![Levels of Programming Languages](https://i.imgur.com/vug5zbL.jpg)

**Low Level Languages**, ou linguagens de baixo nível, são as linguagens mais próximas do hardware. Elas são diretamente executáveis, oferecem completo controle sobre a memória e os registros, são eficientes e rápidas e recomendadas para OS e firmware. Porém são difíceis de se utilizar e o tempo de desenvolvimento de um software é muito maior. Exemplos de Low Level Languages são: **Assembly e Machine Code.**

Para otimizar o processo de programação foram criadas as **High Level Languages** que são mais próximas a linguagem humana, permitindo uma rápida compreensão do código escrito por qualquer um. Elas são fáceis de ser utilizadas, é abstrata, independem da arquitetura da máquina e não é necessário se preocupar com manuseio de memória ou registros, além de facilitarem a manutenção do código. Exemplos de High Level Languages são: **Java, PHP, C# e Swift.**

![Language Level and Processors](https://i.imgur.com/Lssbr0z.jpg)

## CPU Cycle

CPUs executam instruções em 4 passos.

- **Instruction Time (I-time)**
  - **Fetch**: a CPU busca a instrução na memória.
  - **Decode**: a instrução é "quebrada" em comandos lógicos e aritméticos.
- **Execution Time (E-time)**
  - **Execute**: a ALU executa as instruções.
  - **Store**: a ALU guarda o resultado na memória no nos registros.

O número de instruções executados em um ciclo é variável, mas o número de ciclos que leva para executar uma instrução é fixo.

A velocidade da CPU não é medida por CPU Cycles, mas sim por Clock Cycles. Cada Clock Cycle executa um ou mais CPU Cycles.

- Clock Cycles = ticks por segundo.
- Um ou mais CPU Cycles por Clock Cycle.
- A velocidade da CPU é medida em Clock Cycles.

## Linguagem C

Arquivos desta aula estão em `1-semestre/disciplinas/c/`.

## Prova

- Usos do zero
- Protótipos
- Passagem de params para funcao
- Variaveis simples
- Vetores e strings
- Strings
- Vetores

## Introdução

> Algoritmos e informação

> Racional = p/q

- Computação Digital
- Algoritmo
- Elementos básicos
- Linguagem C
- Caracteres
- Esqueleto de programação
- Exemplos

## Elementos Básicos

### Programação estruturada usando C

Existem estruturas com 1 pto de entrada e 1 pto de saída.

Programas resolvem problemas manipulando informação.

- Trazer info para dentro do computador
- Arranjar lugar pro armazenar a info
- Dar instruções para resolver o problema manipulando a informação
- Restituir resultado ao usuário

#### Organização das instruções

- Algumas são executadas quando uma condição ou conjunto de instruções é verdadeiro.
- algumas são repetidas um determinado número de vezes.
- Algumas são quebradas em parte que são executadas várias vezes p/ programa.

### Sete elementos básicos

- Entrada
- Tipo de dados
- Operadores / Operações
- Saída
- Instrução de repetição
- Instrução de desvio / Decisão
- Sub-rotinas / Funções

### Características Da Linguagem C

- Médio nível
- Estrutura de dados de alto nivel
- Manipulação de bits e bytes
- Rápida, flexível
- Altamente portável
- Sobrecarga de operadores
- Precedência Esq-Dir e Dir-Esq
- Zero
- Início de contagem
  - 1° índice do array
  - Valor lógico para falso (verdadeiro = valor diferente de zero)
  - Sentinela de final de string (cadeia de caracteres)
- Indicação de ponteiro nulo ( = endereço inválido de memória)

## Linguagem C

Operador ternário (condicional)

```
int max = (a>b)? a : b;
a = int(b)
```

Onde estão as libs?

Protótipo da função = `double sin(double value);`

Qnd o protótipo da função é referenciada antes do `main()`, a função em si pode estar em qualquer lugar do código.

Na chamada da função uma área de memória é criada para suas variáveis, após a sua finalização essa área é destruída.

```
void swap(int *a, int *b) { }
* Operador de referenciação.
swap(&x, &y);
```

`static int v = 1;`

Static representa q a função pode ser somente visará dentro da função, e q após sua finalização ela não é destruída.

Em dois arquivos com a mesma variável `g` com o mesmo valor, em um arquivo está presente a definição e no outro a declaração. A declaração pode estar presente em vários arquivos, mas a definição pode estar presente em somente um arquivo.

- Definição: int g = 1;
- Declaração: extern int g;
