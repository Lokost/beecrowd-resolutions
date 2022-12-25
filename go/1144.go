// Funcional no beecrowd!
package main

import (
	"fmt"
)

func main() {
	var n int
	fmt.Scan(&n)

	for i := 1; i <= n; i++ {
		j := i * i
		k := i * i * i
		fmt.Printf("%d %d %d\n", i, j, k)
		j++
		k++
		fmt.Printf("%d %d %d\n", i, j, k)
	}
}

// Código feito por Gabriel Gomes 2022
