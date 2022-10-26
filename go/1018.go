// Funcional no beecrowd
package main

import (
	"fmt"
)

func main() {
	var valor int
	fmt.Scan(&valor)
	dinheiro := valor

	n100 := int(dinheiro / 100)
	dinheiro -= n100 * 100
	n50 := int(dinheiro / 50)
	dinheiro -= n50 * 50
	n20 := int(dinheiro / 20)
	dinheiro -= n20 * 20
	n10 := int(dinheiro / 10)
	dinheiro -= n10 * 10
	n5 := int(dinheiro / 5)
	dinheiro -= n5 * 5
	n2 := int(dinheiro / 2)
	dinheiro -= n2 * 2

	fmt.Printf("%d\n%d nota(s) de R$ 100,00\n%d nota(s) de R$ 50,00\n%d nota(s) de R$ 20,00\n%d nota(s) de R$ 10,00\n%d nota(s) de R$ 5,00\n%d nota(s) de R$ 2,00\n%d nota(s) de R$ 1,00\n", valor, n100, n50, n20, n10, n5, n2, dinheiro)
}
