// Funcional no beecrowd
package main

import (
	"fmt"
)

func main() {
	var X float64
	var Y float64

	fmt.Scan(&X)
	fmt.Scan(&Y)

	if X == 0 && 0 != Y {
		fmt.Println("Eixo Y")
	} else if X != 0 && Y == 0 {
		fmt.Println("Eixo X")
	} else if X > 0 && Y > 0 {
		fmt.Println("Q1")
	} else if X < 0 && Y > 0 {
		fmt.Println("Q2")
	} else if X < 0 && Y < 0 {
		fmt.Println("Q3")
	} else if X > 0 && Y < 0 {
		fmt.Println("Q4")
	} else {
		fmt.Println("Origem")
	}
}
