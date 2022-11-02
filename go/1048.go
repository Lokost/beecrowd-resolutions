// Funcional no beecrowd
package main

import (
	"fmt"
)

func main() {
	var a float64

	fmt.Scan(&a)

	var r float64
	var ns float64
	var p int

	if 0 <= a && a <= 400 {
		r = (a / 100) * 15
		ns = a + r
		p = 15
	} else if a <= 800 {
		r = (a / 100) * 12
		ns = a + r
		p = 12
	} else if a <= 1200 {
		r = (a / 100) * 10
		ns = a + r
		p = 10
	} else if a <= 2000 {
		r = (a / 100) * 7
		ns = a + r
		p = 7
	} else {
		r = (a / 100) * 4
		ns = a + r
		p = 4
	}

	fmt.Printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: %d %%\n", ns, r, p)
}
