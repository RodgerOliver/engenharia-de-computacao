---
redirect_from: "/1-semestre/matematica-discreta/"
---

# [Home](/engenharia-de-computacao/)

# Matemática Discreta - Prof. Ana Clara

## Apresentação

> Matemática discreta estuda ponto a ponto sobre conceitos da matemática.

Ela se constitui no estudo das estruturas matemáticas que são fundamentalmente discretas.

A Matemática Discreta aplica-se a vários outros cursos como Sistemas Operacionais, banco de dados, estrutura de dados, algoritmos, compiladores, linguagens formais e autômatos, linguagem de programação, etc.

Ela é usada na lógica, indução matemática (provar a matemática), teoria dos conjuntos, grafos (representações algébricas) e árvores, análise combinatória, relações e funções, etc.

Na matemática não existe experimentação. Matemática é uma ciência dedutiva. Uma **teoria** (verdade absoluta) é apresentada por meio de provas de novos **teoremas** (hipóteses), e a validação se dá por meio da aceitação de outros matemáticos.

A força da matemática está na linguagem formal e no **rigor lógico** das demonstrações.

**Exemplo**: `5/8 = 5/x`

- **Resposta comum**: os denominadores são iguais, portanto `x=8`.

De acordo com essa resposta `a/b = a/c`, porém isso não está completamente certo pois se `a = 0` então a comparação também poderá ser verdadeira.

- **Resposta correta**: os numeradores são iguais e não nulos, portanto `x=8`.

## Definições

Uma afirmação pode ser verdadeira, portanto é um teorema, falsa, sabe-se provar que é falsa, ou conjectura, não se sabe provar se é falsa ou verdadeira.

> `|` significa divide, neste caso.

### Definição 1

Sendo `a` e `b`, `a|b` se existe um inteiro `x`, tal que `a * x = b`.

### Definição 2

Um inteiro `a` é par se `2|a`.

### Definição 3

Um inteiro `a` é ímpar se existem um inteiro `b` tal que `a = 2 * b + 1`.

### Definição 4

Um inteiro `a` é primo se `a > 1` e se os únicos divisores positivos de `a` são 1 e `a`.

## Linguagem Matemática

### Conectivo OU

> Se `n` é um inteiro par e se `n = a * b`, sendo `a` e `b` inteiros, então `a` é par ou `b` é par.

Essa afirmação está correta. Na linguagem matemática o operador OU é satisfeito por uma das possibilidades sendo verdadeira ou ambas sendo verdadeiras.

### Conectivo E

Com o conectivo E ambas as afirmações devem ser verdadeiras.

### Conectivo NÃO

Com o conectivo NÃO colocado na frente de uma afirmação significa a negação da afirmação.

### Conectivos Se...Então

> Se `a` e `b` são inteiros pares, então `a + b` é par. Em outras palavras: Se `A`, então `B` (**A ⇒ B**) ou `A` implica `B`.

Essa afirmação é verdadeira, porém a soma de de dois inteiros ímpares também é um inteiro par.

`A` não é necessário para que `B` aconteça, mas em todos os casos de `A` resultaram em `B`.

A afirmação "`A` se e somente se `B`" é outra maneira de dizer que `A ⇒ B` e `B ⇒ A`. Pode ser representado por **A ⇔ B**.

## [Teoria dos Conjuntos](https://www.todamateria.com.br/teoria-dos-conjuntos/)

> Em conjuntos `|` e `;` significa tal que.

Um conjunto é uma coleção de objetos distintos, com uma descrição precisa que permita decidir se um dado objeto está no conjunto.

- Definições e características
  - É adequada para descrever e explicar todas as estruturas matemáticas.
  - É uma reunião de objetos.
  - Ela constitui também a base matemática para a definição de **tipos de dados em computação**.
  - Cada objeto de um conjunto é chamado de **elemento**.
  - Par ordenado é relacionar os elementos impondo uma ordem.
  - Elementos são sempre separados por vírgulas (,).
  - Conjunto + Conjunto: está contido (`⊂`) ou não está contido (`⊄`).
  - Elemento + Conjunto: pertence (`∈`) ou não pertence (`∉`).
  - quando um conjunto é representado assim, `N*`, o número *zero* é excluído do conjunto.

