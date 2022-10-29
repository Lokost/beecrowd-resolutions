// Funcional no beecrowd!
package main

import (
	"fmt"
)

func main() {
	var valor float64
	fmt.Scan(&valor)

	T := int(valor)
	Tm := int((valor - float64(T)) * 100)

	n100 := int(T / 100)
	T -= n100 * 100
	n50 := int(T / 50)
	T -= n50 * 50
	n20 := int(T / 20)
	T -= n20 * 20
	n10 := int(T / 10)
	T -= n10 * 10
	n5 := int(T / 5)
	T -= n5 * 5
	n2 := int(T / 2)
	T -= n2 * 2
	m1 := int(T)

	m05 := int(Tm / 50)
	Tm -= m05 * 50
	m025 := int(Tm / 25)
	Tm -= m025 * 25
	m010 := int(Tm / 10)
	Tm -= m010 * 10
	m005 := int(Tm / 5)
	Tm -= m005 * 5
	m001 := int(Tm)

	fmt.Println("NOTAS:")
	fmt.Println(n100, "nota(s) de R$ 100.00")
	fmt.Println(n50, "nota(s) de R$ 50.00")
	fmt.Println(n20, "nota(s) de R$ 20.00")
	fmt.Println(n10, "nota(s) de R$ 10.00")
	fmt.Println(n5, "nota(s) de R$ 5.00")
	fmt.Println(n2, "nota(s) de R$ 2.00")
	fmt.Println("MOEDAS:")
	fmt.Println(m1, "moeda(s) de R$ 1.00")
	fmt.Println(m05, "moeda(s) de R$ 0.50")
	fmt.Println(m025, "moeda(s) de R$ 0.25")
	fmt.Println(m010, "moeda(s) de R$ 0.10")
	fmt.Println(m005, "moeda(s) de R$ 0.05")
	fmt.Println(m001, "moeda(s) de R$ 0.01")
}
