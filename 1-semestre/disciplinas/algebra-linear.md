---
redirect_from: "/1-semestre/algebra-linear/"
---

# [Home](/engenharia-de-computacao/)

# Álgebra Linear - Prof. Alexandre

## Vetores

Vetores são conjuntos de segmentos orientados equipolentes (independem do espaço) ao vetor AB e para existir necessita de módulo (tamanho), direção (angulação) e sentido (pontos cardeais).

A representação dos vetores é feita por uma letra e uma flecha em cima da letra, ou em forma de par ordenado, sendo uma letra, ou duas com uma reta em cima, igual ao par ordenado que corresponde ao vetor.

### Tipos de Vetores

- Vetores Iguais
  - Possuem módulo, direção e sentido iguais.
- Vetores paralelos (Colineares)
  - Possuem mesma direção.
- Vetores Opostos
  - Possuem módulo e direção iguais mas sentidos diferentes.
- Vetores Nulos
  - Não possuem módulo, direção e sentido.
- Vetores Unitários
  - Possuem módulo igual a uma unidade.
- Versor de um vetor
  - São vetores unitários que determinam sentido e direção de outros vetores.
- Vetores Coplanares
  - Pertencem ao mesmo plano.
  - Dois vetores sempre serão coplanares.

## Operações com Vetores

> Em um paralelogramo, a **soma dos ângulos adjacentes é 180°** e os **ângulos opostos são sempre iguais**. A soma dos ângulos internos do paralelogramo é 360°.

### Adição

> `0° < θ < 90° → S > D`

> `90° < θ < 180° → S < D`

`S = U + V`

