// Funcional no beecrowd
package main

import (
	"fmt"
	"math"
)

func main() {
	var n int
	fmt.Scan(&n)

	for i := 1; i <= n; i++ {
		if i%2 == 0 {
			fmt.Printf("%d^2 = %.0f\n", i, math.Pow(float64(i), 2))
		}
	}
}
