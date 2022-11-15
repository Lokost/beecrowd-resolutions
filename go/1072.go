// Funcional no beecrowd
package main

import (
	"fmt"
)

func main() {
	var N int

	fmt.Scan(&N)

	dentro := 0
	fora := 0

	for i := 1; i <= N; i++ {
		var X int
		fmt.Scan(&X)
		if 10 <= X && X <= 20 {
			dentro++
		} else {
			fora++
		}
	}

	fmt.Printf("%d in\n", dentro)
	fmt.Printf("%d out\n", fora)
}
