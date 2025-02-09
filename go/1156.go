// Funcional no Beecrowd
package main

import (
	"fmt"
)

func main() {
	S := 1.0
	A := 1.0
	B := 1.0

	for A <= 39 {
		A += 2.0
		B *= 2.0
		S += A / B
	}

	fmt.Printf("%.2f\n", S)
}
