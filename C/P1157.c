#include <stdio.h>
#include <string.h>

int main() {
	char input[1000002];
	int a[26]={0,};
	fgets(input, 1000000, stdin);
	int index = strlen(input);

	for (int i = 0; i < index; i++) {
		if (input[i] >= 'a') {
			a[input[i] - 'a']++;
		}
		else {

			a[input[i] - 'A']++;
		}
	}

	int max = a[0];
	int maxa=0;
	int isSame=0;

	for (int i = 1; i < 26; i++) {

		if (max <= a[i]) {

			if (max == a[i]&&a[i]!=0) {
				isSame = 1;
			}
			else {
				max = a[i];
				maxa = i;
				isSame = 0;
			}
		}

	}

	if (isSame) {
		printf("?");
	}
	else {
		printf("%c", maxa + 'A');
	}

}