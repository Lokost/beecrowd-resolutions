package main

import (
	"fmt"
)

func main() {
	n := 0
	fmt.Scan(&n)

	i := 0

	for i < 6 {
		if n%2 == 1 {
			i++
			fmt.Println(n)
		}
		n += 1
	}
}
