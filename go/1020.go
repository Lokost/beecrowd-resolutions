package main

import (
	"fmt"
)

func main() {
	var dias int
	fmt.Scan(&dias)
	ano := 365
	mes := 30

	anos := int(dias / ano)
	dias -= anos * ano
	meses := int(dias / mes)
	dias -= meses * mes

	fmt.Printf("%d ano(s)\n%d mes(es)\n%d dia(s)", anos, meses, dias)
}
