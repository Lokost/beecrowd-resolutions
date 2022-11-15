// Funcional no beecrowd
package main

import (
	"fmt"
)

func main() {
	coelhos := 0
	ratos := 0
	sapos := 0
	soma := 0

	var n int
	fmt.Scan(&n)

	for i := 0; i < n; i++ {
		var x int
		var y string
		fmt.Scan(&x)
		fmt.Scan(&y)

		switch y {
		case "C":
			coelhos += x
			break
		case "R":
			ratos += x
			break
		case "S":
			sapos += x
			break
		}

		soma += x
	}

	percent := float64(100.0 / float64(soma))
	p_coelho := percent * float64(coelhos)
	p_rato := percent * float64(ratos)
	p_sapo := percent * float64(sapos)

	fmt.Printf("Total: %d cobaias\n", soma)
	fmt.Printf("Total de coelhos: %d\n", coelhos)
	fmt.Printf("Total de ratos: %d\n", ratos)
	fmt.Printf("Total de sapos: %d\n", sapos)
	fmt.Printf("Percentual de coelhos: %.2f %%\n", p_coelho)
	fmt.Printf("Percentual de ratos: %.2f %%\n", p_rato)
	fmt.Printf("Percentual de sapos: %.2f %%\n", p_sapo)
}
