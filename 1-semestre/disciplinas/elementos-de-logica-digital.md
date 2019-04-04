---
redirect_from: "/1-semestre/elementos-de-logica-digital/"
---

# [Home](/engenharia-da-computacao/)

# Elementos de Lógica Digital - Prof. Walter

## Dados e Informação

Um **dado** não possui um significado relevante, já a **informação** é a ordenação e organização dos dados.

**Exemplo**: *3* é um dado, *3kg* é uma informação.

## [Sistemas de Numeração](http://www.dainf.cefetpr.br/~robson/prof/aulas/common/bases.htm)

O sistema de numeração é um conjunto de regras para representar os números. Os mais comuns são o **sistema binário**, **sistema decimal** e o **sistema hexadecimal** respectivamente de **Base 2**, **Base 10** e **Base 16**.

Para entender o funcionamento de um sistema com microprocessador é necessário saber como um dado é armazenado e como uma instrução é codificada e processada.

O sistema decimal é comum para usos do cotidiano porém não é recomendado para a computação pelo fato de que a informação teria que ser expressa em dez maneiras diferentes.

Para um circuito elétrico é conveniente a apresentação de uma informação em apenas dois estados lógicos diferentes, presença ou não de níveis de tensão.

### Sistema Binário

É composto por dois algarismos, **0 e 1**. O nível lógico *1* representa um nível de tensão "Vcc" e o nível lógico *0* representa um nível de tensão nulo para um circuito digital.

Cada dígito é conhecido como **BIT** (Binary Digit) e um grupo de 8  BITs é conhecido como **BYTE**.

Os microprocessadores são classificados como 4, 8, 16 e 32 BITs em função do comprimento dos códigos das instruções utilizadas por estes circuitos.

#### Operações Aritméticas

##### Soma

**Transporte = 0 (vem 0 vai 0)**

- `0+0 = 0`
- `1+0 = 1`
- `0+1 = 1`
- `1+1 = 0 (transporte = 1)`

**Transporte = 1 (vem 1 vai 1)**

- `0+0 = 1 (transporte = 0)`
- `1+0 = 0`
- `0+1 = 0`
- `1+1 = 1`

##### Subtração

**Transporte = 0 (vem 0 vai 0)**

- `0-0 = 0`
- `0-1 = 1 (transporte = -1)`
- `1-0 = 1`
- `1-1 = 0`

**Transporte = -1 (vem -1 vai -1)**

- `0-0 = 1`
- `0-1 = 0`
- `1-0 = 0 (transporte = 0)`
- `1-1 = 1`

##### Multiplicação

##### Divisão

#### Representação de Números Inteiros

Maneiras de representar números inteiro no âmbito dos computadores digitais. Para estas representações utiliza-se o sistema binário e um número limitado de dígitos para cada dado numérico, sendo este representado pela letra `N`.

##### Sinal-Módulo (SM)

Nesse sistema de representação o bit que está mais à esquerda representa o sinal, sendo positivo se `0` e negativo se `1`. Os bits restantes (`N-1`) represetam o módulo do número.

Exemplos, representação dos números *10* e *-10* com limitação de 8 BITs (`N=8`).

- `x aaa baba = num`
- `x = sinal; aaa baba = módulo`
- `10 = 0 000 1010`
- `-10 = 1 000 1010`

#### Complemento de 1 (C-1)

Nesse sistema a representação é bem similar ao SM, porém para representar o números negativo é necessário obter o simétrico do correspondente número positivo através do **complemento de todos os seus dígitos**, ou seja, os números negativos são o oposto dos números positivos.

Exemplos, representação dos números *10* e *-10* com limitação de 8 BITs (`N=8`).

- `10 = 0 000 1010`
- `-10 = 1 111 0101`

#### Complemento de 2 (C-2)

Este sistema é similar ao SM e ao C-1, mas para representar o números negativo é necessário obter o simétrico do correspondente número positivo e adicionar *1* ao resultado (soma binária), desprezando o último transporte.

Exemplos, representação dos números *10* e *-10* com limitação de 8 BITs (`N=8`).

- `10 = 0 000 1010`
- `1 111 0101` (C-1)
- `1 111 0110 = -10` (soma binária de 1 e despreza o transporte)

#### Excesso de 2 Elevado a (N-1)

