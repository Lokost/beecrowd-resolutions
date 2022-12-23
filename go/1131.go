// Funcional no beecrowd
package main

import (
	"fmt"
)

func main() {
	op := 1
	gremio := 0
	inter := 0
	grenal := 0
	g_inter := 0
	g_grem := 0
	empate := 0

	for op != 2 {
		if op == 1 {
			fmt.Scan(&g_inter)
			fmt.Scan(&g_grem)

			if g_inter > g_grem {
				inter++
			} else if g_grem > g_inter {
				gremio++
			} else {
				empate++
			}
			grenal++
		}
		fmt.Println("Novo grenal (1-sim 2-nao)")
		fmt.Scan(&op)
	}
	fmt.Printf("%d grenais\n", grenal)
	fmt.Printf("Inter:%d\n", inter)
	fmt.Printf("Gremio:%d\n", gremio)
	fmt.Printf("Empates:%d\n", empate)

	if inter < empate && gremio < empate {
		fmt.Println("Nao houve vencedor")
	} else if inter > gremio {
		fmt.Println("Inter venceu mais")
	} else if gremio > inter {
		fmt.Println("Gremio vencer mais")
	}
}
