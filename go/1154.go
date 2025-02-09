// Funcional no beecrowd
package main

import (
	"fmt"
)

func main() {
	var x int
	var count int
	var sum int

	fmt.Scan(&x)

	for x > 0 {
		count++
		sum += x
		fmt.Scan(&x)
	}

	media := float64(sum) / float64(count)
	fmt.Printf("%.2f\n", media)
}
