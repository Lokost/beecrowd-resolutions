// Funcional no beecrowd
package main

import (
	"fmt"
)

func main() {
	j := 7
	for i := 1; i <= 9; i += 2 {
		for a := 0; a < 3; a++ {
			fmt.Printf("I=%d J=%d\n", i, j)
			j--
		}
		j += 5
	}
}
