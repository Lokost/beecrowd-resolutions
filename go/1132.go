// Funcional no beecrowd
package main

import (
	"fmt"
)

func main() {
	var x int
	var y int
	soma := 0
	maior := 0
	menor := 0

	fmt.Scan(&x)
	fmt.Scan(&y)

	if x > y {
		maior = x
		menor = y
	} else {
		maior = y
		menor = x
	}

	for i := menor; i <= maior; i++ {
		if i%13 != 0 {
			soma += i
		}
	}

	fmt.Println(soma)
}
