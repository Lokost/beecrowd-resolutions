// Funcional no beecrowd
package main

import (
	"fmt"
)

func main() {

	i := 1
	j := 60

	for j >= 0 {
		fmt.Printf("I=%d J=%d\n", i, j)
		i += 3
		j -= 5
	}
}
