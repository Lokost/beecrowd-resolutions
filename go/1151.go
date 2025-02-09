// Funcional no beecrowd
package main

import (
	"fmt"
)

func main() {
	var n int
	var ax int
	var ay = 1
	var sum int

	fmt.Scan(&n)

	if n >= 0 {
		fmt.Print(ax)
	}
	for i := 1; i < n; i++ {
		sum = ax + ay
		fmt.Printf(" %d", ay)
		ax = ay
		ay = sum
	}
}
