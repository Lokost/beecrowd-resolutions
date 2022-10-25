// Funcional no beecrowd
package main

import (
	"fmt"
)

func main() {
	var n1 int
	var n2 int
	var n3 int
	var n4 int
	fmt.Scan(&n1)
	fmt.Scan(&n2)
	fmt.Scan(&n3)
	fmt.Scan(&n4)

	diferenca := n1*n2 - n3*n4

	fmt.Printf("DIFERENCA = %d", diferenca)
}
