package main

import (
	"fmt"
)

func main() {
	var mes int

	fmt.Scan(&mes)

	switch mes {
	case 1:
		fmt.Println("January")
		break
	case 2:
		fmt.Println("February")
		break
	case 3:
		fmt.Println("March")
		break
	case 4:
		fmt.Println("April")
		break
	case 5:
		fmt.Println("May")
		break
	case 6:
		fmt.Println("June")
		break
	case 7:
		fmt.Println("July")
		break
	case 8:
		fmt.Println("August")
		break
	case 9:
		fmt.Println("September")
		break
	case 10:
		fmt.Println("October")
		break
	case 11:
		fmt.Println("November")
		break
	case 12:
		fmt.Println("December")
		break
	}
}
