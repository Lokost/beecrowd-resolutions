// Em revisão!!!!
package main

import (
	"fmt"
	"math"
)

func main() {
	var A float64
	var B float64
	var C float64

	fmt.Scan(&A)
	fmt.Scan(&B)
	fmt.Scan(&C)

	pont := math.Pow(B, 2) + math.Pow(C, 2)
	pont2 := math.Pow(A, 2)
	som := B + C

	if A >= som {
		fmt.Println("NAO E UM TRIANGULO")
	}

	if pont2 == pont {
		fmt.Println("TRIANGULO RETANGULO")
	} else if pont2 > pont {
		fmt.Println("TRIANGULO OBTUSANGULO")
	} else if pont2 < pont {
		fmt.Println("TRIANGULO ACUTANGULO")
	}

	if A == B && B == C {
		fmt.Println("TRIANGULO EQUILATERO")
	} else if A == B || B == C || C == A {
		fmt.Println("TRIANGULO ISOSCELES")
	}
}
