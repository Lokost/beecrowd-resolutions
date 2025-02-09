// Funcional no beecrowd
package main

import (
	"fmt"
)

func main() {
	var n int
	var mult = 1
	fmt.Scan(&n)

	for n >= 1 {
		mult *= n
		n--
	}

	fmt.Println(mult)
}
