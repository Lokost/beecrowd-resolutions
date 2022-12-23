// Funcional no beecrowd
package main

import (
	"fmt"
)

func main() {
	var n int
	fmt.Scan(&n)
	var x int
	var y int
	var maior int
	var menor int
	var soma int

	for i := 1; i <= n; i++ {

		fmt.Scan(&x)
		fmt.Scan(&y)

		soma = 0

		if x > y {
			menor = y
			maior = x
		} else {
			menor = x
			maior = y
		}

		for menor < maior-1 {
			menor++
			if menor%2 != 0 {
				soma += menor
			}
		}
		fmt.Println(soma)
	}
}
