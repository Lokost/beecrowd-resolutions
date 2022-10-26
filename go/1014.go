// Funcional no beecrowd
package main

import (
	"fmt"
)

func main() {
	var km float64
	var l float64

	fmt.Scan(&km)
	fmt.Scan(&l)

	uso := km / l

	fmt.Printf("%.3f km/l\n", uso)
}
