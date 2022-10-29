// Funcional no beecrowd!
package main

import (
	"fmt"
)

func main() {
	var A int
	var B int
	var C int
	var D int

	fmt.Scan(&A)
	fmt.Scan(&B)
	fmt.Scan(&C)
	fmt.Scan(&D)

	AB := A + B
	CD := C + D

	if B > C && D > A && AB < CD && C > 0 && D > 0 && A%2 == 0 {
		fmt.Println("Valores aceitos")
	} else {
		fmt.Println("Valores nao aceitos")
	}

}
