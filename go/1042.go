// Funcional no becrowd
// P.S.: Formato por ifs
package main

import (
	"fmt"
)

func main() {
	var A int
	var B int
	var C int

	fmt.Scan(&A)
	fmt.Scan(&B)
	fmt.Scan(&C)

	if A < B && B < C && A < C {
		fmt.Println(A)
		fmt.Println(B)
		fmt.Println(C)
	} else if A < B && A < C && C < B {
		fmt.Println(A)
		fmt.Println(C)
		fmt.Println(B)
	} else if B < A && A < C && B < C {
		fmt.Println(B)
		fmt.Println(A)
		fmt.Println(C)
	} else if B < C && C < A && B < A {
		fmt.Println(B)
		fmt.Println(C)
		fmt.Println(A)
	} else if C < A && A < B && C < B {
		fmt.Println(C)
		fmt.Println(A)
		fmt.Println(B)
	} else {
		fmt.Println(C)
		fmt.Println(B)
		fmt.Println(A)
	}

	fmt.Println("\nA\nB\nC")
}
