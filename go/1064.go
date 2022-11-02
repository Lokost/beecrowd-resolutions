// Funcional no beecrowd
package main

import (
	"fmt"
)

func main() {
	posi := 0
	soma := 0.0

	for i := 0; i < 6; i++ {
		var n float64
		fmt.Scan(&n)
		if n >= 0 {
			posi++
			soma += n
		}
	}

	fmt.Printf("%d valores positivos\n%.1f\n", posi, soma/float64(posi))
}
