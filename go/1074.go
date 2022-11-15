// Funcional no beecrowd
package main

import (
	"fmt"
)

func main() {
	var a int
	fmt.Scan(&a)

	for i := 0; i < a; i++ {
		var x int
		var f string
		var e string
		fmt.Scan(&x)

		if x < 0 {
			e = "NEGATIVE"
		} else if x == 0 {
			fmt.Println("NULL")
		} else {
			e = "POSITIVE"
		}

		if x%2 == 0 {
			f = "EVEN"
		} else {
			f = "ODD"
		}

		if x != 0 {
			fmt.Printf("%s %s\n", f, e)
		}
	}
}