Os conjuntos podem ser descritos de duas formas: **listando seus elementos** ou **descrevendo seus elementos por uma propriedade**.

Um objeto de um conjunto é um **elemento** desse conjunto. Se `x` é um elemento do conjunto `A` então **x pertence a A**, ou em notação **x ∈ A**. Se **x não pertence a A** usa-se a notação **x ∉ A**.

Se todo elemento de um conjunto `A` também pertence a um conjunto `B` então **A está contido em B** ou **A é um subconjunto de B** que significa a mesma coisa e é representado como **A ⊂ B**, ou **B contém A** que é representado em notação como **B ⊃ A**. Os conjuntos `A` e `B` são iguais se têm exatamente os mesmos elementos, então **A = B**. O único conjunto sem elementos é o conjunto denotado por **∅** ou **{}** que significa conjunto nulo.

### Exemplos

- `0 ∈ N`
- `0 ∉ { N, Q }`
- `N ∈ { N, Q }`
- `{N} ⊂ { N, Q }`
- `{0} ∈ { 0, *{0}* }`
- `{0} ⊂ { *0*, {0} }`
- `A = { -1, 0, 1 }`
- `Z = { ..., -2, -1, 0, 1, 2, ... }` (listagem de elementos)
- `Q = { x ∈ R | x = p/q, p ∈ Z, q ∈ Z* e mdc(p,q) = 1 }` (descrição por propriedade)

### Cardinalidade

Cardinalidade é a quantidade de elementos em um determinado conjunto.

- **Notação**: `|A|` ou cardA.
- `|{ 0, 1, 2, 3 }| = 4`
- `|Z| = infinita (∞)`
- `|{ Q, R, Z }| = 3`
- `|∅| = 0`
- `|{∅}| = 1`

### Conjunto Vazio

- É representado pela letra grega fi (`∅`) ou por `{}`.
- Está em todos os conjuntos porém não é contado na cardinalidade.
- `∅ ⊂ A`
- Todos os elementos do *conjunto vazio* estão em `A`.
- Como `∅` não possui elementos, todos os "elementos" de `∅` estão em `A`. Portanto a condição está "vaziamente satisfeita".

## Relações

### Produto Cartesiano

**Definição 1:** dados dois conjuntos, *E* e *F*, não vazios, chama-se produto cartesiano de E e F o conjunto formado por pares ordenados `(x, y)`, com `x` em *E* e `y` em *F*.

Costuma-se indicar o produto cartesiano de *E* e *F* em notação é `E x F`, significa "*E* cartesiano *F*".

Assim temos `E x F = {(x,y) / x ∈ E e y ∈ F}`.

> `ExF ≠ FxE`

> `|ExF| = |E| x |F|`

### Relação Binária

`R` é a relação entre os conjuntos `E = {0, 1, 2, 3, ...}` e `F = {..., -3, -2, -1}`. `R` é um conjunto de pares ordenados, onde o primeiro termo pertence a `E` e o segundo termo pertence a `F`.

- `R = {(x,y) / x + y = 0}`
- `x ∈ E e y ∈ F`.
- *E* é o conjunto de partida.
- *F* é o conjunto de chegada.
- Para todo par ordenado `p(a,b) ∈ ExF`, a proposição `p(a,b)` é verdadeira ou falsa.

Quando `p(a,b)` é verdadeira, então "`a` está relacionado com `b` mediante `R`". Quando `p(a,b)` é falsa, então "`a` não está relacionado com `b` mediante `R`".

Por exemplo, se `R` indica a relação em que o conjunto de partida e o conjunto de chegada são iguais a `IR` e a **função proposicional** é `x² + y = 0`, então: `1R(-1), (-3)R(-9), 0R0`.

**Definição 2:** chama-se relação binária de *E* em *F* todo subconjunto de `ExF`. Uma relação `R` existe se, e somente se, `R ⊂ (ExF)`. `R` é um conjunto de pares ordenados pertencentes a `ExF`.

Para indicar `(a,b) ∈ R` usa-se `aRb`, que significa, "`a` relaciona-se com `b` segundo `R`".

### Representações

