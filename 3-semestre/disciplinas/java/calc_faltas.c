#include <stdio.h>
#include <stdlib.h>

float calc_faltas(int carga_horaria);

int main() {

	char disciplina[255];
	int carga_horaria; // quantidade em horas

	printf("Informe o nome da disciplina: ");
	scanf("%s", disciplina);

	printf("Informe a carga horária da disciplina: ");
	scanf("%i", &carga_horaria);

	float faltas_horas      = calc_faltas(carga_horaria);
	printf("\nFaltas permitidas na disciplina \"%s\": %0.2fh\n", disciplina, faltas_horas);

	return 0;
}

float calc_faltas(int carga_horaria) {

	float faltas = carga_horaria * 25 / 100;

	return faltas;

}
