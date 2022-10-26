// Funcional no beecrowd!
package main

import (
	"fmt"
	"math"
)

func main() {
	pi := 3.14159
	var r float64
	fmt.Scan(&r)
	area := 4.0 / 3.0 * pi * math.Pow(r, 3.0)

	fmt.Printf("VOLUME = %.3f\n", area)
}