Relação onde *E* (conjunto de partida) e *F* (conjunto de chegada) são subconjuntos de `IR`, sendo, no **gráfico cartesiano**, as abcissas o primeiro termo e as ordenadas o segundo.

![Relação Gráfico](https://i.imgur.com/6Xbj7uG.jpg)

Quando *E* e *F* são conjuntos finitos, pode-se representar a relação entre *E* e *F* por meio do diagrama de Venn por uma flecha com origem `x` e extremidade `y`.

![Relação Flechas](https://i.imgur.com/UlRhJSL.jpg)

### Domínio Imagem

Seja `R` uma relação de *E* e *F*.

**Conjunto domínio** é aquele que exerce a relação. Domínio de `R` é o conjunto de todos os primeiros elementos de um par ordenado.

**Conjunto imagem** é aquele que sofreu a relação. Imagem de `R` é o conjunto de todos os últimos elementos de um par ordenado.

**Conjunto contradomínio** é o conjusto oposto ao domínio. Contradomínio de `R` é o conjunto *F*.

### Tipos de Relações (Propriedades)

- **Reflexiva**: *E* é reflexiva quando todo elemento de *E* relaciona-se com ele mesmo. `x ∈ E; xRx`.
- **Simétrica**: *E* é simétrica quando todo elemento se relaciona com o outro e vice e versa. `xRy e yRx`.
- **Transitiva**: `xRy e yRz → xRz`.

## Indução Matemática

> A somatória funciona como uma escada.

**Teorema**: seja `P(n)`uma proposição associada a cada inteiro positivo `n` e que satizfaz as duas seguintes condições:
1. `P(1)` é verdadeira.
2. Para todo inteiro `k`, se `P(k)` é verdadeira, então `P(k+1)` também é. Nestas condições a proposição `P(n)` é verdadeira para todo inteiro `n`.

### Princípio da Indução Finita (P.I.F)

> Finita em relação as proposições.

**Teorema**: seja `S` um subconjunto do conjunto `N` dos inteiros positivos (`S ⊂ N`) que satizfaz as duas seguintes propriedades:
1. `1 ∈ S`
2. `∀ k ∈ N`, se `k ∈ S`, então `(k+1) ∈ S`. Nessas condições, `S` é o conjunto `N` dos inteiros positivos. `S = N`.

## Funções

Função é um tipo de relação onde cada elemento do conjunto domínio tem apenas um corresponde no conjunto contradimínio.

Todos os elementos do conjunto domímio devem ser utilizados para caracterizar uma função, mas nem todos os elementos do conjunto
contradomínio precisam estar relacionados.

**Representação**:
- `f : A → B`
- `f(x) = x²`
- `x = y`

![Função](https://i.imgur.com/hUQFGEP.jpg)

### Tipos de Funções

> Se det(A) ≠ de 0 existe a sua inversa.

> Funcão binominal: `ax² + bx + c`.

**Injetora**: quando um elemento do conjunto imagem possui somente um correspondente no conjunto domínio. `∀ x ≠ y ∈  Dom, ∃ f(x) ≠ f(y)`

**Sobrejetora**: quando o conjunto imagem é igual ao conjunto contradomínio. `∀ y ∈  ContraDom, ∃x ∃ Dom, cuja f(x) = y`

**Bijetora**: junção dos dois tipos acima.

## Função Inversa

Uma função só é inversa se ela for bijetora.

**Representação**:
- `f⁻¹ : B → A`
- `f⁻¹(b) = a` quando `f(a) = b`
- `x² = f(x)`
- `y = x`

## Função Composta

Uma função composta é quando o domínio de uma função é a imagem de outra.

- `(f o g)(a) = f(g(a))`
- `f o g = f(g(x))`

## Estruturas algebrigas
> Homomofismo

`(IK, °)`

## Operacao fechada

## Grupos
### Legenda
- `°`: operacao
- `a'`: oposto
- `0`: elemento neutro
- `IK`: conjunto qualquer

### Propriedades
- `a ° b = b ° a`: comutativa
- `a (b ° c) = (a ° b) c`: associativa
- `a ° 0 = 0 ° a = a`: elemento neutro
- `a ° a' = a' ° a = 0`: simetrizavel
