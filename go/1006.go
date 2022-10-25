// Funcional no beecrowd!
package main

import (
	"fmt"
)

func main() {
	var n1 float32
	var n2 float32
	var n3 float32
	fmt.Scan(&n1)
	fmt.Scan(&n2)
	fmt.Scan(&n3)
	media := (n1*2 + n2*3 + n3*5) / 10
	fmt.Printf("MEDIA = %.1f\n", media)
}
