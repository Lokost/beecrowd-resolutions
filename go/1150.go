// Funcional no beecrowd
package main

import (
	"fmt"
)

func main() {
	var x int
	var z int

	fmt.Scan(&x)
	fmt.Scan(&z)

	var sum = x
	var count = 1

	for x >= z {
		fmt.Scan(&z)
	}

	for sum < z {
		x++
		sum += x
		count++
	}

	fmt.Println(count)
}
