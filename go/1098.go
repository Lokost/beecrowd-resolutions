// Ainda não funcional no beecrowd
// Em revisão!

package main

import (
	"fmt"
)

func main() {
	j := 1.0

	for i := 0.0; i <= 2.0; i += 0.2 {
		j = 1 + i
		for a := 1; a < 4; a++ {
			if i == 0.0 || i == 1.0 || i > 1.8 {
				fmt.Printf("I=%.0f J=%.0f\n", i, j)
			} else {
				fmt.Printf("I=%.1f J%.1f\n", i, j)
			}
			j++
		}
	}
}
