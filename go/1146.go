// Funcional no beecrowd
package main

import (
	"fmt"
)

func main() {
	var n int;
	fmt.Scan(&n);
	for n != 0 {
		for i := 1; i <= n; i++ {
			if i == 1 {
				fmt.Print(1)
			} else {
				fmt.Printf(" %d", i)
			}
		}
		fmt.Print("\n")
		fmt.Scan(&n);
	}
	}
}
