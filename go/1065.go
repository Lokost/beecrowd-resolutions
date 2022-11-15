// Funcional no beecrowd
package main

import (
	"fmt"
)

func main() {
	pares := 0

	for i := 0; i < 5; i++ {
		var n int
		fmt.Scan(&n)
		if n%2 == 0 {
			pares++
		}
	}
	fmt.Println(pares, "valores pares")
}
