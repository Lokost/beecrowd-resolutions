// Funcional no beecrowd
package main

import (
	"fmt"
)

func main() {
	var horas float64
	var velocidade float64

	fmt.Scan(&horas)
	fmt.Scan(&velocidade)

	litros := velocidade * horas / 12.0

	fmt.Printf("%.3f\n", litros)
}
