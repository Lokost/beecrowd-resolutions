package main

//Funcional no beecrowd!
import (
	"fmt"
	"math"
)

func main() {
	var segundos int
	fmt.Scan(&segundos)
	hora := int(math.Pow(60, 2))
	minuto := 60

	horas := int(segundos / hora)
	segundos -= horas * hora
	minutos := int(segundos / minuto)
	segundos -= minutos * minuto

	fmt.Printf("%d:%d:%d\n", horas, minutos, segundos)

}
