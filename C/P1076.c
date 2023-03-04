#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
	long long int val[] = { 1,10,100,1000,10000,100000,1000000,10000000,100000000,1000000000 };
	long long int f_result;


	char result[3];
	char input[10];
	for (int i = 0; i < 2; i++) {
		scanf("%s", &input);
		char a;
		switch (input[0])
		{
		case 'b':
			if (input[2] == 'a') {
				a = '0';
			}
			else if (input[2] == 'o') {
				a = '1';
			}
			else {
				a = '6';
			}
			break;

		case 'r':
			a = '2';
			break;

		case 'o':
			a = '3';
			break;

		case 'y':
			a = '4';
			break;

		case 'g':
			if (input[3] == 'e') {
				a = '5';
			}
			else {
				a = '8';
			}
			break;

		case 'v':
			a = '7';
			break;

		case 'w':
			a = '9';
			break;

		default:
			break;
		}
		
		result[i] = a;

	}
	f_result = atoll(result);
	//printf("%d", f_result);
	scanf("%s", &input);
	long long int a;
	switch (input[0])
	{
	case 'b':
		if (input[2] == 'a') {
			a = val[0];
		}
		else if (input[2] == 'o') {
			a = val[1];
		}
		else {
			a = val[6];
		}
		break;

	case 'r':
		a = val[2];
		break;

	case 'o':
		a = val[3];
		break;

	case 'y':
		a = val[4];
		break;

	case 'g':
		if (input[3] == 'e') {
			a = val[5];
		}
		else {
			a = val[8];
		}
		break;

	case 'v':
		a = val[7];
		break;

	case 'w':
		a = val[9];
		break;

	default:
		break;
	}
	printf("%lld", f_result * a);
}