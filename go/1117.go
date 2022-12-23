package main

import (
	"fmt"
)

func main() {
	var n float64
	var soma float64 = 0.0

	for i := 1; i <= 2; {
		fmt.Scan(&n)
		if n >= 0 && n <= 10 {
			soma += n
			i++
		} else {
			fmt.Println("nota invalida")
		}
	}

	media := soma / 2
	fmt.Printf("media = %.2f\n", media)
}
