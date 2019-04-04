---
redirect_from: "/1-semestre/topicos-em-ti/"
---

# [Home](/engenharia-da-computacao/)

# Tópicos em TI - Prof. Walter

## Excel Crash Course (Spreadsheets)

Uma folha de cálculo (spreadsheet) permite organizar dados em tabelas de uma forma dinâmica, manipular vários dados e efetuar cálculos com eles, automatizando cálculos complexos.

### Apresentação

- <Enter> em uma célula passa foco para a célula de baixo.
- <Tab> passa o foco para a célula do lado.
- Existem dois campos de edição, o editor em cima, e o resultado que é a célula.
- Ao clicar em uma célula com conteúdo e escrever, seu conteúdo será sobrescrito. Para editá-lo vá na barra de edição de cima.
- Clique duas vezes no meio da coluna para ajustá-la ao tamanho do texto.
- Selecionar colunas e clicar com o botão direito retorna algumas opções como: esconder coluna, eliminar e limpar conteúdo.
- As mesmas opções para colunas estão presentes para as linhas.

### Formatação Básica de Células

> Para formatar as células, todas devem estar selecionadas. Todas as opções de formatação estão na barra superior.

- Adicionar contorno.
- Alterar tamanho, tipo e estilo da fonte.
- Moldar texto a coluna.
- Unir e mesclar.
- Formatar dados (geral, número, moeda, data, ...).
- Formatar tabela (estilo).

### Formatação de Dados

- Opções disponíveis ao selecionar uma ou mais células, clicar com o botão direito e selecionar formatar células

### Proteção de Células, Folhas e Planilhas (Read-Only)

- Todas as células já estão protegidas
- Desative a proteção em um conjunto de células pela formatação de células.
- Na aba superior selecione Rever e Proteger Folha.

### Formatação Condicional

- Selecione as células desejadas.
- Selecione Formatação Condicional.
- Selecionar Mais Regras para obter todas as opções.

### Fórmulas

- Para criar uma fórmula o texto da célula deve ser iniciado com o símbolo igual (`=`).
- Para referenciar uma célula basta clicar nela ou escrever sua localização.
- Referência Relativa
  - `= A1 + B1`
- Referência Absoluta
  - `= $A$1 + $B$1`
- Referência Absoluta entre Planilhas
  - `= Folha1!A1 + B1`
- Adicione o cifrão para representar uma referência absoluta.
- Se a referência for relativa, ao arrastar a célula para baixo ou para os lados, as referências seguirão os valores ao lado ou acima.
- Para nomear uma célula selecione-a, clique na sua localização e escreva um nome.
- Para verificar todas as células nomeadas vá na barra superior, selecione Fórmulas e Gestor de Nomes.

### Funções

- Funções são otimizadoras de trabalho no Excel e são elas que fazem ele ser uma ótima ferramenta. As funções mais usadas estão listadas abaixo.
- `SOMA()`, `MEDIA()`, `MINIMO()`, `MAXIMO()`, `CONTAR()`, `CONTAR.SE()`, `SE()`, `E()`, `OU()`, `PROCV()`, `PROCH()`.
- Os parâmetros dentro das funções são separados por ponto e vírgula (
`;`).
- Dentro das funções os parâmetros são escritos em linguagem matemática.
- Tudo que não for localização de células deve estar entre parênteses (`""`).

### Gráficos

- Selecione os dados desejados que devem estar no gŕafico.
- Na aba superior selecione Inserir e procure um gráfico que melhor se encaixa com os dados selecionados.
- Após ter criado o gráfico ele pode ser editado pela aba Estrutura.
- Outros elementos podem ser adicionados no gráfico selecionando Adicionar Elemento de Gráfico.
- Selecione colunas do gráfico para alterá-las clicando em Formatar Seleção na barra superior.

### Lista de Dados

- Listas de dados contém os tipos de valores na primeira linha e opcionalmente outro "guia" como uma coluna.
- Listas de dados devem ser corretamente formatadas para que não haja futuros erros na filtragem.
- Na barra superior selecione Dados para obter ferramentas para trabalhar com a tabela, tais como Filtrar, Ordenar e Validação de Dados.
- Para que não haja problemas dados com ou sem acento usa-se a Validação de Dados, assim os valores que podem estar nas células selecionadas estão em uma lista pré estabelecida.

### Tabelas Dinâmicas

- Tabelas dinâmicas são usadas para extrair determinados dados de uma tabela pronta.
- Para criar uma tabela dinâmica na barra superior selecione Inserir e clique em Tabela Dinâmica.
- Para editá-la basta arrastar os Campos desejados para as Áreas abaixo deles.
- Para editar o que eśtá sendo feito nos campos, clique com o botão direito em uma célula do campo e selecione Definições do  Campo de Valor.
- Ao clicar duas vezes em uma célula de uma tabela dinâmica será mostrado informações mais detalhadas sobre aquele campo.