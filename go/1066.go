// Funcional no beecrowd
package main

import (
	"fmt"
)

func main() {
	par := 0
	imp := 0
	pos := 0
	neg := 0
	n := 0

	for i := 0; i < 5; i++ {
		fmt.Scan(&n)
		if n > 0 {
			pos++
		} else if n < 0 {
			neg++
		}

		if n%2 == 0 {
			par++
		} else {
			imp++
		}
	}

	fmt.Println(par, "valor(es) par(es)")
	fmt.Println(imp, "valor(es) impar(es)")
	fmt.Println(pos, "valor(es) positivo(s)")
	fmt.Println(neg, "valor(es) negativo(s)")
}
