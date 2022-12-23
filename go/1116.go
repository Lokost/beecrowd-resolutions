// Funcional no beecrowd!
package main

import (
	"fmt"
)

func main() {
	var n int
	fmt.Scan(&n)
	var div float64
	var x float64
	var y float64

	for i := 1; i <= n; i++ {
		fmt.Scan(&x)
		fmt.Scan(&y)

		if y == 0 {
			fmt.Println("divisao impossivel")
		} else {
			div = x / y
			fmt.Printf("%.1f\n", div)
		}
	}
}
