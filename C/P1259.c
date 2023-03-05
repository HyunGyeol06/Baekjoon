#include <stdio.h>
#include <string.h>


void reverse(char* s);

int main() {
	int raw=1;

	char a[6];
	char b[6];

	while (1) {

		scanf("%d", &raw);
		if (!raw) break;
		sprintf(a, "%d", raw);
		strcpy(b,a);
		reverse(a);

		if (!strcmp(a,b))
			printf("yes\n");
		else
			printf("no\n");
	}
	
}

void reverse(char* s) {
	int size = strlen(s);
	char temp;

	for (int i = 0; i < size / 2; i++) {
		temp = s[i];
		s[i] = s[(size - 1) - i];
		s[(size - 1) - i] = temp;
	}
}