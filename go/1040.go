package main

import (
	"fmt"
)

func main() {
	var n1 float64
	var n2 float64
	var n3 float64
	var n4 float64
	var y float64

	fmt.Scan(&n1)
	fmt.Scan(&n2)
	fmt.Scan(&n3)
	fmt.Scan(&n4)

	m := (n1*2.0 + n2*3.0 + n3*4.0 + n4) / 10
	fmt.Printf("Media: %.1f\n", m)

	if m >= 7.0 {
		fmt.Println("Aluno aprovado.")
	} else if m < 5.0 {
		fmt.Println("Aluno reprovado.")
	} else {
		fmt.Println("Aluno em exame.")
		fmt.Scan(&y)
		fmt.Printf("Nota do exame: %.0f\n", y)
		m2 := (y + m) / 2.0
		if m2 >= 5.0 {
			fmt.Println("Aluno aprovado.")
			fmt.Printf("Media final: %.1f\n", m2)
		} else {
			fmt.Println("Aluno reprovado.")
			fmt.Printf("Media final: %.1f\n", m2)
		}
	}
}