Nesse sistema nenhum bit é utilizado como sinal, assim todos os bits representam o valor. Essa valor corresponde ao múmero representado mais um excesso de 2 elevado a `N-1`. Por exemplo, para 8 bits o excesso é `2⁸⁻¹ = 128`.

Exemplos, representação dos números *10* e *-10* com limitação de 8 BITs (`N=8`).

- `10 = 10 + 128 = 138 = 1000 1010`
- `-10 = -10 + 128 = 118 = 0111 0110` <!-- PQ NAO DEU 0110 1110? -->

Nota-se que o número representado em Excesso de 2 é igual ao seu correspondente no sistema Complemento de 2, mas com o primeiro dígito trocado.

#### Soma em Complemento de 1

Na aritmética do Complemento de 1, dois números são somados da mesma forma que na representação binária, com uma diferença, se no final da conta houver o transporte de `1`, esse `1` será somado ao resultado.

#### Soma em Complemento de 2

Na aritmética do Complemento de 2 o processo é semelhante, porém despreza-se o último transporte.

#### Erro de Estouro (Overflow)

No **C-1** e **C-2** ocorre erro de estouro quando ao somar dois números com sinais iguais o resultado tem sinal oposto. Assim o número não será representado, caracterizando uma condição de overflow.

### Sistema Hexadecimal

O sistema binário é conveniente para ser empregado em circuitos elétricos, porém trouxe o inconveniente de necessitar de uma grande quantidade de dígitos para expressar um número.

Por exemplo, um programa para um microprocessador de 8 BITs é composto por uma série de instruções de 8 dígitos.

O sistema hexadecimal é composto por dezesseis algarismos que são: **0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F**.

Cada grupo de **4 dígitos do sistema binário** corresponde a **1 dígito do sistema hexadecimal**.

O sistema binário corresponde diretamente aos sinais em cada ponto do circuito, e o hexadecimal é uma condensação do sistema binário, o que facilita a leitura e a escrita dos números, torna a tarefa de programação mais simples e possibilita a conversão dígito a dígito, direta para o sistema binário.

### Conversão

