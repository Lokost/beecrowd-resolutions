// Funcional no beecrowd!
package main

import (
	"fmt"
)

func main() {
	var s int
	fmt.Scan(&s)

	for true {
		if s == 2002 {
			fmt.Println("Acesso Permitido")
			break
		} else {
			fmt.Println("Senha Invalida")
			fmt.Scan(&s)
		}
	}
}
