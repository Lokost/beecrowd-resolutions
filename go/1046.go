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

	H := 0

	if A >= 0 && B >= 0 && A <= 24 && B <= 24 {
		if A > B {
			H = 24 - A + B
		} else if A < B {
			H = B - A
		} else if A == B {
			H = 24
		}
	}

	fmt.Println("O JOGO DUROU", H, "HORA(S)")
}