![Soma de Vetores](https://i.imgur.com/W1TWd6A.jpg)

A esquerda a soma foi feita pelo método do paralelogramo, e a direita pelo método do polígono.

`V1 = v; V2 = u; Vs = s;`

- **Método do paralelogramo:** `|s|² = |u|² + |v|² - 2.|u|.|v|. cos(u, v')`
- **Método do polígono:** `|s|² = |u|² + |v|² - 2.|u|.|v|. cos(v, u)`

Nota-se que o método do paralelogramo utiliza o cosseno do **ângulo oposto** a reta resultante, e o método do polígono usa a cosseno do **ângulo superior oposto** a reta resultante.

### Diferença

`D = U - V = U + (-V)`

![Diferença de Vetores](https://i.imgur.com/miFRSQ3.jpg)

**Método do paralelogramo:** `|d|² = |u|² + |v|² - 2.|u|.|v|. cos(v, u)`

- **Método do polígono:** o vetor negativo deve trocar de sentido, então é feita a "soma" comum.
- **Método do paralelogramo:**  o vetor negativo também tem o seu sentido trocado, e o vetor resultante tem origem na intercessão dos vetores originais e fim na intercessão dos vetores espelho.
- **Outro:** os dois vetores são representados com sinal positivo e tem a mesma origem, e o vetor resultante tem origem no vetor com sinal negativo e extremidade no vetor com sinal positivo.

### Multiplicação Por Uma Escalar

Na multiplicação por uma escalar o vetor é `v` e a escalar é `k`, seu produto é `p`, sendo `p = k.v`. Se `k > 0` o vetor `v` possui mesma direção e sentido. se `k < 0` o vetor `v` possui direção e sentido opostos.

## Plano Cartesiano

![Quadrantes](https://i.imgur.com/rCKdjEU.jpg)

### Vetores no Plano R²

> `R² = RxR = {(x,y) ∈ R² / x,y ∈ R}`

> `R²` significa um plano `R` com duas dimensões.

O vetor `AB` está em qualquer espaço do plano, porém ele pode ser representado com uma origem `O = (0,0)` e `P = (x,y)`

- `OP = AB`
- `A = (1,3)` = representação de ponto.
- `B = (4,4)`
- `OP = B - A`
- `OP = (xb,yb) - (xa,ya)`
- `OP = (xb-xa, yb-ya)`
- `OP = (3,1)` = representação de vetor na forma de pontos ordenados.
- `OP = 3i + 1j`

- **Versores no R² (Bases Canônicas)**
  - Possuem sua origem em `(0,0)`
  - `i = (1,0)`
  - `j = (0,1)`

### Vetores no Plano R³

> R³ = RxRxR = {(x,y,z) ∈ R³ / x,y,z ∈ R}

- **Eixo x:** eixo das abscissas.
- **Eixo y:** eixo das ordenadas.
- **Eixo z:** eixo das cotas.

- `OP = (xb, yb, zb) - (xa, ya, za)`

- Versores no R³ (Bases Canônicas)
  - `i = (1,0,0)`
  - `j = (0,1,0)`
  - `k = (0,0,1)`

### Combinação Linear

A combinação linear é usada para representar como vetor como a soma de outros dois, em outras palavras, escrever um vetor na função de outros.

- `u = a.v1 + b.v2 + c.v3 ...`

**Exemplo**

Escreva o vetor `u` como combinação linear dos vetores `v` e `w`.

- `u = (7,1)`
- `v = (5,-2)`
- `w = (2,3)`
- `u = a.v + b.w`
- `(7,1) = a(5,-2) + b(2,3)`
- `(7,1) = (5a,-2a) + (2b,3b)`
- `(7,1) = (5a+2b, -2a+3b)`
- 
```
    7 = 5a + 2b
    1 = -2a + 3b
```
- `a = 1; b = 2`
- `u = 1.v + 2.w`

## Sistemas de Equações

> Representação: ...}

### Método da Substituição

Esse método consiste em escolher uma das equações e isolarmos uma das incógnitas, para determinar o seu valor em relação a outra incógnita. Depois, substituímos esse valor na outra equação.

![Sistemas Substituição](https://i.imgur.com/uSV5srx.jpg)

### Método da Adição

No método da adição buscamos juntar as duas equações em uma única equação, eliminando uma das incógnitas. Para isso, é necessário que os coeficientes de uma das incógnitas sejam opostos, isto é, devem ter o mesmo valor e sinais contrários.

![Sistemas Adição](https://i.imgur.com/ttYLPwZ.jpg)

## Regra de Cramer

Método para resolver sistemas lineares.

![Regra de Cramer](https://i.imgur.com/BXdYFYF.jpg)

## Matrizes

> Representação: [] ou ()

> Diagonal principal: i=j

Matriz é uma tabela de ordem `mxn`.

- m:		número de linhas.
- n:		número de colunas.
- aij:	elementos da matriz.
- i:		posição da linha.
- j:		posição da coluna.
- mxn:	ordem da matriz.
- A:		matriz.

### Adição e Subtração de Matrizes

Pode ser feita somente com matrizes de mesma ordem.

A(aij)mxn ± B(aij)mxn = C(aij)mxn

### Multiplicação de Matrizes

> Escalar é um número que aumenta ou diminui algo.

O produto de uma escalar por uma matriz tem como resultado todos os elementos da matriz multiplicados pela escalar.

A multiplicação entre matrizes ocorre da seguinte maneira: `Amxn . Bnxp = Cmxp`.

![Multiplicação de Matrizes](https://i.imgur.com/tOEvP8O.png)

### Matriz Transposta

A(aij)mxn = At(aji)nxm

### Matriz Identidade

In = aij = {1, se i=j; 0, se i≠j

### Matriz Inversa de Ordem 2

> (3) oposto (-3)

> (3) inverso (3⁻¹)

An . An⁻¹ = In

### Matriz Inversa de Ordem 3 ou Superior

**Métodos**: Matriz Aumentada, Matriz Adjunta, Sistemas de Equações (escalonamento).

#### Matriz Adjunta

`A⁻¹ = Adj(A)/Det(A)`

## Determinante de Matriz

> Representação: | |

Determinante é o número associado a uma matriz quadrada.

### Segunda Ordem

![Determinante Matriz 2x2](https://i.imgur.com/deKSrEV.jpg)

### Terceira Ordem (Regra de Sarrus)

![Determinante Matriz 3x3](https://i.imgur.com/jCkQpje.jpg)

### Menor Complementar

![Menor Complementar](https://i.imgur.com/XKRyM9S.jpg)

`MC23` retira-se a **linha 2** e a **coluna 3**, que resulta na determinante dos elementos faltantes.

### Cofator

`Aij = (-1)^i+j x MCij`

A matriz transposta dos cofatores de uma determinada matriz é chamada de **matriz adjunta**.

### Teorema de Laplace

A somatória da multiplicação de todos os elementos de uma determinada fila de uma matriz multiplicados
pelos seus respectivos cofatores resulta na determinante da mesma.

### Regra de Chió

![Regra de Chió](https://i.imgur.com/cSqvkLf.jpg)

## Vetores - Produto Escalar

- **Representação**: `u . v` ou `< u, v >`
- `u . v = (x, y, z) . (a, b, c)`
- `u . v = xa + yb + zc`

### Módulo de um Vetor

> `λu = u/|u|`

- `|u|² = u . u`
- `|u|² = (x, y, z) . (x, y, z)`
- `|u|² = x² + y² + z²`

### Interpretação Geométrica

- `u . v = |u| . |v| . cosθ` 0º ≤ θ < 180º
- `u . v > 0` ↔  0º ≤ θ < 90º
- `u . v = 0` ↔  θ = 90º
- `u . v < 0` ↔  90º < θ < 180º
