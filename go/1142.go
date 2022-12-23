// Funcional no beecrowd!
package main

import (
	"fmt"
)

func main() {
	var n int
	pum := 1

	fmt.Scan(&n)

	for i := 0; i < n; i++ {
		for j := 1; j <= 3; j++ {
			fmt.Printf("%d ", pum)
			pum++
		}
		fmt.Printf("PUM\n")
		pum++
	}
}

// Código feito por Gabriel Gomes 2022
