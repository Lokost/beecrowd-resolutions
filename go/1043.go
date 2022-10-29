// Funcional no beecrowd
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

	ba := math.Abs(B - C)

	if ba < A && A < (B+C) && (A-C) < B && B < (A+C) && (A-B) < C && C < (A+B) {
		fmt.Printf("Perimetro = %.1f\n", (A + B + C))
	} else {
		fmt.Printf("Area = %.1f\n", (((A + B) / 2) * C))
	}
}
