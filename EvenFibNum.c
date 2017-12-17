#include <stdio.h>

int main (){
	long long fib[700];
	long long sum = 0;
	long long i = 0;
	fib[0] = 1;
	fib[1] = 2;
	for (i = 2; i < 600; i++){
		fib[i] = fib[i - 1] + fib[i - 2];
	}
	i = 0;
	while (fib[i] < 4000000){
		if (fib[i]%2 == 0){
			sum = sum + fib[i];
			i++;
		}else {
			i++;
		}
	}
	printf("sum <%d>\n", sum);
	return 0;
}
