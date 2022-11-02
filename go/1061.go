// Funcional no beecrowd
package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func main() {

	// Inicializador do Scanner
	in := bufio.NewScanner(os.Stdin)

	// Leitura de linhas
	in.Scan()
	d1 := in.Text()
	in.Scan()
	h1 := in.Text()
	in.Scan()
	d2 := in.Text()
	in.Scan()
	h2 := in.Text()

	// Separação das strings
	di := strings.Split(d1, " ")
	hi := strings.Split(h1, ":")
	df := strings.Split(d2, " ")
	hf := strings.Split(h2, ":")

	// Conversão de valores de string para inteiro
	var horaI []int
	var horaF []int

	diaI, _ := strconv.Atoi(di[1])
	diaF, _ := strconv.Atoi(df[1])

	for _, i := range hi {
		valor, _ := strconv.Atoi(strings.TrimSpace(i))
		horaI = append(horaI, valor)
	}

	for _, i := range hf {
		valor, _ := strconv.Atoi(strings.TrimSpace(i))
		horaF = append(horaF, valor)
	}

	// Valores iniciais de minuto hora e dia em segundos
	min := 60
	hor := 60 * 60
	dia := 60 * 60 * 24

	// Soma dos valores e transformação em segundos
	i := horaI[2] + horaI[1]*min + horaI[0]*hor + diaI*dia
	f := horaF[2] + horaF[1]*min + horaF[0]*hor + diaF*dia

	// Cálculo de valores para respectivos valores de Dia, Minuto, Hora e Segundo do restante
	if i < f {
		T := f - i
		d := int(T / dia)
		T = T % dia
		H := int(T / hor)
		T = T % hor
		M := int(T / min)
		T = T % min
		S := T
		fmt.Printf("%d dia(s)\n%d hora(s)\n%d minuto(s)\n%d segundo(s)\n", d, H, M, S)
	}
}
