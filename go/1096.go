// Funcional no beecrowd
package main

import (
	"fmt"
)

func main() {
	i := 1
	var j int
	for i <= 9 {
		j = 7
		for a := 1; a <= 3; a++ {
			fmt.Printf("I=%d J=%d\n", i, j)
			j--
		}
		i += 2
	}
}
