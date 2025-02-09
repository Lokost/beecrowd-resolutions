package main

import (
	"fmt"
)

func main() {
	var n int
	var b int
	var c int

	fmt.Scan(&n)

	for i := 0; i < n; i++ {
		fmt.Scan(&b)
		fmt.Scan(&c)

		d := b
		e := 0
		sum := 0

		for e != c {
			if d%2 != 0 {
				sum += d
				e++
			}
			d++
		}
		fmt.Printf("%d\n", sum)
	}
}
