// Funcional no beecrowd
package main

import (
	"fmt"
)

func main() {
	var id1 int
	var quant1 int
	var valor1 float32
	var id2 int
	var quant2 int
	var valor2 float32

	fmt.Scan(&id1)
	fmt.Scan(&quant1)
	fmt.Scan(&valor1)
	fmt.Scan(&id2)
	fmt.Scan(&quant2)
	fmt.Scan(&valor2)

	fmt.Printf("VALOR A PAGAR: R$ %.2f\n", float32(float32(quant1)*valor1+float32(quant2)*valor2))
}
