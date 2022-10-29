package main

import (
	"fmt"
)

func main() {
	var A int
	var B int
	var C float64

	fmt.Scan(&A)
	fmt.Scan(&B)

	switch A {
	case 1:
		C = float64(B) * 4.00
		break
	case 2:
		C = float64(B) * 4.50
		break
	case 3:
		C = float64(B) * 5.00
		break
	case 4:
		C = float64(B) * 2.00
		break
	case 5:
		C = float64(B) * 1.5
		break
	}

	fmt.Printf("Total: R$ %.2f\n", C)
}
