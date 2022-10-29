// Funcional no beecrowd
package main

import (
	"fmt"
)

func main() {
	var A int
	var B int

	fmt.Scan(&A)
	fmt.Scan(&B)

	if A%B == 0 || B%A == 0 {
		fmt.Println("Sao Multiplos")
	} else {
		fmt.Println("Nao sao Multiplos")
	}
}
