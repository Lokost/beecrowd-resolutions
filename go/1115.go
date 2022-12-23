package main

import (
	"fmt"
)

func main() {
	var x int
	var y int
	fmt.Scan(&x)
	fmt.Scan(&y)

	for x != 0 && y != 0 {
		if x > 0 && y > 0 {
			fmt.Println("primeiro")
		} else if x < 0 && y > 0 {
			fmt.Println("segundo")
		} else if x < 0 && y < 0 {
			fmt.Println("terceiro")
		} else if x > 0 && y < 0 {
			fmt.Println("quarto")
		}

		fmt.Scan(&x)
		fmt.Scan(&y)
	}
}
