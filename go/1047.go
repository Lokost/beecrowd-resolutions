// Em revisão!
package main

import (
	"fmt"
)

func main() {
	var A int
	var B int
	var C int
	var D int

	fmt.Scan(&A)
	fmt.Scan(&B)
	fmt.Scan(&C)
	fmt.Scan(&D)

	H := 0
	M := 0

	if A < C {
		H = C - A
	} else if A > C {
		H = (24 - A) + C
	} else if A == C {
		H = 0
	}

	if B < D {
		M = D - B
	} else if B > D {
		H--
		M = (60 - B) + D
	} else if B == D {
		M = 0
	}

	fmt.Printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", H, M)
}
