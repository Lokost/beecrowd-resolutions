// Funcional no beecrowd!
package main

import (
	"fmt"
)

func main() {
	t := 0
	al := 0
	ga := 0
	di := 0

	for t != 4 {
		fmt.Scan(&t)
		switch t {
		case 1:
			al++
		case 2:
			ga++
		case 3:
			di++
		}
	}
	fmt.Println("MUITO OBRIGADO")
	fmt.Printf("Alcool: %d\n", al)
	fmt.Printf("Gasolina: %d\n", ga)
	fmt.Printf("Diesel: %d\n", di)
}

// Código feito por Gabriel Gomes 2022
