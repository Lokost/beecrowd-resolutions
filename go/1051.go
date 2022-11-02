// Funcional no beecrowd
package main

import (
	"fmt"
)

func main() {
	var sal float64

	fmt.Scan(&sal)

	if sal >= 0.0 && sal <= 2000.0 {
		fmt.Println("Isento")
	} else if sal <= 3000.0 {
		b := (sal - 2000.0) * .08
		fmt.Printf("R$ %.2f\n", b)
	} else if sal <= 4500.0 {
		b := ((sal - 3000) * .18) + 80
		fmt.Printf("R$ %.2f\n", b)
	} else if sal > 4500.0 {
		b := ((sal - 4500.0) * .28) + 350
		fmt.Printf("R$ %.2f\n", b)
	}
}
