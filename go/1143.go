// Funcional no beecrowd!
package main

import (
	"fmt"
)

func main() {
	var n int
	x := 1

	fmt.Scan(&n)

	for x <= n {
		qua := x * x
		cubo := x * x * x
		fmt.Printf("%d %d %d\n", x, qua, cubo)
		x++
	}
}

// Código feito por Gabriel Gomes 2022
