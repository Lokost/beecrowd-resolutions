// Funcional no beecrowd
package main

import (
	"fmt"
)

func main() {
	var x int
	var y int
	var sum int
	fmt.Scan(&x)
	for y <= 0 {
		fmt.Scan(&y)
	}
	for i := 1; i <= y; i++ {
		sum += x
		x++
	}
	fmt.Println(sum)
}
