// Funcional no beecrowd!
package main

import (
	"fmt"
)

func main() {
	var n1 float32
	var n2 float32
	fmt.Scan(&n1)
	fmt.Scan(&n2)
	media := (n1*3.5 + n2*7.5) / 11
	fmt.Printf("MEDIA = %.5f\n", media)
}
