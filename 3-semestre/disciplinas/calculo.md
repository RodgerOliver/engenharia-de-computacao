---
redirect_from: "/3-semestre/calculo/"
---

# [Home](/engenharia-de-computacao/)

# Cálculo Diferencial e Integral (Limites E Derivadas) - Profa. Ana

## Limites

### Noção Intuitiva de Limites

Tenha uma placa quadrada de ferro, com o valor de lado (_x_) próximo a 3cm, sobre uma fogueira. Conforme o tempo vai passa a placa se expande.
Cada vez mais que a placa se expande, o _x_ se aproxima de 3cm consequentemente sua área de aproxima de 9cm².

De forma matemática tem-se a função da área de um quadrado dado como: `f(x) = x²`.

![Limite Grafico 1](https://i.imgur.com/2KsSRrzm.png)

Quando o _x_ se aproxima de 3cm, a área (_x²_) se aproxima de 9cm² como um limite. Simbolicamente:

```
lim x² = 9
x → 3
```

A notação `x → 3` indica que _x_ tende a 3 e _lim_ significa "o limite de".

#### Exemplo

O negativo / positivo após o número significa que os valores tendem a _x_ pela esquerda / direita.

Quando ambos os valores tendem ao mesmo valor, o limite existe, do contrário o limite não existe.

**Importante:** quando trata-se de limite, o valor exato de _x_ não é importante, mas sim valores próximos a ele.

![Limite Tabela](https://i.imgur.com/3kDxQE0l.png)

![Limite Grafico 2](https://i.imgur.com/9B2L05Im.png)

### Definição Formal de Limite

#### Valor Absoluto (Módulo)

Geometricamente, o módulo de um numero é a distância entre dois pontos em uma reta.

```
|x - y| = z

Sendo x = -3 e y = 2

|-3 - 2|   = |-5| = 5
|2 - (-3)| = |5|  = 5
```

#### Controlando Uma Função

O objetivo de controlar uma função é manter os valores de _y_ em um determinado limite. Esse controle é feito pela variação dos valores de _x_, lembrando sempre dos limites propostos pelo _y_.

##### Exemplo

Quão próximo de `x0 = 5` devemos manter _x_ para que `f(x) = 2x` mantenha-se a uma distância menor que 2 unidades de `y0 = 10`.

![Limite Controlado](https://i.imgur.com/PDDO8gkm.png)

#### Analisando o Gráfico

> _ε_ é a letra Épsilon do alfabeto grego

> _δ_ é a letra Delta (_Δ_) minúscula do alfabeto grego

![Limite Definicao 1](https://i.imgur.com/nswnqYgl.png)

Se a distância do _x_ até o 4 for menor do que a distância _δ_, então a distância de `f(x)` até o 5 é menor que _ε_.

**Em notação matemática:**

```
Se 0 < |x - 4| < δ então
|f(x) - 5| < ε
```

#### Definição

_ε_ é a distância do _L_ para cima e para baixo, onde `f(x)` poderá estar. Ele deve ser sempre positivo, `ε > 0`.

_a_ é o valor para onde o limite tende.

_L_ é o limite da função `f(x)`.

Para qualquer valor de _x_ que esteja no intervalo de _δ_ e _a_, para a direita ou para a esquerda, `f(x)` estará no intervalo de _ε_ e _L_, para cima ou para baixo.

![Limite Definicao 2](https://i.imgur.com/Fepvj7A.png)
