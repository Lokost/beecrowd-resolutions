// Funcional no beecrowd
package main

import (
	"fmt"
)

func main() {
	var n int
	var hora int
	var sal float32
	fmt.Scan(&n)
	fmt.Scan(&hora)
	fmt.Scan(&sal)
	fmt.Printf("NUMBER = %d\nSALARY = U$ %.2f\n", n, float32(hora)*sal)
}
