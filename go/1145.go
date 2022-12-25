// Funcional no beecrowd!
package main

import (
	"fmt"
)

func main() {
	var x int
	var y int
	i := 1

	fmt.Scan(&x)
	fmt.Scan(&y)

	if x > 1 && x < 20 && x < y && y < 1000000 {
		for i <= y {
			fmt.Print(i)
			i++

			for j := 1; j < x; j++ {
				if i <= y {
					fmt.Printf(" %d", i)
				}
				i++
			}
			fmt.Printf("\n")
		}
	}
}

// Código feito por Gabriel Gomes 2022
