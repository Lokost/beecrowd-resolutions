// Funcional no beecrowd
package main

import (
	"fmt"
)

func main() {
	var n int
	fmt.Scan(&n)

	for i := 0; i < n; i++ {
		var a float64
		var b float64
		var c float64

		fmt.Scan(&a)
		fmt.Scan(&b)
		fmt.Scan(&c)

		media := float64((a*2.0 + b*3.0 + c*5) / 10)
		fmt.Printf("%.1f\n", media)
	}
}
