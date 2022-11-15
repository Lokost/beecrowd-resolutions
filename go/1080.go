package main

import (
	"fmt"
)

func main() {
	maior := 0
	p := 0

	for i := 1; i <= 100; i++ {
		var n int
		fmt.Scan(&n)
		if n > maior {
			maior = n
			p = i
		}
	}

	fmt.Println(maior)
	fmt.Println(p)
}
