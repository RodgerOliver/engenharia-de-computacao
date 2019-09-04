# include <stdio.h>
# include <stdlib.h>
# include <string.h>

int main(int argc, char *argv[]) {

	struct Disciplina {
		char professor[50];
		float nota;
		int dificuldade;
	};

	// struct é um tipo dado novo
	// definição
	struct Aluno {
		char letra;
		char nome[50];
		// char disciplina[30];
		struct Disciplina matematica;
		float nota_geral;
	};

	// definição da variável
	struct Aluno aluno; // struct Aluno aluno = {'a', "Unitau"};

	// ===== LEITURA
	printf("Digite seu nome: ");
	scanf("%s", aluno.nome);
	printf("Digite o nome do professor de matematica: ");
	scanf("%s", aluno.matematica.professor);

	// ===== ESCRITA
	aluno.letra = 'A'; // aluno.nome = "Unitau" ERRADOOOO
	// strcpy(aluno.nome, "Unitau"); // CORRETO
	aluno.nota_geral = 10;

	// ===== SAÍDA
	printf("aluno.letra:              %c\n", aluno.letra);
	printf("aluno.nome :              %s\n", aluno.nome);
	printf("aluno.materia.professor : %s\n", aluno.matematica.professor);
	printf("aluno.nota_geral:         %0.2f\n", aluno.nota_geral);

	printf("\n====================\n\n");

	struct Livro {
		char titulo[30];
		int reg_num;
	};

	struct Grupo {
		struct Livro dicionario;
		struct Livro literatura;
	};

	struct Grupo grupo1 = {
		{"Aurelio", 134},
		{"Iracema", 321}
	};

	printf("livro.dicionario.titulo:  %s\n", grupo1.dicionario.titulo);
	printf("livro.dicionario.reg_num: %d\n", grupo1.dicionario.reg_num);
	printf("livro.literatura.titulo:  %s\n", grupo1.literatura.titulo);
	printf("livro.literatura.reg_num: %d\n", grupo1.literatura.reg_num);

	printf("\n====================\n\n");

	struct Vetor {
		int valor;
		int arr[5];
	};

	// arrays como structs
	struct Vetor v[5];

	v[0].valor = 1;
	v[0].arr[0] = 10;

	printf("v[0].valor:   %i\n", v[0].valor);
	printf("v[0].arr[0]:  %i\n", v[0].arr[0]);

	printf("\n====================\n\n");

	struct Ponteiro {
		int valor;
		int arr[5];
		int *point;
	};

	// ponteiros como structs
	struct Ponteiro point, *p;

	p = &point;

	point.valor = 1000;
	printf("point.valor:  %i\n", point.valor);

	p->valor = 1111;
	printf("p->valor:     %i\n", p->valor);

	printf("\n====================\n\n");

	// ===== LISTA LIGADA
	// __________
	// |     |   |
	// |valor|pai|
	// |_____|___|
	// ________     ________     ________
	// |  x01  |    |  x02  |    |  x03  |
	// |001|x00| <- |002|x01| <- |003|x02|
	// |___|___|    |___|___|    |___|___|
	// ____________
	// |     |     |
	// |valor|filho|
	// |_____|_____|
	// ________     ________     ________
	// |  x01  |    |  x02  |    |  x03  |
	// |001|x02| -> |002|x03| -> |003|x04|
	// |___|___|    |___|___|    |___|___|
	//
	// FILA  - remover do início, adicionar no final
	// PILHA - remover do início, adicionar no início

	struct Node {
		int valor;
		struct Node *next;
	};

	struct Node *inicio, *atual, *anterior, *novo;

	// modelo para malloc
	// mallloc solicita memoria
	novo = (struct Node *) malloc(sizeof(struct Node));

	// primeiro link
	int valor = 1;
	novo->valor = valor;
	novo->next = NULL;

	// onde é o inicio
	inicio = novo;
	printf("INICIO:       %p\n", inicio);
	printf("INICIO VALOR: %d\n", inicio->valor);
	printf("\n====================\n\n");

	// criar a lista
	atual = novo;
	while(valor < 6){
		novo = (struct Node *) malloc(sizeof(struct Node));
		atual->next = novo;
		novo->valor = valor + 1;

		printf("ATUAL:       %p\n", atual);
		printf("ATUAL VALOR: %i\n", atual->valor);
		printf("ATUAL NEXT:  %p\n", atual->next);
		printf("====================\n");

		atual = novo;
		valor++;
	}

	printf("ULTIMO        %p\n", atual);
	printf("ULTIMO VALOR: %i\n", atual->valor);
	printf("ULTIMO NEXT:  %p\n", atual->next);
	printf("\n====================\n\n");

	// percorrer a lista
	atual = inicio;
	while(atual != NULL){
		printf("VALOR: %i		", atual->valor);
		printf("NEXT:  %p\n", atual->next);
		atual = atual->next;
	}
	printf("\n====================\n\n");

	// ações em uma lista ligada
	char valor_procura = 5;
	if(inicio != NULL) {
		atual = inicio;
		while(atual != NULL){
			// procurar
			if(atual->valor == valor_procura) {
				printf("Valor 5 encontrado em %p\n", atual);
			}
			// inserir antes
			if(atual->valor == 2) {
				novo = (struct Node *) malloc(sizeof(struct Node));
				novo->next = atual;
				novo->valor = 216;
				anterior->next = novo;
				printf("Inserção do valor %d antes de %d\n", novo->valor, atual->valor);
			}
			// inserir depois
			if(atual->valor == 6) {
				novo = (struct Node *) malloc(sizeof(struct Node));
				novo->next = atual->next;
				novo->valor = 612;
				atual->next = novo;
				printf("Inserção do valor %d depois de %d\n", novo->valor, atual->valor);
			}
			// deleção
			if(atual->valor == 4) {
				anterior->next = atual->next;
				free(atual);
			}
			anterior = atual;
			atual = atual->next;
		}
	}
	printf("\n====================\n\n");

	// percorrer a lista
	atual = inicio;
	while(atual != NULL){
		printf("VALOR: %i		", atual->valor);
		printf("NEXT:  %p\n", atual->next);
		atual = atual->next;
	}

	// ===== UNION =====
	union Char_int {
		char letra1;
		char letra2;
		int valor;
	};

	union Char_int x;
	x.valor = 3;

	// ===== ENUM =====
	enum Dias {
		dom, seg, ter, quar, quin, sex, sab
			//0   1    2    3     4     5    6
	};

	enum Dias dias_semana;

	// ===== EXAMPLE =====
	struct Clubes {
		char xadrez: 1;
		char damas: 1;
	};

	struct Clubes clube[16000];

	// ===== TYPEDEF =====
	// alias
	typedef char BYTE;

	BYTE byte1 = 'A';

	struct One {
		int v;
		char l;
	};

	typedef struct One OneDef;
	OneDef one;

	printf("\n====================\n\n");

	one.v = 2;
	printf("%i %c\n", one.v, byte1);

	// ===== TERMINAL AGRS =====
	// argc = qnt de argumentos
	// argv = argumentos

	printf("\n====================\n\n");

	for(int i = 0; i < argc; i++) {
		printf("%s ", argv[i]);
	}

	/*
	 * ===== ARQUIVOS =====
	 *
	 * CARACTER
	 * getc()
	 * putc()
	 *
	 * FORMATADA
	 * fscanf()
	 * fprintf()
	 *
	 * STRING
	 * fgets() - leitura de linha completa (adiciona `\n\0` no final)
	 * fputs()
	 *
	 * REGISTRO
	 * fread()
	 * fwrite()
	 *
	 * BAIXO NÍVEL
	 * read()
	 * write()
	 * BYTES
	 *
	 * stdin() - teclado
	 * stdout() - vídeo
	 *
	 */

	// Copy content of a file to another
	printf("\n====================\n\n");
	FILE *source_file, *dest_file;
	int ch;

	if(argc != 3) {
		fprintf(stdout, "uso: fcopy source dest");
		exit(EXIT_FAILURE);
	}

	if((source_file = fopen(argv[1], "rb")) == NULL) {
		fprintf(stdout, "ERRO AO ABRIR O ARQUIVO %s\n", argv[1]);
		exit(EXIT_FAILURE);
	}

	// "w" sobreescreve e cria se o arquivo não existe
	if((dest_file = fopen(argv[2], "wb")) == NULL) {
		fprintf(stdout, "ERRO AO CRIAR E ESCREVER NO ARQUIVO %s\n", argv[2]);
		exit(EXIT_FAILURE);
	}

	while((ch = getc(source_file)) != EOF) {
		putc(ch, dest_file);
	}

	fclose(source_file);
	fclose(dest_file);

	// ===== BLOCK I/O =====

	return 0;
}
