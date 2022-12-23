package main

import (
	"fmt"
)

func main() {
	op := 1
	var n float64
	var soma float64

	for op != 2 {
		soma = 0.0
		if op == 1 {
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
		fmt.Println("novo calculo (1-sim 2-nao)")
		fmt.Scan(&op)
	}
}
