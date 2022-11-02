package main

import (
	"fmt"
)

func main() {
	pos := 0
	for i := 0; i < 6; i++ {
		var n float64
		fmt.Scan(&n)
		if n >= 0 {
			pos++
		}
	}
	fmt.Printf("%d valores positivos\n", pos)
}
