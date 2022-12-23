// Funcional no beecrowd
package main

import (
	"fmt"
)

func main() {
	var x int
	var y int
	menor := 0
	maior := 0

	fmt.Scan(&x)
	fmt.Scan(&y)

	if x > y {
		maior = x
		menor = y
	} else {
		maior = y
		menor = x
	}

	for i := menor + 1; i < maior; i++ {
		if i%5 == 2 || i%5 == 3 {
			fmt.Println(i)
		}
	}
}

// Código feito por Gabriel Gomes 2022
