// Funcional no beecrowd
package main

import (
	"fmt"
)

func main() {
	n := 0
	fmt.Scan(&n)

	for i := 1; i <= n; i++ {
		if i%2 == 1 {
			fmt.Println(i)
		}
	}
}
