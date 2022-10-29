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

	D := (B * B) - 4*A*C

	if D < 0 || A == 0 {
		fmt.Println("Impossivel calcular")
	} else {
		R1 := (-B + math.Sqrt(D)) / (2 * A)
		R2 := (-B - math.Sqrt(D)) / (2 * A)
		fmt.Printf("R1 = %.5f\n", R1)
		fmt.Printf("R2 = %.5f\n", R2)
	}
}
