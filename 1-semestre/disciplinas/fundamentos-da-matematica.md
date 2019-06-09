---
redirect_from: "/1-semestre/fundamentos-da-matematica/"
---

# [Home](/engenharia-da-computacao/)

# Fundamentos da Matemática - Prof. Eurico

**Notas**
- `x² + 5x + 3`          expressão algébrica
- `x² + 5x + 3 = 0`      equação
- `f(x) = x² + 5x + 3`   função

## [Conjuntos Numéricos](https://www.todamateria.com.br/conjuntos-numericos/)

> `*` representa que o conjunto não possui o elemento nulo, o *0*.

Todos os conjuntos possuem seus subconjuntos.

### Números Naturais ( N )

Esse conjunto possui números sem vírgula (inteiros) e positivos. Nele cada elemento é igual ao número antecessor somado a um, exceto o *0*. A função desse conjunto é contar e ordenar.

**Exemplos**

- `N = { ..., 0, 1, 2, 3, 4, 5, ... }`
- `N* = { ..., 1, 2, 3, 4, 5, ... }`

### Números Inteiros ( Z )

Esse conjunto possui números positivos e negativos. Os números que estão à mesma distância do *0* são chamados de opostos ou simétricos.

![Reta Numérica Inteiros](https://i.imgur.com/Db4XkiM.jpg)

**Exemplos**

- `Z = { ..., -3, -2, -1, 0, 1, 2, 3, ... }`
- `Z* = { ..., -3, -2, -1, 1, 2, 3, ... }`

### Números Racionais ( Q )

> A letra que representa o conjunto dos números racionais, ou seja, o "Q" é derivado da palavra inglesa "quotient", que significa quociente.

Esse conjunto possui números que podem ser colocados na forma de fração *p/q*, sendo *p* e *q* inteiros e *q* diferente de *0*.

**Exemplo**

- `Q = { 0, ±1, ±1/2, ±1/3, ..., ±2, ±2/3, ±2/5, ..., ±3, ±3/2, ±3/4, ... }`

### Números Irracionais ( I )

Esse conjunto possui números que não são exatos.

**Exemplo**

- `I = { ..., -√2, 0, 1/2, 1, √2, √3, π, e , ... }`

### Números Reais ( R )

> A representação dos números é correspondente ao número de ângulos contidos neles.

Esse conjunto é formado pelos números racionais e irracionais.

![Diagrama dos Conjuntos Numéricos](https://i.imgur.com/RpWxUgG.jpg)

### Intervalos Numéricos

Os intervalos são subconjuntos dos números reais.

#### Relação de Ordem

- `a = b`
- `c > d`
- `e < f`

#### Tipos de Intervalos

##### Intervalo Aberto

![Intervalo Aberto](https://i.imgur.com/RG9dyPA.jpg)

##### Intervalo Fechado

![Intervalo Aberto](https://i.imgur.com/0Un15mi.jpg)

##### Intervalo Semi-aberto à Direita

![Intervalo Semi-aberto à Direita](https://i.imgur.com/gQCNjKE.jpg)

##### Intervalo Semi-aberto à Esquerda

![Intervalo Semi-aberto à Esquerda](https://i.imgur.com/je1wc5y.jpg)

##### Intervalos Infinitos

![Intervalo Infinitos](https://i.imgur.com/OTcf5xN.jpg)


#### Representação Algébrica

- Conjunto
  - `{ x ∈ R | 2 < x < 4 }`
- Intervalo
  - `] 2, 4 [` ou `) 2, 4 (`
- Os números pode ser separados por vírgulas (`,`) ou ponto e vírgula (`;`).

## Dízimas Periódicas

Uma dízima periódica é um número racional onde existe uma repetição infinita de um ou mais algarismos em grupo, ordenados, sempre na mesma posição, chamado de **período**. A parte que está entre a vírgula e o período é chamada de **não período**.

- **Dízimas periódicas simples**
  - `0,8888...`
  - `1,232323...`
- **Dízimas periódicas compostas**
  - `0,3424242...`
  - `1,730898989...`

### Geratriz de Dízimas Periódicas

A geratriz de uma dízima é a sua representação na forma de fração.

Para fazer a transformação da dízima `0,1444...`:

- Determine `x` como a dízima com somente o período após a vírgula.
  - `10x = 1,444...`
- Passe um período da dízima para antes da vírgula.
  - `100x = 14,444...`
- Faça a subtração das expressões.
  - `90x = 13`
- Isole o `x`.
  - `x = 13/90`

Outra forma de fazer a transformação:

`n/d`

- Dízima simples
  - `n` é o período.
  - `d` é tantos *noves* quantos forem os números de algarismos do período.
  - `0,373737... = 37/99`
- Dízima composta
  - `n` = parte não periódica seguida do período menos a parte não periódica.
  - `d` = tantos *noves* quantos forem os algarismos do período seguidos de tantos *zeros* quantos forem os algarismos da parte não periódica após a vírgula.
  - `0,1252525... = 125-1/990 = 124/990`
  - `12,477777... = 1247-124/9000 = 1123/90`

## Produtos Notáveis

> `-5² = -25`

> `(-5)² = 25`

Os produtos notáveis são multiplicações em que os fatores são polinômios, e são transformadas em soma e subtração. Eles servem para facilitar cálculos e poupar trabalho.

1. `(a+b).(a-b) = a²-b²`
2. `(a+b)² = a² + 2ab + b²`
3. `(a-b)² = a² - 2ab + b²`
4. `(a+b)³ = a³ + 3a²b + 3ab² + b³`
5. `(a-b)³ = a³ - 3a²b + 3ab² - b³`
6. `(a+b+c)² = a² + b² + c² + 2(ab + ac + bc)`

### Produtos Especiais

7. `(a-b) (a² + ab + b²) = a³-b³`
8. `(a+b) (a² - ab + b²) = a³+b³`

## Fatoração

Fatorar significa transformar soma e subtração em multiplicação. Seu propósito é facilitar a expressão algébrica.

### Fator Comum

Expressão algébrica formada por parcelas, sendo que um mesmo fator sempre aparece em todas elas.

**Exemplo**

- `ax + bx = x(a+b)`

### Agrupamento

Em geral acontece com 4 entes matemáticos e não existe um fator comum único. Chama-se agrupamento pois é agrupado em "pedaços" que tem um fator comum.

**Exemplo**

- `mx + px + my + py = x(m + p) + y(m + p) = (x + y).(m + p)`

### Diferença de Dois Quadrados

`a²-b² = (a+b)(a-b)`

### Trinômio Quadrado Perfeito

**Exemplos**

- `a² + 2ab + b² = (a+b)²`
- `a² - 2ab + b² = (a-b)²`

### Trinômio do 2° Grau

**Exemplo**

- `ax² + bx + c = a(x-x¹*)(x-x²*)`

Onde x¹\* e x²\* são as  raízes (resultado da equação de 2° grau).

**Exemplo**

`x² - 6x + 8`

- `p  = 8`
- `s = -6`
- `2x4 = 8`
- `2+4 = 6`
- `x¹* = 2 e x²* = 6`

### Diferença e Soma de Cubos

- `a³-b³ = (a-b)(a²+ab+b²)`
- `a³+b³ = (a+b)(a²-ab+b²)`

## Forçar o Aparecimento do Trinómio Quadrado Perfeito

- `x² + 2x + 5`
- Raiz do primeiro termo e divisão do segundo termo por `2x`, tudo ao quadrado.
- `(x+1)²`
- `x² + 2x + 1²`
- Subtração do número sem `x` do trinômio (1), pelo número sem `x` da equação original (5).
- `x² + 2x + 1 + 4`
- Raiz do último número ao quadrado.
- `(x+1)² + (√4)²`
- `(x+1)² + 2²`

## Simplificação de Frações Algébricas

Frações algébricas são aquelas que possuem como numerador e denominador expressões algébricas.

Utilize as técnicas de simplificação e fatoração para simplificá-las.

## Divisão de Polinómios (Método da Chave)

![Divisão de Polinómios](https://i.imgur.com/UUvMjQP.jpg)

## Frações Parciais

Transforma uma fração algébrica em uma soma de frações.

![Frações Parciais](https://i.imgur.com/VFLkpzS.jpg)

Existe uma maneira de otimizar esse processo.

- Descubra os valores de `x` que zeram um dos fatores que está como denominador do primeiro passo, neste caso `x=-2` e `x=2`.
- Quando chegar no terceiro passo, faça a equação substituindo o valor de `x` por cada um dos valores encontrados.

## Potenciação

![Tipos de Potenciação](https://i.imgur.com/PIBKva7.jpg)

## Notação Científica

- 139500		= 1,395 x 10⁵
- 0,0000056	= 5,6 x 10⁻⁶

## Radiciação

> Radiciação é a operação inversa da potenciação.

![Radiciação](https://i.imgur.com/lOieZuM.jpg)

![Radiciação Propriedades](https://i.imgur.com/jk5g3bM.jpg)

Potência com expoente fracionário torna-se uma raiz, onde o índice é o denominador e o expoente do radicando é o numerador.

### Racionalização

> Conjugado de `(a + b)` é `(a - b)`

Quando existe uma raiz no denominador de um fração, a mesma é racionalizada para remover a raiz.

Se for uma raiz sozinha, multiplica-se os dois lados pela raiz. Se for uma expressão com uma raiz,
multiplica-se os dois lados pelo conjugado do denominador.

## Equações Algébricas

### Equação de 1º Grau

`a.x + b = 0`

Para resolver basta isolar o `x`.

### Equação de 2º Grau

`a.x² + b.x + c = 0`

Para resolver pode ser usado a fórmula de Bhaskara ou o médoto de Soma e Produto.

#### Bhaskara

- `x = (-b ± √Δ)/2.a`
- `Δ = b² -4.a.c`

#### Soma e Produto

- Quando `a = 1`.
- `x² - sx + p`.
- p = produto dos fatores de `p`.
- s = soma dos números que multiplicados resultam em `p` com o sinal do `s` invertido.

### Equações Irracionais

A equação é Irracional se a incognita for elavada a um expoente fracionário.

- `√(x+2) = 4`
- `(√(x+2))² = 4²`
- `x+2 = 16`
- `x = 14`

Então é feita a **verificação**

- `√(14+2) = 4`
- `√(16) = 4`
- `4 = 4`

### Equação Biquadrada

![Equação Biquadrada](https://i.imgur.com/byUKGeN.jpg)

## Relações Métricas e Trigonométricas no Triângulo Retângulo

> Diagonal do quadrado = l√2

> μ = unidade de comprimento geral

> adjacente = do lado

### Relações Métricas no Triângulo Retângulo

![Relações Métricas no Triângulo Retângulo](https://i.imgur.com/jgqZpfe.jpg)

### Relações Trigonométricas no Triângulo Retângulo

![Relações Trigonométricas no Triângulo Retângulo](https://i.imgur.com/p3NWzp8.jpg)

### Arco Notáveis

![Arco Notáveis](https://i.imgur.com/zGviPj1.jpg)

### Lei Dos Senos

![Lei Dos Senos](https://i.imgur.com/HENGxNI.jpg)

### Lei Dos Cossenos

![Lei Dos Cossenos](https://i.imgur.com/SfrMFlR.jpg)

## Áreas

Anotações na apostila.
