// Funcional no beecrowd
package main

import (
	"fmt"
)

func main() {
	S := 1.0

	for i := 2.0; i <= 100.0; i++ {
		S += 1 / i
	}

	fmt.Printf("%.2f\n", S)
}
