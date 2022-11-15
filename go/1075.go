package main

import (
	"fmt"
)

func main() {
	var a int
	fmt.Scan(&a)

	for i := 1; i <= 10000; i++ {
		if i%a == 2 {
			fmt.Println(i)
		}
	}
}
