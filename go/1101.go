package main

import (
	"fmt"
)

func main() {
	m := 1
	n := 1
	for m > 0 && n > 0 {
		fmt.Scan(&m)
		fmt.Scan(&n)

		maior := 0
		menor := 0
		soma := 0

		if m > 0 && n > 0 {
			if m > n {
				menor = n
				maior = m
			} else {
				menor = m
				maior = n
			}

			for menor <= maior {
				fmt.Printf("%d ", menor)
				soma += menor
				menor++
			}
			fmt.Printf("Sum=%d\n", soma)
		}
	}
}
