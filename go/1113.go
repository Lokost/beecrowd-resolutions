package main

import (
	"fmt"
)

func main() {
	var x int
	var y int

	fmt.Scan(&x)
	fmt.Scan(&y)

	for x != y {
		if x > y {
			fmt.Println("Decrescente")
		} else {
			fmt.Println("Crescente")
		}

		fmt.Scan(&x)
		fmt.Scan(&y)
	}
}
