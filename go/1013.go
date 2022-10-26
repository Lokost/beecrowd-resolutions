// Funcional no beecrowd
package main

import (
	"fmt"
	"math"
)

func main() {
	var a float64
	var b float64
	var c float64

	fmt.Scan(&a)
	fmt.Scan(&b)
	fmt.Scan(&c)

	ab := (a + b + math.Abs(a-b)) / 2
	abc := (ab + c + math.Abs(ab-c)) / 2
	fmt.Println(abc, "eh o maior")
}
