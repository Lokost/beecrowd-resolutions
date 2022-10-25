// O funcionamento de arredondamento dá um pequeno erro.
package main

import (
	"fmt"
)

func main() {
	var nome string
	var sal float32
	var vendas float32

	fmt.Scan(&nome)
	fmt.Scan(&sal)
	fmt.Scan(&vendas)

	fmt.Printf("TOTAL = R$ %.2f\n", float64(((vendas/100)*15)+sal))
}
