package main

import (
	"fmt"
)

func main() {
	var a string
	var b string
	var c string

	fmt.Scan(&a)
	fmt.Scan(&b)
	fmt.Scan(&c)

	switch a {
	case "vertebrado":
		switch b {
		case "ave":
			switch c {
			case "carnivoro":
				fmt.Println("aguia")
				break

			case "onivoro":
				fmt.Println("pomba")
				break
			}
			break

		case "mamifero":
			switch c {
			case "onivoro":
				fmt.Println("homem")
				break
			case "herbivoro":
				fmt.Println("vaca")
			}
		}
	case "invertebrado":
		switch b {
		case "inseto":
			switch c {
			case "hematofago":
				fmt.Println("pulga")
			case "herbivoro":
				fmt.Printf("lagarta")
			}
		case "anelideo":
			switch c {
			case "hematofago":
				fmt.Println("sanguessuga")
			case "onivoro":
				fmt.Println("minhoca")
			}
		}
	}
}
