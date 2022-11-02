package main

import (
	"fmt"
)

func main() {
	var ddd int

	fmt.Scan(&ddd)

	switch ddd {
	case 61:
		fmt.Println("Brasilia")
		break
	case 71:
		fmt.Println("Salvador")
		break
	case 11:
		fmt.Println("Sao Paulo")
		break
	case 21:
		fmt.Println("Rio de Janeiro")
		break
	case 32:
		fmt.Println("Juiz de Fora")
		break
	case 19:
		fmt.Println("Campunas")
		break
	case 27:
		fmt.Println("Vitoria")
		break
	case 31:
		fmt.Println("Belo Horizonte")
		break
	default:
		fmt.Println("DDD nao cadastrado")
		break
	}
}