![Potenciação](https://i.imgur.com/Z2Ovl1c.jpg)

- a = base
- n = expoente
- b = potência

#### Base 2 para Base 10

1 | 1 | 0 | 1
--|--|--|--
2³ | 2² | 2¹ | 2⁰
1 x 2³ | 1 x 2² | 0 x 2¹ | 1 x 2⁰
8 | 4 | 0 | 1
Soma | | | 13

A mesma lógica é usada para transformar outras bases. O **número do expoente** é sempre relacionado a **Base final**, se a Base final é 10, então o expoente segue a base 10. O **número da base** é sempre relacionado com a **Base original**, se a Base original é 2 então o número base sempre será 2.

#### Base 10 para Base 2

![Conversão de decimal para binário](https://i.imgur.com/bWf5Brc.jpg)

O princípio é o mesmo para as outras Bases. **Divide-se o número original pelo número da Base final**, o resultado é dividido novamente pelo número da Base final. Quando o resultado da divisão for `0`, pega-se os restos de todas as divisões de trás para frente e então é formado o número na Base final.

#### Base 10 para Base 2 (Método de Substituição das Potências de 2)

Neste método é feita a subtração do número quem está na Base 10 por `2^n`, sendo `2^n` o valor mais próximo possível do número decimal. Quando a subtração resultar em `0`, os as bases de 2 que foram utilizadas são representadas como `1` no resultado final, as que não foram são representadas como `0`.

**Exemplo**

- `531	-	2⁹ = 19`
- `19		-	2⁴ = 3`
- `3		-	2¹ = 1`
- `1		-	2⁰ = 0`
- `Base10(531) = Base2(1000010011)`

#### Base 10 com Vírgula para Base 2

Conversão do número `11,5625`.

- Dividir o número em parte inteira e parte decimal.
  - `11 + 0,5625`
- Converter a parte inteira.
  - `Base10(11) = Base2(1011)`
- Converter a parte decimal.

Para **converter a parte decimal** primeiro ela é **multiplicada por 2**, se no produto a **parte decimal** for `0` a conversão terminou. Se não continua-se a multiplicação por **2**. Se a **parte inteira** for `1` ela deve ser substituída por `0`, se não continua-se a multiplicação.

O resultado será a parte inteira dos produtos na ordem das multiplicações.

0, | 5 | 6 | 2 | 5
-- |-- |-- |-- |--
x  |   |   |   | 2
-  | - | - | - | -
**1**, | 1 | 2 | 5 | 0

0, | 1 | 2 | 5 | 0
-- |-- |-- |-- |--
x  |   |   |   | 2
-  | - | - | - | -
**0**, | 2 | 5 | 0 | 0

0, | 2 | 5 | 0 | 0
-- |-- |-- |-- |--
x  |   |   |   | 2
-  | - | - | - | -
**0**, | 5 | 0 | 0 | 0

0, | 5 | 0 | 0 | 0
-- |-- |-- |-- |--
x  |   |   |   | 2
-  | - | - | - | -
**1**, | 0 | 0 | 0 | 0

- Converter a parte decimal.
  - `Base10(0,5625) = Base2(1001)`
- Representação.
  - `Base10(11,5625) = Base2(1011) Base2(1001)`

#### Base 2 com Vírgula para Base 10

Conversão do número `1011,1001`.

- A parte **antes da vírgula** possui **expoente positivo** e a parte **depois da vírgula** possui **expoente negativo**.
- Faz-se a conversão simples da parte inteira e da parte decimal do número.
- Parte inteira = `Base10(11)`.
- Parte decimal = `Base10(9/16) = 0,5625`.

#### Base 2 para Base 16 (Método de Separação por Nibble)

![Método Nibble](https://i.imgur.com/zzy5LOc.jpg)

#### Base 2 para Base 8 (Método de Serapação por Triplo)

![Método Triplo](https://i.imgur.com/hATdRHd.jpg)

#### Base 2 para Base 4 (Método de Serapação por Duplo)

O mesmo princípio se aplica para este método.

### Representação de Dados

#### Precisão Finita da Informação

Como o computador utiliza o sistema binário para representar dados, a quantidade de bits que representa um número real é limitada, fazendo com que os números reais sofram truncamento (limitação do número de dígitos à direita da vírgula decimal) na parte fracionária. Pequenos erros podem ocorrer também na representação de binários fracionários (ponto flutuante).

a quantidade de bits que representa um número ou uma informação é chama de **palavra**. O tamanho da palavra está relacionado com a quantidade de bits que o computador pode transportar.

#### Ponto Fixo (Fixed Point)

O ponto fixo é utilizado exclusivamente para a representação de números inteiros, com a vírgula explícita à direita do dígito final.

Existem 3 maneiras de representar os números de ponto fixo.

##### Binário Puro

Nesta forma os números são representados conforme o tópico [Representação de Números Inteiros](#representação-de-números-inteiros).

##### Decimal Não Compactado

Nessa forma de representação um número é armazenado com um byte (8 bits) para cada um de seus algarismos. Cada byte é dividido em dois quartetos. O **quarteto da esquerda** contém 1s, denominados **bits de zona**, e o **quarteto da direita** possui o algarismo em BCD (Binary Code Decimal), que são denominados de **bits de dígito**. O quarteto da esquerda do último dígito possui representa o sinal e pode conter `1100` se positivo, e `1101` se negativo.

##### Decimal Compactado

Essa forma de representação é semelhante a Decimal Não Compacto, porém **não existe os bits de zona**, restando somente 4 bits para armazenar os algarismos do número. Para representar o sinal, o quarteto da direita é usado, com a mesma forma de representação do método Decimal Não Compactado, `1100` sendo positivo e `1101` sendo negativo.

#### Ponto Flutuante (Floating Point)

O ponto flutuante possui uma maior amplitude para representar números, porém ocorre uma diminuição de precisão dos números representados.

Nesta representação utiliza-se a representação matemática: `Nº = Mantissa x (Base Exponencial) ^ Expoente`

Neste método utiliza-se a forma normalizada, na qual a **mantissa não possui parte inteira**, e o primeiro dígito à direita da vírgula (nesta representação trocada por um ponto) é significativo (diferente de *0*), exceto na representação do zero.

**Exemplo:** `844.4 = 0.8444 x 10³`

- **Expoente:** é um número inteiro, representado nas notações SM ou Excesso de 2.
- **Mantissa:** é um número real (R), com vírgula implícita a esquerda, representada em SM, C-1 ou C-2.
- **Base Exponencial:** chamada de radical, é uma potência de 2 determinada pelo fabricante do sistema.

## Unidades de Armazenamento

![Storage Units](https://i.imgur.com/J6utqDF.jpg)
