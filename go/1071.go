// Funcional no beecrowd
package main

import (
	"fmt"
)

func main() {
	x := 0
	y := 0
	fmt.Scan(&x)
	fmt.Scan(&y)

	soma := 0
	a := 0
	b := 0

	if x > y {
		a = x
		b = y + 1
	} else {
		a = y
		b = x + 1
	}

	for b < a {
		if b%2 == 1 {
			soma += b
		}
		b++
	}

	fmt.Println(soma)
}
