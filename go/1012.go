package main

import (
	"fmt"
)

func main() {
	var a float64
	var b float64
	var c float64

	fmt.Scan(&a)
	fmt.Scan(&b)
	fmt.Scan(&c)

	tri := a * c / 2
	cir := c * c * 3.14159
	tra := c / 2 * (a + b)
	qua := b * b
	ret := a * b

	fmt.Printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f\n", tri, cir, tra, qua, ret)
}
