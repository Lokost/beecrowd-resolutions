// Funcional no beecrowd!
package main

import (
	"fmt"
	"math"
)

func main() {
	n := 3.14159
	var r float64
	fmt.Scan(&r)
	area := math.Pow(r, 2.0) * n
	fmt.Printf("A=%.4f\n", area)
}
